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
    
    
    private Etikett hatEtikettPlatz0;
    private Etikett hatEtikettPlatz1;
    private Etikett hatEtikettPlatz2;
    private Etikett hatEtikettPlatz3;
    private Etikett hatEtikettPlatz4;
    private Etikett hatEtikettPlatz5;
    private Etikett hatEtikettPlatz6;
    private Etikett hatEtikettPlatz7;
    private Etikett hatEtikettPlatz8;
    private Etikett hatEtikettPlatz9;
    
    private Rechner hatRechner;
    
    

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
        hatEtikettPlatz0 = new Etikett(531, 81, 49, 49, "Stuhl0");
        hatEtikettPlatz0.setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(590,80);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz1 = new Etikett(591, 81, 49, 49, "Stuhl1");
        hatEtikettPlatz1.setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(650,80);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz2 = new Etikett(651, 81, 49, 49, "Stuhl2");
        hatEtikettPlatz2.setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(710,140);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz3 = new Etikett(711, 141, 49, 49, "Stuhl3");
        hatEtikettPlatz3.setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(710,200);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz4 = new Etikett(711, 201, 49, 49, "Stuhl4");
        hatEtikettPlatz4.setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(710,260);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz5 = new Etikett(711, 261, 49, 49, "Stuhl5");
        hatEtikettPlatz5.setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(710,320);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz6 = new Etikett(711, 321, 49, 49, "Stuhl6");
        hatEtikettPlatz6.setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(530,380);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz7 = new Etikett(531, 381, 49, 49, "Stuhl7");
        hatEtikettPlatz7.setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(590,380);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz8 = new Etikett(591, 381, 49, 49, "Stuhl8");
        hatEtikettPlatz8.setzeAusrichtung(Ausrichtung.MITTE);
        
        hatStift.bewegeBis(650,380);
        hatStift.zeichneRechteck(50,50);
        hatEtikettPlatz9 = new Etikett(651, 381, 49, 49, "Stuhl9");
        hatEtikettPlatz9.setzeAusrichtung(Ausrichtung.MITTE);
        
        
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
            int lPlatz = hatRechner.ganzeZufallszahl(0,10);
            switch(lPlatz)
            {
                case 0: hatEtikettPlatz0.setzeInhalt(lPatient.name()); break;
                case 1: hatEtikettPlatz1.setzeInhalt(lPatient.name()); break;
                case 2: hatEtikettPlatz2.setzeInhalt(lPatient.name()); break;
                case 3: hatEtikettPlatz3.setzeInhalt(lPatient.name()); break;
                case 4: hatEtikettPlatz4.setzeInhalt(lPatient.name()); break;
                case 5: hatEtikettPlatz5.setzeInhalt(lPatient.name()); break;
                case 6: hatEtikettPlatz6.setzeInhalt(lPatient.name()); break;
                case 7: hatEtikettPlatz7.setzeInhalt(lPatient.name()); break;
                case 8: hatEtikettPlatz8.setzeInhalt(lPatient.name()); break;
                case 9: hatEtikettPlatz9.setzeInhalt(lPatient.name()); break;
                default: hatEtikettPlatz7.setzeInhalt(lPatient.name()); break;
                
            }
            /**
            if(lPlatz==0) hatEtikettPlatz0.setzeInhalt(lPatient.name());
            if(lPlatz==1) hatEtikettPlatz1.setzeInhalt(lPatient.name());
            if(lPlatz==2) hatEtikettPlatz2.setzeInhalt(lPatient.name());
            if(lPlatz==3) hatEtikettPlatz3.setzeInhalt(lPatient.name());
            if(lPlatz==4) hatEtikettPlatz4.setzeInhalt(lPatient.name());
            if(lPlatz==5) hatEtikettPlatz5.setzeInhalt(lPatient.name());
            if(lPlatz==6) hatEtikettPlatz6.setzeInhalt(lPatient.name());
            if(lPlatz==7) hatEtikettPlatz7.setzeInhalt(lPatient.name());
            if(lPlatz==8) hatEtikettPlatz8.setzeInhalt(lPatient.name());
            if(lPlatz==9) hatEtikettPlatz9.setzeInhalt(lPatient.name());
            
            /*for(int n = 0; n<10; n++)
            {
                hatEtikettName0.setzeInhalt();
            }*/
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
