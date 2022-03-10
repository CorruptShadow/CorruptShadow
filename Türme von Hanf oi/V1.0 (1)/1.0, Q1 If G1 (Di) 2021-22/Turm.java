/**
 * Turm
 * 
 * @author  Dienst
 * @version 3.0 22.01.2020
 */
import sum.kern.*;

public class Turm
{
    // Referenzen
    private Scheibe kenntObersteScheibe;

    // Attribute
    private int zAnzahl;

    // Konstanten
    private int HPOSITION;

    // Konstruktor
    public Turm(int pHPos)
    {
        kenntObersteScheibe = null;
        zAnzahl = 0;
        HPOSITION = pHPos;
    }

    // Methoden
    public boolean istLeer()
    {
        return zAnzahl == 0;
    }

    public void legAuf(Scheibe pScheibe)
    {
        zAnzahl++;
        pScheibe.zeichne(HPOSITION, 464-zAnzahl*16);
        if ( !this.istLeer() )
        {
            pScheibe.setzeDarunter(kenntObersteScheibe);
        }

        kenntObersteScheibe = pScheibe;
    }

    public void nimmRunter()
    {
        if ( !this.istLeer() )
        {
            kenntObersteScheibe.loesche();
            kenntObersteScheibe = kenntObersteScheibe.darunter();
            zAnzahl--;
        }
    }

    public Scheibe oberste()
    {
        return kenntObersteScheibe;
    }

    public void leere()
    {
        while( zAnzahl>0 )
        {
            this.nimmRunter();
        }
    }

    public int laenge()
    {
        return zAnzahl;
    }
}