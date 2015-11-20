import java.util.Scanner;

public class Spectrum
{
    public static void main(String [] args)
    {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Wavelength: ");
        double wavelength = user_input.nextDouble();
        String wave = null;
        
        if (wavelength > 1 * Math.pow(10, -1))
        {
            wave = "Radio Wave";
        }
        else if ((wavelength < 1 * Math.pow(10, -1)) && (wavelength > 1 * Math.pow(10, -3)))
        {
            wave = "Microwave";
        }
        else if ((wavelength < 1 * Math.pow(10, -3)) && (wavelength > 7 * Math.pow(10, -7)))
        {
            wave = "Infared";
        }
        else if ((wavelength < 7 * Math.pow(10, -7)) && (wavelength > 4 * Math.pow(10, -7)))
        {
            wave = "Visible Light";
        }
        else if ((wavelength < 4 * Math.pow(10, -7)) && (wavelength > 1 * Math.pow(10, -8)))
        {
            wave = "Ultraviolet";
        }
        else if ((wavelength < 1 * Math.pow(10, -8)) && (wavelength > 1 * Math.pow(10, -11)))
        {
            wave = "X-ray";
        }
        else
        {
            wave = "Gamma ray";
        }
        double frequency = (6.626 * Math.pow(10, -34))/wavelength;
        
        System.out.println("Type: " + wave);
        System.out.println("Frequency: " + frequency);
    }
}
        
        
        