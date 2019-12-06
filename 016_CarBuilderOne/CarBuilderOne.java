import java.util.Scanner;

public class CarBuilderOne
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       // Y is year 
       int y = 0;
       // B is miles
       int b = 0;
       // H is manufacturer
       String h = "m";
       // L is model
       String L = "l";
       // You can enter any manufacturer.
       System.out.println("Enter your make: ");
       h = scan.nextLine();
       //System.out.println(h);
       System.out.println("Enter your model: ");
       L = scan.nextLine();
       System.out.println("Enter your year: ");
       y = scan.nextInt();
       System.out.println("Enter your mileage: ");
       b = scan.nextInt();
       //The person car they want.
       Car x = new Car(y, b, h, L);
       System.out.println("I have found a " + x.year + " with " + x.milesDriven + " " +  x.manufacturerName + " " +x.modelName);
       scan.close();
    }
}