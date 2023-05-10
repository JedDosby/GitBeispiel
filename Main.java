
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
        int obereGrenze = 20;
        int summe = 0;
        for(int i = 1; i <= obereGrenze; i++)

        {
            summe = summe + i;
        }
        
        int mult = 1;
        for(int i = 2; i <= obereGrenze; ++i)
        {
            mult *= i;
        }
        
        System.out.println("Summe: " + summe + "Mult: " + mult);
    }
}
