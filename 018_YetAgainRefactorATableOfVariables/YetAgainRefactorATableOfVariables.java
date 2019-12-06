public class YetAgainRefactorATableOfVariables
{
   public static void main(String[] args)
   {
         int a = 1;
         int a2 = 2;
         int a3 = 3;
         int a4 = 4;
       // Column a 
         int a_r3 = a2*a2;
         int a_r4 = a4*a2;
       //Column a^2 
         double a_2r3 = Math.pow(a3,a3);
         double a_2r4 = Math.pow(a4,a4);
       //Column a^3
         double a_3r3 = Math.pow(a3,a_2r3);
         double a_3r4 = Math.pow(a4,a_2r4);
     System.out.println("a" + " " + "a^2 " + "a^3");
     System.out.println(a  + "  " + a + "  " + a);
     System.out.println(a2  + "  " + a_r3 + "  " + a_r4);
     System.out.println(a3  + "  " + a_2r3 + "  " + a_3r3);
     System.out.println(a4 + "  " + a_2r4 + "  " + a_3r4);  
   }
}