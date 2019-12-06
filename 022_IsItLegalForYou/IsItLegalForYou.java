import java.util.Scanner;

public class IsItLegalForYou
{
   public static void main(String[] args)
   {
       //I created the scanner so that a person can enter an age to see what they can legally do in Minnesota
       Scanner scan = new Scanner(System.in);
       int x = 0;
       System.out.println("How old are you?: ");
       x = scan.nextInt();
       // X is greater than 25
       if(x > 25)
       {
          System.out.println("You can get a driver’s license, buy cigarettes, going to a Casinos, buy alcohol, and rent a car");
       }
      
        // X is greater than 21
       else if (x > 21)
       {
          System.out.println("You can get driver’s license, buy cigarettes, go to a Casinos, and buy alcohol." );
       }
       
        // X is greater than or equal to 18
       else if (x >= 18)
       {
          System.out.println("You can get driver’s license, buy cigarettes, go to a Casinos." );
       }
       
        // X is greater than 16
       else if (x > 16 )
       {
          System.out.println("You can get driver’s license." );
       }
       else
       {
          System.out.println("You are to young to get a driver’s license, buy cigarettes, going to a Casinos, buy alcohol, and rent a car" );
       }
       scan.close();
    }
}