/*
 * Program: SavingsCal.java
 * Programer: Lydia Frame
 * Purpose: prompts the user to enter a monthly saving amount 
 *          and displays the account value after the sixth month. 
 */

 package savingscal; 
 import java.util.Scanner; 

 public class SavingsCal {

    public static void main(String[] args){

        //variables
        Scanner input = new Scanner(System.in);
        double SavingsTotal; 
        double SavingsAmount; 

        //prompt user to enter monthly savings amount
        System.out.print("Enter monthly savings amount: $");
        SavingsAmount = input.nextDouble(); 

        //calculate the total savings 
        SavingsTotal = SavingsAmount * 6; 

        // Display the value after six months
        System.out.println("Monthly savings amount after 6 months is: $" + SavingsTotal);

    } /* END MAIN */
 } /* END PUBLIC CLASS */