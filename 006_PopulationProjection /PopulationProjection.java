public class PopulationProjection
{
   public static void main(String[] args)
   {
      int currentPopulation = 312032486;
      int year = 365;
      int birthInADay  = 86400 / 7;
      int deathInADay = 86400 / 13;
      int immigrantInADay = 86400 / 45;
      int birhtInAYear = birthInADay * year;
      int deathInAYear = deathInADay * year;
      int immigrantInAYear = immigrantInADay * year;
      
      
      int birth = birhtInAYear;
      int death = deathInAYear;
      int immigrant = immigrantInAYear;
       
      int popAdj = birth - death + immigrant;
      //Estimated Population in 2020
      int currentPopulation20 = (currentPopulation + popAdj);
       
      //Estimated Population  in 2021
      int currentPopulation21 = (currentPopulation20 + popAdj);
       
      //Estimated Population  in 2022
      int currentPopulation22 = (currentPopulation21 + popAdj);
       
      //Estimated Population  in 2023
      int currentPopulation23 = (currentPopulation22 + popAdj);
       
      //Estimated Population  in 2024
      int currentPopulation24 = (currentPopulation23 + popAdj);
      System.out.println("In one year there are is an estimated " + birth + " births in a year, " + death + " deaths in a year, " +  "and " + immigrant +  " immigrants in a year");
      System.out.println("Current Population of 2019 is: " + currentPopulation);
      System.out.println("Estimated Population of 2020: " + currentPopulation20);
      System.out.println("Estimated Population of 2021: " + currentPopulation21);
      System.out.println("Estimated Population of 2022: " + currentPopulation22);
      System.out.println("Estimated Population of 2023: " + currentPopulation23);
      System.out.println("Estimated Population of 2024: " + currentPopulation24);
   }
}