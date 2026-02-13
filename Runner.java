import java.util.Scanner;
public class Runner {
    // Public main to instantiate both pets and print the state and name
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // Instantiate first pet using default constructor
        Pet Pet1 = new Pet();
        System.out.println(Pet1);

        // Instantiate second pet using methods
        Pet Pet2 = new Pet();
        Pet2.setName("Charlie");
        Pet2.setType("Dog");
        Pet2.setAge(5);
        System.out.println("\n" + Pet2);

        // Instantiate third pet with inputs from scanner class
        Pet Pet3 = new Pet();
        System.out.println("\nEnter animal type:");
        Pet3.setType(scnr.nextLine());
        System.out.println("Enter animal name:");
        Pet3.setName(scnr.nextLine());
        System.out.println("Enter animal age:");
        Pet3.setAge(scnr.nextInt());
        System.out.println("\n" + Pet3);

    }
}
