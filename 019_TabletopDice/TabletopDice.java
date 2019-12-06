public class TabletopDice
{
   public static void main(String[] args)
   {
      int d4 = 4; //sided dice.
      int d6 = 6; //sided dice.
      int d8 = 8; //sided dice.
      int d10 = 10; //sided dice
      int d12 = 12; //sided dice.
      int d20 = 20; //sided dice.

      System.out.println("You roled a " + (int)(Math.random()*d4)+ " with a 4 side dice.");
      System.out.println("You roled a " + (int)(Math.random()*d6)+ " with a 6 side dice.");
      System.out.println("You roled a " + (int)(Math.random()*d8)+ " with a 8 side dice.");
      System.out.println("You roled a " + (int)(Math.random()*d10)+ " with a 10 side dice.");
      System.out.println("You roled a " + (int)(Math.random()*d12)+ " with a 12 side dice.");
      System.out.println("You roled a " + (int)(Math.random()*d20) + " with a 20 side dice." );

   }
} 
//Percentile = A 10 sided dice that only returns base 10 numbers. (It’s used in combination with at d10 to get a number between 1-100).


