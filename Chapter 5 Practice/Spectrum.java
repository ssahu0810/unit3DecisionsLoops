import java.util.Scanner;

public class Spectrum
{
    public static void main(String [] args)
    {
        Scanner user_input = new Scanner(System.in);
        double wavelength = user_input.nextDouble();
        
        if (wavlength > 1 * Math.pow(10, -1))
        {
            String wave = "Radio Wave";
        }
        else if ((wavlength < 1 * Math.pow(10, -1)) && (wavelength > 1 * Math.pow(10, -3)))
        {
            String wave = "Microwave";
        }
        else if ((wavlength < 1 * Math.pow(10, -3)) && (wavelength > 7 * Math.pow(10, -7)))
        {
            String wave = "Infared";
        }
        else if ((wavlength < 7 * Math.pow(10, -7)) && (wavelength > 4 * Math.pow(10, -7)))
        {
            String wave = "Visible Light";
        }
        else if ((wavlength < 4 * Math.pow(10, -7)) && (wavelength > 4 * Math.pow(10, -7)))
        {
            String wave = "Ultraviolet";
        }
        else if ((wavlength < 1 * Math.pow(10, -8)) && (wavelength > 1 * Math.pow(10, -11)))
        {
            String wave = "X-ray";
        }
        else
        {
            String wave = "Gamma ray";
        }
        
        