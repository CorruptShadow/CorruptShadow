/**
 * Klasse Warteraum
 * 
 * @author  Dienst
 * @version 1.0 07.10.2021
 */
public class Warteraum
{
    // Referenzen
    

    // Konstruktor
    public Warteraum()
    {
        // ...
    }

    // Methoden
    public void setzePatient(Patient pPatient)
    {
        // ...
    }

    public Patient ersterPatient()
    {
        // ...
    }

    public void entfernePatient()
    {
        // ...
    }

    public String toString()
    {
        String lString = "";
        Patient lPatient = kenntErsterPatient;

        if ( kenntErsterPatient==null ) lString = "-----";
            else while (lPatient != null)
            {
                lString += lPatient.name() + "\n";
                lPatient = lPatient.nachfolger();
            }
        return lString;
    }
}