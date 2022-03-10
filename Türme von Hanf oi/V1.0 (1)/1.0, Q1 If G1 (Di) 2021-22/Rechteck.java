/**
 * @author Dienst 
 * @version 3.0 21.01.2020
 */

import sum.ereignis.Buntstift;
public class Rechteck
{
    Buntstift hatStift;

    // Attribute
    int zHPos, zVPos;

    // Konstruktor
    public Rechteck(int pHPos)
    {
        hatStift = new Buntstift();
        zHPos = pHPos;
        zVPos = 200;
        
        //this.zeichne();
    }

    // Methoden
    public void zeichne()
    {
        hatStift.bewegeBis(zHPos,zVPos);
        hatStift.zeichneRechteck(200, 250);
    }

    public boolean getroffen(int pHMauspos, int pVMauspos)
    {
        return pHMauspos>=zHPos && pVMauspos>=zVPos && pHMauspos<=zHPos+200 && pVMauspos<=zVPos+250;
    }
}