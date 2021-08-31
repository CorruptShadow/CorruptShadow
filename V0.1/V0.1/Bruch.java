
/**
 * Beschreiben Sie hier die Klasse Bruch.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bruch
{
    public int zaehler;
    public int nenner;
    public Bruch(int zaehler, int nenner)
    {
        this.zaehler = zaehler;
        this.nenner = nenner;
        
        
    
    }
    public double dezimalBruch()
    {
        return (double)this.zaehler / (double)this.nenner;
    }
    public int GGT()
    {
        int b = this.nenner;
        int a = this.zaehler;
        if(a == 0) return b;
        while(b != 0)
        {
            if(a > b)
            {
                a = a - b;
            }
            else
            {
                b = b - a;
            }
        }
        return a;
    }
    public Bruch kuerzeVollstaendig()
    {
        int a = GGT();
        return new Bruch(this.zaehler/a,this.nenner/a);
    }
}
