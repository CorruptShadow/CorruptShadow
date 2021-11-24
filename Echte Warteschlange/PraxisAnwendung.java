/**
 * Die Klasse PraxisAnwendung steuert das ganze Programm 
 * 
 * @author Dienst
 * @version 1.0 07.10.2021
 */

//import sum.kern.*;
import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class PraxisAnwendung extends EBAnwendung
{
    // Referenzen
    private Buntstift hatStift;

    private Patient hatErsterPatient;
    private Warteraum hatWarteraum;

    private Etikett hatEtikAnmeld;
    private Etikett hatEtikWarteraum;
    private Etikett hatEtikettName;
    private Etikett hatEtikettNaechsterPatient;
    private Textfeld hatTextName;
    private Knopf hatKnopfAnmelden;
    private Etikett hatEtikNameNaePat;
    private Knopf hatKnopfAufrufen;

    private Zeilenbereich hatZeilenbereich;
   
    private Rechner hatRechner;
    
    private Etikett[] hatEtikettPlatz;

    // Konstruktor
    public PraxisAnwendung()
    {
        // Initialisierung der Oberklasse
        super(1000, 500);
        hatRechner = new Rechner();

        hatStift = new Buntstift();
        hatWarteraum = new Warteraum();
        hatErsterPatient = null;

        hatStift.bewegeBis(530,80);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz[0] = new Etikett(531, 81, 49, 49, "Stuhl0");
        hatEtikettPlatz[0].setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(590,80);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz[1]= new Etikett(591, 81, 49, 49, "Stuhl1");
        hatEtikettPlatz[1].setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(650,80);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz[2] = new Etikett(651, 81, 49, 49, "Stuhl2");
        hatEtikettPlatz[2].setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(710,140);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz[3] = new Etikett(711, 141, 49, 49, "Stuhl3");
        hatEtikettPlatz[3].setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(710,200);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz[4] = new Etikett(711, 201, 49, 49, "Stuhl4");
        hatEtikettPlatz[4].setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(710,260);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz[5] = new Etikett(711, 261, 49, 49, "Stuhl5");
        hatEtikettPlatz[5].setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(710,320);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz[6] = new Etikett(711, 321, 49, 49, "Stuhl6");
        hatEtikettPlatz[6].setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(530,380);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz[7] = new Etikett(531, 381, 49, 49, "Stuhl7");
        hatEtikettPlatz[7].setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(590,380);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz[8] = new Etikett(591, 381, 49, 49, "Stuhl8");
        hatEtikettPlatz[8].setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(650,380);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz[9] = new Etikett(651, 381, 49, 49, "Stuhl9");
        hatEtikettPlatz[9].setzeAusrichtung(Ausrichtung.MITTE);
        
        
        hatEtikettName = new Etikett(70, 80, 100, 25, "Name");
        hatEtikettName.setzeAusrichtung(Ausrichtung.RECHTS);

        hatTextName = new Textfeld(180, 80, 150, 25, "");
        hatTextName.setzeAusrichtung(Ausrichtung.LINKS);

        hatKnopfAnmelden = new Knopf(330, 80, 100, 25, "Anmelden");
        hatKnopfAnmelden.setzeBearbeiterGeklickt("hatKnopfAnmeldenGeklickt");

        hatEtikettNaechsterPatient = new Etikett(70, 150, 100, 25, "Nächster Patient");
        hatEtikettNaechsterPatient.setzeAusrichtung(Ausrichtung.RECHTS);

        hatEtikNameNaePat = new Etikett(180, 150, 150, 25, "");
        hatEtikNameNaePat.setzeAusrichtung(Ausrichtung.LINKS);

        hatKnopfAufrufen = new Knopf(330, 150, 100, 25, "Aufrufen");
        hatKnopfAufrufen.setzeBearbeiterGeklickt("hatKnopfAufrufenGeklickt");

        hatZeilenbereich = new Zeilenbereich(230, 250, 200, 200, "");
    }

    // Methoden
    public void hatKnopfAnmeldenGeklickt()
    {
        if ( hatTextName.inhaltAlsText() != "")
        {
            Patient lPatient;
            lPatient = new Patient(hatTextName.inhaltAlsText());
            hatWarteraum.setzePatient(lPatient);
            this.zeigeNaechsterPatient();
            hatZeilenbereich.setzeInhalt(hatWarteraum.toString());
            hatTextName.setzeInhalt("");
            int lPlatz = hatRechner.ganzeZufallszahl(0,9);
            hatEtikettPlatz[lPlatz].setzeInhalt(lPatient.name());
        }
    }

    public void hatKnopfAufrufenGeklickt()
    {
        if(!hatWarteraum.leer())
        { 
            hatWarteraum.entfernePatient();
            this.zeigeNaechsterPatient();
            hatZeilenbereich.setzeInhalt(hatWarteraum.toString());
        }
    }

    private void zeigeNaechsterPatient()
    {
        if(!hatWarteraum.leer())
        hatEtikNameNaePat.setzeInhalt(hatWarteraum.ersterPatient().name());
        else hatEtikNameNaePat.setzeInhalt("-----");
    }
}
