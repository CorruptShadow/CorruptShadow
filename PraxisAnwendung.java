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

    // Konstruktor
    public PraxisAnwendung()
    {
        // Initialisierung der Oberklasse
        super(1000, 500);

        hatStift = new Buntstift();
        hatWarteraum = new Warteraum();
        hatErsterPatient = null;

        
        hatEtikettName = new Etikett(530, 80, 50, 50, "Stuhl1");
        hatEtikettName = new Etikett(590, 80, 50, 50, "Stuhl2");
        hatEtikettName = new Etikett(650, 80, 50, 50, "Stuhl3");
        hatEtikettName = new Etikett(710, 140, 50, 50, "Stuhl4");
        hatEtikettName = new Etikett(710, 200, 50, 50, "Stuhl5");
        hatEtikettName = new Etikett(710, 260, 50, 50, "Stuhl6");
        hatEtikettName = new Etikett(710, 320, 50, 50, "Stuhl7");
        
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
        }
    }

    public void hatKnopfAufrufenGeklickt()
    {
        // ...
    }

    private void zeigeNaechsterPatient()
    {
        if(!hatWarteraum.leer())
        hatEtikNameNaePat.setzeInhalt(hatWarteraum.ersterPatient().name());
        else hatEtikNameNaePat.setzeInhalt("-----");
    }
}
