public class ComputeAnExpression
{
   public static void main(String[] args)
   {
     
    // This is the equation 9.5 * 4.5 - 2.5 * 3 / 45.5 - 3.5 
     double num1 = 9.5 * 4.5;
     double num2 = 2.5 * 3;
     double num3 = 45.5 - 3.5;
     double ans = num1 - num2 ;
     double ans2 = ans / num3;
     System.out.println(ans2);
   }
}