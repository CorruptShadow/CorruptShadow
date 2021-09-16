
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
    public int GGT_rekursiv(int a, int b)
    {
        if (b==0) return a;
        else
        {
            return GGT_rekursiv(b,a%b);
        }
    }
    
    private int GGT_iterativ(int a, int b)
    {
        int h;
        while (b>0)
        {
            h = a;
            a = b;
            b = h%b;
        }
        return a;
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
        zZaehler = zZaehler/GGT_rekursiv(zZaehler,zNenner); //zZaehler wird überschrieben
        zNenner = zNenner/GGT_rekursiv(zPlatzhalter,zNenner);
        //int a = GGT_rekursiv(this.zZaehler,this.zNenner);
        //return new Bruch(this.zZaehler/a,this.zNenner/a);
    }
    /**public int GGT_rekursiv()
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
