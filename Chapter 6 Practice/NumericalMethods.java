import java.util.Scanner;

public class NumericalMethods
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What nth number do you want?: ");
        int n = s.nextInt();
        n -= 2;
        int fold1 = 1;
        int fold2 = 1;
        int fnew = 0;
    
        for (int count = 1; count <= n; count++)
        {
            fnew = fold1 + fold2;
            fold2 = fold1;
            fold1 = fnew;
                       
        }
        System.out.println(fnew);
    }
}
    