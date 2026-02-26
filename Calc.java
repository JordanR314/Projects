// Sets up Calc class for runner
public class Calc {

// Creates private variable data fields
    private double num1;
    private double num2;

// Sets default values for Calc class
    public Calc() {
        this.setNum1(0);
        this.setNum2(0);
    }

// setNum method for num1, set to var newNum1
    public void setNum1(double newNum1) {
        this.num1 = newNum1;
    }

// getNum method for num1, returns value
    public double getNum1() {
        return this.num1;
    }

// setNum method for num2, set to var newNum2
    public void setNum2(double newNum2) {
        this.num2 = newNum2;
    }

// getNum method for num2, returns value
    public double getNum2() {
        return this.num2;
    }

// add method, returning the sum
    public double add(){
        return num1 + num2;
    }

// subtract method, returning difference
    public double subtract(){
        return num1 - num2;
    }

// multiply method, returning product
    public double multiply(){
        return num1 * num2;
    }

// divide method, returning quotient
    public double divide(){
        return num1/num2;
    }

// toString method, return formatted output
    public String toString(){
        String output = "Num1: " + num1;
        output += "\nNum2: " + num2;
        return output;
    }
}