/**
 * Scheibe
 * 
 * @author  Dienst
 * @version 2.0 09.03.2022
 */
import sum.ereignis.Buntstift;
import sum.kern.Muster;

public class Scheibe
{
    // Referenzen
    Buntstift hatStift;
    Scheibe kenntDarunter;

    // Attribute
    private int zHPos, zVPos, zNummer;

    // Konstruktor
    public Scheibe(int pNummer)
    {
        hatStift = new Buntstift();
        kenntDarunter = null;

        zNummer = pNummer;
    }

    // Methoden
    public void zeichne(int pHPos, int pVPos)
    {
        zHPos = pHPos;
        zVPos = pVPos;

        int lLaenge = 150-10*zNummer;

        hatStift.bewegeBis(zHPos-lLaenge/2,zVPos-15);
        hatStift.runter();
        hatStift.setzeFarbe(zNummer);
        hatStift.setzeFuellmuster(Muster.GEFUELLT);
        hatStift.zeichneRechteck(lLaenge,15);
        hatStift.hoch();
    }

    public void loesche()
    {
        hatStift.radiere();
        this.zeichne(zHPos, zVPos);
        hatStift.normal();
    }
    
    public void setzeDarunter(Scheibe pScheibe)
    {
        this.kenntDarunter = pScheibe;
    }

    public Scheibe darunter()
    {
        return kenntDarunter;
    }

    public int nummer()
    {
        return zNummer;
    }
}