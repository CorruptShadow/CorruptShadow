
/**
 * Beschreiben Sie hier die Klasse Bruch.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bruch
{
    public int zZaehler;
    public int zNenner;
    public int zPlatzhalter;
    public Bruch(int pZaehler, int pNenner)
    {
        this.zZaehler = pZaehler;
        this.zNenner = pNenner;
        
        
    
    }
    
    //Methoden

    public int zaehler()
    {
        return zZaehler;
    }
    
    public int nenner()
    {
        return zNenner;
    }
    
    public double dezimalBruch()
    {
        return zZaehler/zNenner; /**return (double)this.zZaehler / (double)this.zNenner; */ 
    }
    public int GGT(int a, int b)
    {
        if (b==0) return a;
        else
        {
            return GGT(b,a%b);
        }
    }
    
    public void erweitern(int erw)
    {
        this.zZaehler = this.zZaehler * erw;
        this.zNenner = this.zNenner * erw;
    }
    public void kuerzeDurch(int kue)
    {
        this.zZaehler = this.zZaehler / kue;
        this.zNenner = this.zNenner / kue;
    }
    public void kuerzeVollstaendig()
    {
        zPlatzhalter = zZaehler;
        zZaehler = zZaehler/GGT(zZaehler,zNenner); //zZaehler wird überschrieben
        zNenner = zNenner/GGT(zPlatzhalter,zNenner);
        //int a = GGT(this.zZaehler,this.zNenner);
        //return new Bruch(this.zZaehler/a,this.zNenner/a);
    }
    /**public int GGT()
    {
        int b = this.zNenner;
        int a = this.zZaehler;
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
    } */
}
