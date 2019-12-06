public class AreasOfRectangles
{
   public static void main(String[] args)
   {
   //Rec1AreaInInches
    double width1 = 5.5; 
    double height1 = 7.8;
    
    //Rec2AreaInCentimeters:
    double width2 = 99.4; 
    double height2 = 500.352; 
    //Rec3AreaInCentimeters:
    int width3 = 75;
    int height3 = 800;   
    //Rec4AreaInInches:
    double width4 = 500029.75;
    int height4 = 90029384; 
    //Rec5AreaInYards:
    int width5 =  600000;
    double height5 = 8343491034.0;  

    double w3 = width3 / 2.54;
    double h4 = height4 / 2.54;
    double w5 = width5 / 91.44;
    double h5 = height5 / 914.4;
    double rec1AreaInInches = (width1 * height1); 
    double rec2AreaInCentimeters=(width2 * height2); 
    double rec3AreaInCentimeters=(w3 * height3);
    double rec4AreaInInches=(width4 * h4);
    double rec5AreaInYards= (w5 * h5);
    System.out.println("The area of rectangle 1 is " + rec1AreaInInches + " inches");
    System.out.println("The area of rectangle 2 is " + rec2AreaInCentimeters + " Centimeters" );
    System.out.println("The area of rectangle 3 is " + rec3AreaInCentimeters + " Centimeters");
    System.out.println("The area of rectangle 4 is " + rec4AreaInInches + " inches");
    System.out.println("The area of rectangle 5 is " +  rec5AreaInYards + " yards");
   }
}