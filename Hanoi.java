
/**
 * Beschreiben Sie hier die Klasse Hanoi.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Hanoi {
    public static void verlegeTurm(int hoehe, int von,int nach, int ueber)
{
    if (hoehe > 0) {
        verlegeTurm(hoehe-1, von, ueber, nach);
        System.out.println("von "+von + " nach "+ nach);
        verlegeTurm(hoehe-1, ueber, nach, von);
}
}
}