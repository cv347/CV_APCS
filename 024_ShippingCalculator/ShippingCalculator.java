import java.util.Scanner;

public class ShippingCalculator
{
    
        public static void main(String[] args)
        {
         Scanner scan = new Scanner(System.in);
         double x = 3.5;
         double c = 5.5;
         double v = 8.5;
         double z = 10.5;
         double w = 0;
         System.out.println("How much does your package weight: ");
         w = scan.nextDouble();
         if(w < 1 && w > 0)
         {
            System.out.println("Your price is " + x + " dollars");
         }
         
         else if(w < 3 && w > 1)
         {
            System.out.println("Your price is " + c + " dollars");
         }

         else if(w < 10 && w > 3)
         {
            System.out.println("Your price is " + v + " dollars");
         }

         else if (w < 20 && w > 10)
         {
            System.out.println("Your price is " + z + " dollars");
         }
         else
         {
            System.out.println("Your package weighs to much");
         }



         scan.close();
        
    }
}
