/**
 * Setzen an beliebiger Stelle; Kursdaten einfügen
 * 
 * @author Dienst
 * @version 1.0 19.01.2022
 */
import sum.komponenten.*;
import sum.werkzeuge.Uhr;
import sum.strukturen.Liste;
import sum.ereignis.*;

public class PraxisAnwendung extends EBAnwendung
{
    // Referenzen
    private Buntstift hatStift;
    private Uhr hatUhr;

    private Patient hatErsterPatient;
    private Liste hatWarteraum;

    private Etikett hatEtikAnmeld;
    private Etikett hatEtikWarteraum;
    private Etikett hatEtikettName;
    private Etikett hatEtikettPlatz;
    private Etikett hatEtikettNaechsterPatient;
    private Textfeld hatTextfName;
    private Textfeld hatPlatzfName;
    private Knopf hatKnopfAnmelden;
    private Etikett hatEtikNameNaePat;
    private Knopf hatKnopfAufrufen;
    private Zeilenbereich hatZeilenbereich;

    private Knopf hatKnopfDatenEinfuegen;

    // Konstruktor
    public PraxisAnwendung()
    {
        // Initialisierung der Oberklasse
        super(800, 650);

        hatStift = new Buntstift();
        hatUhr = new Uhr();

        hatWarteraum = new Liste();
        hatErsterPatient = null;

        hatEtikettName = new Etikett(70, 80, 100, 25, "Name");
        hatEtikettName.setzeAusrichtung(Ausrichtung.RECHTS);

        hatTextfName = new Textfeld(180, 80, 150, 25, "");
        hatTextfName.setzeAusrichtung(Ausrichtung.LINKS);

        hatKnopfAnmelden = new Knopf(330, 80, 100, 25, "Anmelden");
        hatKnopfAnmelden.setzeBearbeiterGeklickt("hatKnopfAnmeldenGeklickt");

        hatEtikettPlatz = new Etikett(70, 140, 100, 25, "Setzen vor Platz");
        hatEtikettPlatz.setzeAusrichtung(Ausrichtung.RECHTS);

        hatPlatzfName = new Textfeld(180, 140, 30, 25, "");
        hatPlatzfName.setzeAusrichtung(Ausrichtung.LINKS);

        hatEtikettNaechsterPatient = new Etikett(70, 180, 100, 25, "Aktueller Patient");
        hatEtikettNaechsterPatient.setzeAusrichtung(Ausrichtung.RECHTS);

        hatEtikNameNaePat = new Etikett(180, 180, 150, 25, "");
        hatEtikNameNaePat.setzeAusrichtung(Ausrichtung.LINKS);

        hatKnopfAufrufen = new Knopf(330, 180, 100, 25, "Aufrufen");
        hatKnopfAufrufen.setzeBearbeiterGeklickt("hatKnopfAufrufenGeklickt");

        hatZeilenbereich = new Zeilenbereich(180, 230, 150, 350, "");

        hatKnopfDatenEinfuegen = new Knopf(350, 230, 80, 50, "Q1 If G1");
        hatKnopfDatenEinfuegen.setzeBearbeiterGeklickt("hatKnopfDatenEinfuegenGeklickt");
    }

    public void hatKnopfAnmeldenGeklickt()
    {
        Patient lPatient;

        // Platz zuweisen
        if ( !hatTextfName.inhaltAlsText().equals("") )
        {
            lPatient = new Patient( hatTextfName.inhaltAlsText() );
            // Patient hinzufügen

            zeigeNaechsterPatient();
            hatZeilenbereich.setzeInhalt( toString(hatWarteraum,0,-1) );
        }
    }

    public void hatKnopfAufrufenGeklickt()
    {
        if ( ) )
        {
            //
            zeigeNaechsterPatient();
            hatZeilenbereich.setzeInhalt( toString(hatWarteraum,0,-1) );
        }
    }

    private String toString(Liste pListe, int pVon, int pBis)
    {
        String lString;
        Patient lPatient;
        int lPos;

        lString = "";
        if ( pListe.istLeer() ) lString = "-----";
            else
            {
                pListe.zumAnfang();
                while ( pListe.aktuelles() != null)
                {
                    lPatient = (Patient)pListe.aktuelles();
                    lPos = pListe.aktuellePosition();
                    lString += lPos + "  ";
                    if (lPos >= pVon && lPos <= pBis) lString += "> ";
                    lString += lPatient.name() + "\n";
                    pListe.vor();
                }
            }
        return lString;
    }

    private void zeigeNaechsterPatient()
    {
        if ( hatWarteraum.istLeer() ) hatEtikNameNaePat.setzeInhalt(" --- ");
            else
            {
                // 
            }
    }

    public void hatKnopfDatenEinfuegenGeklickt()
    {
         String[] lDaten =  {"Lennart", "Fiona", "Simon", "Mark",
                             "Tom", "Aktshya", "Liam", "Anika",
                             "Maurice", "Phileas", "Daniel", "Jan",
                             "Giuseppe", "Alina", "Omidullah", "Max"};

         // Daten einfügen
         zeigeNaechsterPatient();
         hatZeilenbereich.setzeInhalt( toString(hatWarteraum,0,-1) );
    }
}