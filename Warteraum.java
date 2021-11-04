/**
 * Klasse Warteraum
 * 
 * @author  Dienst
 * @version 1.0 07.10.2021
 */
public class Warteraum
{
    // Referenzen
    Patient kenntErsterPatient;

    // Konstruktor
    public Warteraum()
    {
        kenntErsterPatient = null;
    }

    // Methoden
    public void setzePatient(Patient pPatient)
    {
        Patient lPatient;
        
        if( this.leer() ) kenntErsterPatient = pPatient;
            else
            {
                lPatient = kenntErsterPatient;
                while(lPatient.nachfolger() != null) lPatient = lPatient.nachfolger();
                lPatient.setzeNachfolger(pPatient);
            }
    }
    
    public Patient ersterPatient()
    {
        return kenntErsterPatient;
    }

    public void entfernePatient()
    {
        // ...
    }
    
    public boolean leer() 
    {
        return kenntErsterPatient == null;
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