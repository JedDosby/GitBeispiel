
/**
 * Beschreiben Sie hier die Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Main
{
    public static void main (String args[])
    {
        int obreGrnze = 20;
        int summe = 0;
        for(int i = 1; i <= obreGrnze; i++)
        {
            summe = summe + i;
        }
        
        int mult = 1;
        for(int i = 2; i <= obreGrnze; ++i)
        {
            mult *= i;
        }
        
        System.out.println("Summe: " + summe + "Mult: " + mult);
    }
}
