/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//import classes
import java.util.Scanner; //Import Scanner class
/**
 *
 * @author Instructor Base code
 */
public class SimpleInputOutput {

    public static void main(String[] args) {
        //variable declaration
        Scanner cin = new Scanner(System.in); //Declare Scanner object

        //named constants
        final int SECRET = 11; //final is how you name a constant

        final double RATE = 12.50;

        //Declare variables
        int num1, num2, newNum;

        String name;

        double hoursWorked, wages;


        //executable statements

        //Ask the user to input a last name
        System.out.print("Please enter a last name ");
        name = cin.nextLine();


        //Prompt the user to input two variables

        System.out.print("Please enter the first number ");
        num1 = cin.nextInt();

        System.out.print("Please enter the second number ");
        num2 = cin.nextInt();

        //Display the output of num1 and num2
        System.out.println("The value of" + " num1 = " + num1 + " and the value of" + " num2 = " + num2);

        //Calculate the newNum value
        newNum = (num1*2 + num2);

        //Display newNum
        System.out.println("The value of" + " newNum = " + newNum);

        // Add constant SECRET to newNum
        newNum = (newNum + SECRET);

        //Display the new value of newNum
        System.out.println("This is the value of" + " newNum = " + newNum + " with the SECRET value added. ");

        //Ask user to input a decimal number for the number of hours worked
        System.out.print("Please input a number between 0 and 70 up to two decimal places. ");
        hoursWorked = cin.nextDouble();

        //Calculate wages
        wages = (RATE*hoursWorked);

        //Display/Outputs
        System.out.println("Name: " + name);

        System.out.println("Pay Rate: $" + RATE);

        System.out.println("Hours Worked " + hoursWorked);

        System.out.println("Salary: $" + wages);


        
    }

}
