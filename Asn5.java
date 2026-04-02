import java.util.ArrayList;

public class Asn5 {
    public static void main() {
        //Instantiates the first array that holds strings
        ArrayList<String> arr1 = new ArrayList<>();

        //Uses the add method to create a String Array with a size of 4
        arr1.add("First");
        arr1.add("Second");
        arr1.add("Third");
        arr1.add("Fourth");

        //Prints the description of the original list
        System.out.println("ArrayList 1 contents");

        //Prints the formatted output of the printed, original array by enhanced for-loop
        int acc = 0;
        for (String s: arr1){
            System.out.println("Index " + acc + ": " + s);
            acc++;
        }

        //Prints the description and results of the indexOf method on the String Array
        System.out.println("\nResult of 'indexOf method' for string 'Third'");
        System.out.println("String 'Third' has an index of: " + arr1.indexOf("Third"));

        //Uses the remove method on the String Array, index 2
        arr1.remove(2);

        //Prints the description of the remove method on the String Array
        System.out.println("\nArrayList 1 contents after 'remove method' for string at index 2");

        //Prints the formatted output of the printed array by enhanced for-loop
        acc = 0;
        for (String s : arr1) {
            System.out.println("Index " + acc + ": " + s);
            acc++;
        }

        //Instantiates the new Integer Array
        ArrayList<Integer> arr2 = new ArrayList<>();

        //Uses the add method to create an Integer Array with size 4
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);

        //Prints the title for the Integer Array's contents
        System.out.println("\nArrayList 2 contents");

        //Iterates through each index and prints the formatted list
        acc = 0;
        for (Integer s : arr2) {
            System.out.println("Index " + acc + ": " + s);
            acc++;
        }

        //Uses the set method to set the value at index 2 to integer value 8
        arr2.set(2, 8);

        //Prints the description of the set method on the original Integer Array
        System.out.println("\nArrayList 2 contents after 'set method' for Integer 8 at index 2");

        //Iterates through each index and prints the formatted list
        acc = 0;
        for (Integer s : arr2) {
            System.out.println("Index " + acc + ": " + s);
            acc++;
        }

        //Prints the description for using the size method and formats the output
        System.out.println("\nResult of 'size method' for ArrayList 2");
        System.out.println("The size of ArrayList 2 is: " + arr2.size());

    }
}
