/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 31.8.2017
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Textfeld hatTextfeld1;
    private Textfeld hatTextfeld2;
    private Textfeld hatTextfeld3;
    private Textfeld hatTextfeld4;
    private Etikett hatEtikett1;
    private Etikett hatEtikett2;
    private Knopf hatKnopf1;
    private Knopf hatKnopf2;
    private Knopf hatKnopf3;
    private Knopf hatKnopf4;
    private Etikett hatEtikett6;
    private Knopf hatKnopfEnde;
    private Etikett hatEtikett7;
    private Etikett hatEtikett8;
    private Etikett hatEtikett9;

    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1059, 924);

        hatTextfeld1 = new Textfeld(84, 82, 100, 25, "");
        // Ausrichtung
        hatTextfeld1.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld2 = new Textfeld(85, 137, 100, 25, "");
        // Ausrichtung
        hatTextfeld2.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld3 = new Textfeld(246, 82, 100, 25, "");
        // Ausrichtung
        hatTextfeld3.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld4 = new Textfeld(247, 137, 100, 25, "");
        // Ausrichtung
        hatTextfeld4.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikett1 = new Etikett(75, 110, 120, 25, "---------------------------");
        // Ausrichtung
        hatEtikett1.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikett2 = new Etikett(239, 111, 120, 25, "---------------------------");
        // Ausrichtung
        hatEtikett2.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopf1 = new Knopf(192, 65, 45, 25, "+");
        hatKnopf1.setzeBearbeiterGeklickt("hatKnopf1Geklickt");
        hatKnopf2 = new Knopf(193, 97, 45, 25, "-");
        hatKnopf2.setzeBearbeiterGeklickt("hatKnopf2Geklickt");
        hatKnopf3 = new Knopf(193, 132, 45, 25, "*");
        hatKnopf3.setzeBearbeiterGeklickt("hatKnopf3Geklickt");
        hatKnopf4 = new Knopf(193, 164, 45, 25, "/");
        hatKnopf4.setzeBearbeiterGeklickt("hatKnopf4Geklickt");
        hatEtikett6 = new Etikett(386, 109, 25, 25, "=");
        // Ausrichtung
        hatEtikett6.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfEnde = new Knopf(77, 239, 69, 25, "ENDE");
        hatKnopfEnde.setzeBearbeiterGeklickt("hatKnopfEndeGeklickt");
        hatEtikett7 = new Etikett(441, 82, 100, 25, "");
        // Ausrichtung
        hatEtikett7.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikett8 = new Etikett(441, 136, 100, 25, "");
        // Ausrichtung
        hatEtikett8.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikett9 = new Etikett(431, 110, 130, 25, "-----------------------------");
        // Ausrichtung
        hatEtikett9.setzeAusrichtung(Ausrichtung.LINKS);
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopf1 fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopf1Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopf2 fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopf2Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopf3 fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopf3Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopf4 fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopf4Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfEnde fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfEndeGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

}
