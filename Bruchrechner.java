/**
 * Dienst
 * V0.1 25.08.2021
 */
public class Bruchrechner
{
    // Referenzen

    // Attribute

    // Konstruktor
    public Bruchrechner()
    {
        
    }

    // Methoden
    public Bruch multiplieziere(Bruch pBruch1, Bruch pBruch2)
    {
        
        Bruch lBruch = new Bruch(pBruch1.zaehler()*pBruch2.zaehler(),pBruch1.nenner()*pBruch2.nenner());
        lBruch.kuerzeVollstaendig();
        return lBruch;
    }
    public Bruch dividiere(Bruch pBruch1, Bruch pBruch2)
    {
        
        Bruch zBruch = new Bruch(pBruch1.zaehler()*pBruch2.nenner(),pBruch1.nenner()*pBruch2.zaehler());
        zBruch.kuerzeVollstaendig();
        return zBruch;
    }
    public Bruch addieren(Bruch pBruch1, Bruch pBruch2)
    {
        Bruch pBruch = new Bruch(pBruch1.zaehler()*pBruch2.nenner(),pBruch1.nenner()*pBruch2.zaehler());
        pBruch.kuerzeVollstaendig();
        return pBruch;
    }
}
