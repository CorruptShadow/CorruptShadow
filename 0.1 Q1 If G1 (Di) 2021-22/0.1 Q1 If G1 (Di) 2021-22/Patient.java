/**
 * Patient mit Name
 * 
 * @author  Dienst
 * @version 1.0 19.01.2021
 */
import sum.kern.*;
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
        this.kenntNachfolger = pPatient;
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