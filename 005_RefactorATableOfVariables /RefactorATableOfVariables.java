public class RefactorATableOfVariables
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
       int a_2r3 = a3*a3;
       int a_2r4 = a4*a4;
       //Column a^3
       int a_3r3 = a3*a_2r3;
       int a_3r4 = a4*a_2r4;
     System.out.println("a" + " " + "a^2 " + "a^3");
     System.out.println(a  + "  " + a + "  " + a);
     System.out.println(a2  + "  " + a_r3 + "  " + a_r4);
     System.out.println(a3  + "  " + a_2r3 + "  " + a_3r3);
     System.out.println(a4 + "  " + a_2r4 + "  " + a_3r4);  
   }
}