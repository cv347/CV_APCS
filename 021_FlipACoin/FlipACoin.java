public class FlipACoin
{
   public static void main(String[] args)
   {
     //heads on a coin
     String d4 = "heads";
     //tails on a coin
     String c4 = "tails";

     double b4 = (Math.random());
     // 0 through 1
     if(b4 > 0.5)
     {
        System.out.println("You fliped a " + d4 );
     }

     else
     {
        System.out.println("You fliped a " + c4);
     }
   }
} 