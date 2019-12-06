import java.util.Scanner;

public class RPSOne
{
   public static void main(String[] args)
   {
       // do u wanna play a game?
       Scanner scan = new Scanner(System.in);
       String x = "RPS";
       String r = "rock";
       String p = "paper";
       String s = "scissors";
       System.out.println("Rock,Paper,Scissor?: ");
       x = scan.nextLine();
       double b = (Math.random());
       if(b < 0 && b < .33)
       {
          System.out.println("r " );
       }
       else if(b > .33 && b < .67)
       {
          System.out.println("p ");
       }
       else if (b > .67 && b < 1)
       {
          System.out.println("s ");
       }
       else if ( b >  )
       {
           System.out.println("You win");
       }
       else if ( b )
       {
           System.out.println("You lose");
       }
     }
  }   