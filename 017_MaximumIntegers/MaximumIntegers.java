public class MaximumIntegers 
{
   public static void main(String[] args)
   {
    int proof = Integer.MAX_VALUE;
    int proof2 = Integer.MIN_VALUE;
    // I decided to add two proof together and i got -1. 
    int overflow = proof + proof2 + 1000001;
    //Then i added 1000001.
    //First is subtracted my proof2 by proof2 and got 0
    int underflow = proof2 - proof2 + 745;
    //then i added 745.
    System.out.println(proof);
    System.out.println(proof2);
    System.out.println(overflow);
    System.out.println(underflow);
  }
}
 