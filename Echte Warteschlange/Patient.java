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
    int zPlatz;
    
    // Konstruktor
    public Patient(String pName, int pPlatz)
    {
        zName = pName;
        zPlatz = pPlatz;
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
    
    public int platz()
    {
        return zPlatz;
    }
}