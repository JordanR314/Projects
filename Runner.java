//this class tests all methods in the Calc class
//the Calc class exposes the following methods:
//add, subtract, multiply, divide
//user is prompted for input
import java.util.InputMismatchException;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        //instantiate a Calc object
        Calc myCalculator = new Calc();
        //get user input for two numbers
        Scanner scan = new Scanner(System.in);

        // Setup for n1 value and boolean, input checking
        double n1 = 0.0;
        boolean corr = false;

        while (!corr) { // While loop to repeatedly check input
            System.out.println("Please enter the first number: ");

            if (scan.hasNextDouble()) { // Checks if the input is a double
                n1 = scan.nextDouble();
                corr = true; // Input is valid, exit the loop
            }
            else { // Input is invalid
                System.out.println("Please enter a valid input: ");
                scan.next(); // Takes the invalid input
            }
        }

        // Setup for n2 value and boolean, input checking
        double n2 = 0.0;
        boolean corr1 = false;

        while (!corr1) { // While loop to repeatedly check input
            System.out.println("Please enter the second number: ");

            if (scan.hasNextDouble()) { // Checks if the input is a double
                n2 = scan.nextDouble();
                corr1 = true; // Input is correct
            }
            else { // Input is invalid
                System.out.println("Please enter a valid input: ");
                scan.next(); // Takes the invalid input
            }
        }

        //pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        //output from Calc instance
        System.out.println(myCalculator);

        //examining the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        //calling Calc methods directly
        //can use a local variable for sum if you need that value for another calculation
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);

        //or if you don't, then just display the difference, product and quotient
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }
}
