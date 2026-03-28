import java.util.Arrays;
import java.util.Random;

//Initializes the class IntArray
public class IntArray {

    //Sets private data fields for array and its length
    private int length;
    private int[] myArray;

    // Public method to instantiate array based on length parameter
    public IntArray(int l){
        this.length = l;
        this.myArray = new int[length];
    }

    //Public method to return the size of the array
    public int size(){
        return length;
    }

    //Public method to instantiate a Random object, iterate through the array, and random value (1-6)
    public void fillRand(){
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(6)+1;
        }
    }

    //Public method to change specific array index value
    public void set(int element, int newValue){
        myArray[element] = newValue;
    }

    //Public method to get specific array index value
    public int get(int element){
        return myArray[element];
    }

    //Public method to clear array
    public void clear(){
        myArray = new int[0];
    }

    // Public method to check if array to check if array is empty, returns boolean
    public boolean isEmpty(){
        return myArray.length == 0;
    }

    //Public method to sort array values, least to greatest
    public void sort(){
        Arrays.sort(myArray);
    }

    //Override of toString method to organize output of array, using for loop for each element
    public String toString(){
        String output = "IntArray instance data: ";
        for (int i = 0; i < myArray.length; i++){
            output += "\nElement " + i + ": " + myArray[i];
        }
        return output + "\n";
    }
}
