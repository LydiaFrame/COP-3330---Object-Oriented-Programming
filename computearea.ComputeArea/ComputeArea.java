/*
 * Program: ComputeArea.java
 * Programmer: Lydia Frame 
 * Purpose: Calculate the area of a circle
 */
package computearea;
import java.util.Scanner;

public class ComputeArea {

    public static void main(String[] args){
        //declare variables
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = input.nextDouble(); 
        double area; 

        // step 2: Compute area
        area = radius * radius * 3.14159;

        // step 3: Display the area
        System.out.println("The area of a circle of radius = " + area); 

    } /* End Main */
 } /* End class ComputeArea */ 