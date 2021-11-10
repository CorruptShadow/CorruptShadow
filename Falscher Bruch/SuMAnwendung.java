/** 
 * @author Dienst
 * @version 0.1 01.09.2021
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Referenzen
    private Textfeld hatTextfeldZaehler1;
    private Textfeld hatTextfeldNenner1;
    private Textfeld hatTextfeldZaehler2;
    private Textfeld hatTextfeldNenner2;
    private Etikett bruchstrich1;
    private Etikett bruchstrich2;
    private Knopf hatKnopfAdd;
    private Knopf hatKnopfSubtr;
    private Knopf hatKnopfMult;
    private Knopf hatKnopfDiv;
    private Etikett gleichheitszeichen;
    private Knopf hatKnopfEnde;
    private Etikett hatErgZaehler;
    private Etikett hatErgNenner;
    private Etikett bruchstrich3;

    private Bruch hatBruch1, hatBruch2;
    private Bruchrechner hatBruchrechner;
    // Attribute

    //Konstruktor
    public SuMAnwendung()
    {
        // Initialisierung der Oberklasse
        super(600, 600);

        hatTextfeldZaehler1 = new Textfeld(84, 89, 100, 25, "");
        hatTextfeldZaehler1.setzeAusrichtung(Ausrichtung.LINKS);

        bruchstrich1 = new Etikett(75, 120, 125, 5, "-----------------------------");
        bruchstrich1.setzeAusrichtung(Ausrichtung.LINKS);

        hatTextfeldNenner1 = new Textfeld(84, 133, 100, 25, "");
        hatTextfeldNenner1.setzeAusrichtung(Ausrichtung.LINKS);

        hatTextfeldZaehler2 = new Textfeld(248, 89, 100, 25, "");
        hatTextfeldZaehler2.setzeAusrichtung(Ausrichtung.LINKS);

        bruchstrich2 = new Etikett(240, 120, 125, 5, "-----------------------------");
        bruchstrich2.setzeAusrichtung(Ausrichtung.LINKS);

        hatTextfeldNenner2 = new Textfeld(248, 133, 100, 25, "");
        hatTextfeldNenner2.setzeAusrichtung(Ausrichtung.LINKS);

        // Knöpfe
        hatKnopfAdd = new Knopf(193, 62, 45, 25, "+");
        hatKnopfAdd.setzeBearbeiterGeklickt("hatKnopfAddGeklickt");

        hatKnopfSubtr = new Knopf(193, 97, 45, 25, "-");
        hatKnopfSubtr.setzeBearbeiterGeklickt("hatKnopfSubtrGeklickt");

        hatKnopfMult = new Knopf(193, 132, 45, 25, "*");
        hatKnopfMult.setzeBearbeiterGeklickt("hatKnopfMultGeklickt");

        hatKnopfDiv = new Knopf(193, 167, 45, 25, "/");
        hatKnopfDiv.setzeBearbeiterGeklickt("hatKnopfDivGeklickt");

        gleichheitszeichen = new Etikett(386, 109, 25, 25, "=");
        gleichheitszeichen.setzeAusrichtung(Ausrichtung.LINKS);

        hatKnopfEnde = new Knopf(77, 239, 69, 25, "LÖSCHEN");
        hatKnopfEnde.setzeBearbeiterGeklickt("hatKnopfLoeschenGeklickt");

        hatErgZaehler = new Etikett(441, 89, 100, 25, "");
        hatErgZaehler.setzeAusrichtung(Ausrichtung.LINKS);
        bruchstrich3 = new Etikett(431, 110, 125, 25, "-----------------------------");
        bruchstrich3.setzeAusrichtung(Ausrichtung.LINKS);
        hatErgNenner = new Etikett(441, 133, 100, 25, "");
        hatErgNenner.setzeAusrichtung(Ausrichtung.LINKS);

        hatBruchrechner = new Bruchrechner();
    }

    public void hatKnopfAddGeklickt()
    {
        hatBruch1 = new Bruch( hatTextfeldZaehler1.inhaltAlsGanzeZahl(), hatTextfeldNenner1.inhaltAlsGanzeZahl() );
        hatBruch2 = new Bruch( hatTextfeldZaehler2.inhaltAlsGanzeZahl(), hatTextfeldNenner2.inhaltAlsGanzeZahl() );
    
        this.gibAusBruch( hatBruchrechner.addieren(hatBruch1,hatBruch2) );
    }

    public void hatKnopfSubtrGeklickt()
    {
        hatBruch1 = new Bruch( hatTextfeldZaehler1.inhaltAlsGanzeZahl(), hatTextfeldNenner1.inhaltAlsGanzeZahl() );
        hatBruch2 = new Bruch( hatTextfeldZaehler2.inhaltAlsGanzeZahl(), hatTextfeldNenner2.inhaltAlsGanzeZahl() );
    
        this.gibAusBruch( hatBruchrechner.subtrahieren(hatBruch1,hatBruch2) );
    }

    public void hatKnopfMultGeklickt()
    {
        hatBruch1 = new Bruch(hatTextfeldZaehler1.inhaltAlsGanzeZahl(),hatTextfeldNenner1.inhaltAlsGanzeZahl());
        hatBruch2 = new Bruch(hatTextfeldZaehler2.inhaltAlsGanzeZahl(),hatTextfeldNenner2.inhaltAlsGanzeZahl());
        
        this.gibAusBruch( hatBruchrechner.dividiere(hatBruch1,hatBruch2) );
    }

    public void hatKnopfDivGeklickt()
    {
        hatBruch1 = new Bruch(hatTextfeldZaehler1.inhaltAlsGanzeZahl(),hatTextfeldNenner1.inhaltAlsGanzeZahl());
        hatBruch2 = new Bruch(hatTextfeldZaehler2.inhaltAlsGanzeZahl(),hatTextfeldNenner2.inhaltAlsGanzeZahl());
    }

    public void hatKnopfLoeschenGeklickt()
    {
        
    }
    private void gibAusBruch(Bruch pBruch)
    {
        // hatErgZaehler.setzeInhalt(...);
        pBruch.kuerzeVollstaendig();
        hatErgZaehler.setzeInhalt(pBruch.zaehler() );
        hatErgNenner.setzeInhalt(pBruch.nenner() );
    }
}