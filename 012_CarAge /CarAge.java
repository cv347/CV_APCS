public class CarAge
{
   public static void main(String[] args)
   {
       // This are dream cars that i want lol. 
       Car tesla = new Car(2016,5_000,"Tesla"," Model X");
       // The challenger has always been a dream car for me. 
       Car hellcat = new Car(2019,600,"Dodge","Challenger");
       Car huracan = new Car(2020,50,"Lamborghini","Huracan Evo");
       //This Bugatti is 14 million dollar. I would drive this car like twice and thats it. 
       Car batmobile = new Car(2020,0, "Bugatti","La Voiture Noire");
       Car i8 = new Car(2019,100, "BMW","Roadster");
       int currentYear = 2020;
       ReturningCalculator cal = new ReturningCalculator();
       int teslaAge = cal.integerSubtractor(currentYear, tesla.year);
       int hellcatAge = cal.integerSubtractor(currentYear, hellcat.year);
       int huracanAge = cal.integerSubtractor(currentYear, huracan.year);
       int batmobileAge = cal.integerSubtractor(currentYear, batmobile.year);
       int i8Age = cal.integerSubtractor(currentYear, i8.year);
       //double teslaAage = cal.doubleSubtractor(currentYear, tesla.year);
       //double hellcatAage = cal.integerSubtractor(currentYear, hellcat.year);
    //    double huracanAage = cal.integerSubtractor(currentYear, huracan.year);
    //    double batmobileAage = cal.integerSubtractor(currentYear, batmobile.year);
    //    double i8Aage = cal.integerSubtractor(currentYear, i8.year);
       
       
       
       
       
       System.out.println("My Telsa is " + teslaAge + " years old");
       System.out.println("My Hellcat is " + hellcatAge + " years old");
       System.out.println("My Huracan is " + huracanAge + " years old");
       System.out.println("My Batmobile is " + batmobileAge + " years old");
       System.out.println("My i8 is " + i8Age + " years old");


    
    
    
    
    
    
    
    }
}