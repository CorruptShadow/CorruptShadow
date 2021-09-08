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
    public Bruch Multiplieziere(Bruch pBruch1, Bruch pBruch2)
    {
        
        return new Bruch(pBruch1.zaehler()*pBruch2.zaehler(),pBruch1.nenner()*pBruch2.nenner());
        
    }
    public Bruch Dividiere(Bruch pBruch1, Bruch pBruch2)
    {
        
        Bruch zBruch = new Bruch(pBruch1.zaehler()*pBruch2.nenner(),pBruch1.nenner()*pBruch2.zaehler());
        return zBruch;
    }
}
