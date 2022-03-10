/**
 * Klasse Spielsteuerung mit GUI
 * 
 * @author Dienst
 * @version 1.0 09.03.2022
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class Spielsteuerung extends EBAnwendung
{
    // Referenzen
    private Buntstift hatStift;
    private Uhr hatUhr;

    private Etikett hatEtikettAnzahl;
    private Textfeld hatTextfeldAnzahl;
    private Knopf hatKnopfSpiel;
    private Knopf hatKnopfAnimation;
    private Etikett hatEtikettSchrittzahlText;
    private Etikett hatEtikettSchrittzahl;
    private Etikett hatEtikettFertig;
    private Etikett hatEtikettFehler;
    private Etikett hatEtikettA, hatEtikettB, hatEtikettC;
    private Knopf hatKnopfReset;

    private Turm[] hatTurm;
    private Rechteck[] hatRechteck;

    // Attribute
    int zAnzahl, zSchrittzahl;
    int verschiebeVon, verschiebeNach;

    // Konstanten
    int WARTEZEIT = 500; // 500 ms

    // Konstruktor
    public Spielsteuerung()
    {
        //Initialisierung der Oberklasse
        super(1000, 500);

        // Referenzen
        hatStift = new Buntstift();
        //hatMaus = new Maus();
        //hatTastatur = new Tastatur();
        hatUhr = new Uhr();

        hatTurm = new Turm[3];
        hatTurm[0] = new Turm(200);
        hatTurm[1] = new Turm(450);
        hatTurm[2] = new Turm(700);

        hatRechteck = new Rechteck[3];
        for (int i=0; i<3; i++) hatRechteck[i] = new Rechteck(100+250*i);

        hatEtikettAnzahl = new Etikett(100, 80, 100, 25, "Anzahl der Scheiben:");
        hatEtikettAnzahl.setzeAusrichtung(Ausrichtung.RECHTS);

        hatTextfeldAnzahl = new Textfeld(210, 80, 50, 25, "3");
        hatTextfeldAnzahl.setzeAusrichtung(Ausrichtung.LINKS);

        hatKnopfSpiel = new Knopf(265, 80, 120, 25, "Starte Spiel!");
        hatKnopfSpiel.setzeBearbeiterGeklickt("starteSpiel");

        hatKnopfAnimation = new Knopf(265, 120, 120, 25, "Starte Animation!");
        hatKnopfAnimation.setzeBearbeiterGeklickt("starteAnimation");

        hatEtikettSchrittzahlText = new Etikett(465, 80, 100, 25, "Anzahl der Schrittzahl:");
        hatEtikettSchrittzahlText.setzeAusrichtung(Ausrichtung.LINKS);

        hatEtikettSchrittzahl = new Etikett(570, 80, 30, 25, "0");
        hatEtikettSchrittzahl.setzeAusrichtung(Ausrichtung.LINKS);

        hatEtikettFertig = new Etikett(100, 200, 150, 50, "");
        hatEtikettFertig.setzeSchriftgroesse(24);
        hatEtikettFertig.setzeSchriftstil(Schrift.FETT);
        hatEtikettFertig.setzeSchriftfarbe(Farbe.GRUEN);

        hatEtikettFehler = new Etikett(465, 120, 120, 35, "");
        hatEtikettFehler.setzeSchriftgroesse(14);
        hatEtikettFehler.setzeSchriftstil(Schrift.FETT);
        hatEtikettFehler.setzeSchriftfarbe(Farbe.ROT);

        hatKnopfReset = new Knopf(665, 80, 120, 25, "Reset");
        hatKnopfReset.setzeBearbeiterGeklickt("setzeZurueck");

        hatEtikettA = new Etikett(200, 460, 30, 30, "A");
        hatEtikettA.setzeSchriftgroesse(14);
        hatEtikettA.setzeSchriftstil(Schrift.FETT);
        hatEtikettB = new Etikett(450, 460, 30, 30, "B");
        hatEtikettB.setzeSchriftgroesse(14);
        hatEtikettB.setzeSchriftstil(Schrift.FETT);
        hatEtikettC = new Etikett(700, 460, 30, 30, "C");
        hatEtikettC.setzeSchriftgroesse(14);
        hatEtikettC.setzeSchriftstil(Schrift.FETT);

        // Attribute
        zSchrittzahl = 0;
        verschiebeVon = -1;
        verschiebeNach = -1;

        this.initialisiere();
    }

    private void initialisiere()
    {
        hatStift.setzeLinienbreite(3);
        hatStift.bewegeBis(100,450);
        hatStift.runter();
        hatStift.bewegeUm(200);
        hatStift.hoch();

        hatStift.bewegeUm(50);
        hatStift.runter();
        hatStift.bewegeUm(200);
        hatStift.hoch();

        hatStift.bewegeUm(50);
        hatStift.runter();
        hatStift.bewegeUm(200);
        hatStift.hoch();
    }

    public void starteSpiel()
    {
        if ( erstelleTurm() ) this.fuehreAus();
    }          

    public void starteAnimation()
    {
        this.setzeZurueck();
        if ( erstelleTurm() )
        {
            hatUhr.warte(1000);
            bewegeTurm(zAnzahl,0,1,2);
            hatEtikettFertig.setzeInhalt("YEAH!");
        }
    }

    public void setzeZurueck()
    {
        for (int i=0; i<3; i++) hatTurm[i].leere();
        zSchrittzahl = 0;
        hatEtikettSchrittzahl.setzeInhalt(zSchrittzahl);
    }

    private boolean erstelleTurm()
    {
        zAnzahl = (int)hatTextfeldAnzahl.inhaltAlsZahl();
        // Anzahl Scheiben prüfen
        if (zAnzahl>0 && zAnzahl<12)
        {
            for (int i=1; i<=zAnzahl; i++) hatTurm[0].legAuf( new Scheibe(i) );
            return true;
        }
        else return false;
    }

    private void bewegeTurm(int pAnzahl, int pVon, int pUeber, int pNach)
    {
        // Anweisungen
    }

    private void verschiebe(int pVon, int pNach)
    {
        // Anweisungen

        zSchrittzahl++;
        hatEtikettSchrittzahl.setzeInhalt(zSchrittzahl);
    }

    public void bearbeiteMausDruck(int pHPos, int pVPos)
    {
        if ( verschiebeVon ==-1)
        {
            for (int i=0; i<3; i++) if ( hatRechteck[i].getroffen( pHPos, pVPos ) ) verschiebeVon = i;
        }
        else
        {
            hatEtikettFehler.setzeInhalt("");
            for (int j=0; j<3; j++) if ( hatRechteck[j].getroffen( pHPos, pVPos ) ) verschiebeNach = j;
        }

        if (verschiebeVon>-1 && verschiebeNach>-1 )
        {
            if (verschiebeVon != verschiebeNach                  // Türme verschieden
                && !hatTurm[verschiebeVon].istLeer()             // Turm nicht leer
                && (hatTurm[verschiebeNach].istLeer() || hatTurm[verschiebeVon].oberste().nummer()
                 > hatTurm[verschiebeNach].oberste().nummer() )  // kleinere Scheibe auf größerer
               ) this.verschiebe(verschiebeVon,verschiebeNach);
            else hatEtikettFehler.setzeInhalt("FEHLER");

            verschiebeVon = -1;
            verschiebeNach = -1;
        }
    }    

    public void bearbeiteDoppelKlick(int pHPos, int pVPos)
    {
        this.beenden();
    }
}
