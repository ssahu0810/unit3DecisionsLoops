import java.util.Scanner;
public class SubStrings
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = s.next();
        int length = word.length();
        int x = 1;
        while (x<=length)
        {
            int i = 0;
            do
            {
                System.out.println(word.substring(i,x+i));
                i++;
            }
            while(x+i<=length);
            x++;
        }
    }
}