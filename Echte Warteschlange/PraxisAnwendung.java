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
    
    
    private Etikett hatEtikettName0;
    private Etikett hatEtikettName1;
    private Etikett hatEtikettName2;
    private Etikett hatEtikettName3;
    private Etikett hatEtikettName4;
    private Etikett hatEtikettName5;
    private Etikett hatEtikettName6;
    private Etikett hatEtikettName7;
    private Etikett hatEtikettName8;
    private Etikett hatEtikettName9;
    
    

    // Konstruktor
    public PraxisAnwendung()
    {
        // Initialisierung der Oberklasse
        super(1000, 500);

        hatStift = new Buntstift();
        hatWarteraum = new Warteraum();
        hatErsterPatient = null;

        
        hatEtikettName0 = new Etikett(530, 80, 50, 50, "Stuhl0");
        hatEtikettName1 = new Etikett(590, 80, 50, 50, "Stuhl1");
        hatEtikettName2 = new Etikett(650, 80, 50, 50, "Stuhl2");
        hatEtikettName3 = new Etikett(710, 140, 50, 50, "Stuhl3");
        hatEtikettName4 = new Etikett(710, 200, 50, 50, "Stuhl4");
        hatEtikettName5 = new Etikett(710, 260, 50, 50, "Stuhl5");
        hatEtikettName6 = new Etikett(710, 320, 50, 50, "Stuhl6");
        hatEtikettName7 = new Etikett(530, 380, 50, 50, "Stuhl7");
        hatEtikettName8 = new Etikett(590, 380, 50, 50, "Stuhl8");
        hatEtikettName9 = new Etikett(650, 380, 50, 50, "Stuhl9");
        
        
        
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
