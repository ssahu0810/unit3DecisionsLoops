import java.util.Random;

public class MontyHall
{
    public static void playerSwitches()
    {
        int wins = 0;
        int losses = 0;
        
        Random generator = new Random();
        
        for (int x = 0; x < 1000; x++)
        {
            int hostdoor;
            int playerdoor = generator.nextInt(3) + 1;
            int cardoor = generator.nextInt(3) + 1;
            int newplayerdoor;
            
            //Host chooses door that is no the same as the car door or player door
            do{
                hostdoor = generator.nextInt(3) + 1;
            }
            while(hostdoor == cardoor || hostdoor == playerdoor);
            
            //Player switches to door that is other than the host door
            do{
                newplayerdoor = generator.nextInt(3) + 1;
            }
            while(newplayerdoor == playerdoor || newplayerdoor == hostdoor);
                                   
            if (newplayerdoor == cardoor)
            {
                wins++;
            }
            else 
            {
                losses++;
            }
                        
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
    }
    
    public static void playerNotSwitches()
    {
        int wins = 0;
        int losses = 0;
        
        Random generator = new Random();
        
        for (int x = 0; x < 1000; x++)
        {
            int hostdoor;
            int playerdoor = generator.nextInt(3) + 1;
            int cardoor = generator.nextInt(3) + 1;
            
            //Host chooses door that is no the same as the car door or player door
            do{
                hostdoor = generator.nextInt(3) + 1;
            }
            while(hostdoor == cardoor || hostdoor == playerdoor);
                             
            if (playerdoor == cardoor)
            {
                wins++;
            }
            else 
            {
                losses++;
            }
                        
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
    }
}
        
        
        
        
        