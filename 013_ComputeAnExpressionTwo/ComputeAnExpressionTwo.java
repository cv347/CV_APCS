public class ComputeAnExpressionTwo
{
   public static void main(String[] args)
   {
    // This is the equation 9.5 * 4.5 - 2.5 * 3 / 45.5 - 3.5 
    //  double num1 = 9.5 * 4.5;
    //  double num2 = 2.5 * 3;
    //  double num3 = 45.5 - 3.5;
     ReturningCalculator cal = new ReturningCalculator();
     double numM1 = cal.doubleMultiplier(9.5, 4.5);
     double numM2 = cal.doubleMultiplier(2.5, 3);
     double numM3 = cal.doubleSubtractor(45.5,3.5);
     
     double ans = cal.doubleSubtractor(numM1,numM2) ;
     double ans2 = cal.divider(ans,numM3);
    
     
     
     System.out.println(ans2);
   }
}