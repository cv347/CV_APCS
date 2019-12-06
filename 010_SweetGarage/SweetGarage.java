public class SweetGarage
{
   public static void main(String[] args)
   {
       // This are dream cars that i want lol. 
       Car tesla = new Car(2016,5_000,"Tesla"," Model X", false);
       // The challenger has always been a dream car for me. 
       Car hellcat = new Car(2019,600,"Dodge","Challenger", true);
       Car huracan = new Car(2020,50,"Lamborghini","Huracan Evo", false);
       //This Bugatti is 14 million dollars. I would drive this car like twice and thats it. 
       Car batmobile = new Car(2020,0, "Bugatti","La Voiture Noire", true);
       Car i8 = new Car(2019,100, "BMW","Roadster",false);
       System.out.println ("Does the " + tesla.modelName + " have Turbo? " + tesla.hasTurbo);
       System.out.println ("Does the " + hellcat.modelName + " have Turbo? " + hellcat.hasTurbo);
       System.out.println ("Does the " + huracan.modelName + " have Turbo? " + huracan.hasTurbo);
       System.out.println ("Does the " + batmobile.modelName + " have Turbo? " + batmobile.hasTurbo);
       System.out.println ("Does the " + i8.modelName + " have Turbo? " + i8.hasTurbo);
       tesla.revEngine();
       hellcat.revEngine();
       hellcat.engageTurbo();
       huracan.revEngine();
       batmobile.revEngine();
       batmobile.engageTurbo();
       i8.revEngine();
      }
}