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
    public int zAnzahl;
    // Konstruktor
    public Warteraum()
    {
        kenntErsterPatient = null;
        zAnzahl = 0;
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
        zAnzahl++;
    }
    
    public Patient ersterPatient()
    {
        return kenntErsterPatient;
    }

    public void entfernePatient()
    {
        kenntErsterPatient = kenntErsterPatient.nachfolger();
        zAnzahl--;
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