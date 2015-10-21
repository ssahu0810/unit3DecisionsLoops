import java.util.Scanner;
/**
 * Write a description of class LeapYear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeapYear
{
    // instance variables - replace the example below with your own
    public static void main( String [] arg )
    {
        Scanner in = new Scanner(System.in);
        System.out.print( "Enter year: " );
        int remainder = in.nextInt();
        if (remainder % 400 == 0 || remainder % 4 != 0)
        {
            System.out.print("That is not a leap year");
        }
        else
        {
            System.out.print("That is a leap year");
        }
    }
}