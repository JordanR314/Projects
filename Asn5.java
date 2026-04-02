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

        //Creates the new
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);

        System.out.println("\nArrayList 2 contents");

        acc = 0;
        for (Integer s : arr2) {
            System.out.println("Index " + acc + ": " + s);
            acc++;
        }

        arr2.set(2, 8);

        System.out.println("\nArrayList 2 contents after 'set method' for Integer 8 at index 2");

        acc = 0;
        for (Integer s : arr2) {
            System.out.println("Index " + acc + ": " + s);
            acc++;
        }

        System.out.println("\nResult of 'size method' for ArrayList 2");
        System.out.println("The size of ArrayList 2 is: " + arr2.size());

    }
}
