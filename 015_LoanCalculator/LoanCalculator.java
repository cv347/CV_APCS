import java.util.Scanner;
public class LoanCalculator
{

// driver code 
public static void main(String args[]) 
{ 
     double pB = 0.0;
     double aiR = 0.0;
     double rM = 0.0;
     double mI = 0.0;
     double mP = 0.0;
     Scanner scan = new Scanner(System.in);
     System.out.println("What is your Pricipal Balance?: ");
     pB = scan.nextDouble();

     System.out.println("What is your Annual Interest Rate?: ");
     aiR = scan.nextDouble();

     System.out.println(" How many months on your loan: ");
     rM = scan.nextDouble();

      //  monthlyInterest = principalBalance x (annualInterestRate/remainingMonths)
     //  monthlyPayment = principalBalance/remainingMonths + monthlyInterest
     mI = pB *(aiR/rM);
     mP = pB/rM + mI;
     System.out.println(" Your monthly interest is " + mI);
     System.out.println(" Your monthly payments is " + mP);
     scan.close();
    }
}