import java.util.Arrays;
import java.util.Random;

public class IntArray {

    private int length;
    private int[] myArray;

    public IntArray(int l){
        this.length = l;
        this.myArray = new int[length];
    }

    public int size(){
        return length;
    }

    public void fillRand(){
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(6)+1;
        }
    }

    public void set(int element, int newValue){
        myArray[element] = newValue;
    }

    public int get(int element){
        return myArray[element];
    }

    public void clear(){
        myArray = new int[0];
    }

    public boolean isEmpty(){
        return myArray.length == 0;
    }

    public void sort(){
        Arrays.sort(myArray);
    }

    public String toString(){
        String output = "IntArray instance data: ";
        for (int i = 0; i < myArray.length; i++){
            output += "\nElement " + i + ": " + myArray[i];
        }
        return output + "\n";
    }
}
