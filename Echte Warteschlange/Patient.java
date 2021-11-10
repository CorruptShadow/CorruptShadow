/**
    
   * Klasse Patient
 * 
 * @author  Dienst
 * @version 1.0 07.10.2021
 */
public class Patient
{
    // Referenzen
    Patient kenntNachfolger;

    // Attribute
    String zName;

    // Konstruktor
    public Patient(String pName)
    {
        zName = pName;
        kenntNachfolger = null;
    }

    // Methoden
    public void setzeNachfolger(Patient pPatient)
    {
        kenntNachfolger = pPatient;
    }

    public Patient nachfolger()
    {
        return kenntNachfolger;
    }

    public String name()
    {
        return zName;
    }
}