import java.util.Scanner;

public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      System.out.print("Input the x coordinate of the first circle: ");
      double xcenter1 = in.nextDouble();
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;
      
      double distance = Math.pow(Math.pow(xcenter2 - xcenter1, 2) + Math.pow(ycenter2 - ycenter1, 2), 0.5);
      
      if (radius1 + radius2 >= distance)
      {
          System.out.println("They intersect");
      }
      else
      {
          System.out.println("They do not intersect");
      }

   }
}