
public class Tests {
    public static void main(String[] args)
    {
        // Attributes the variables for the three test scores
        double Score1 = 76.5;
        double Score2 = 95.8;
        double Score3 = 84.9;

        // Calculates the average of the test scores by dividing the sum by 3
        double avg = (Score1 + Score2 + Score3)/3;

        // Rounds the average to 2 decimal places using the round method
        double davg = Math.round(avg * 100.0)/100.0;

        // Prints the three test scores and their average
        System.out.println("Test Score 1: " + Score1);
        System.out.println("Test Score 2: " + Score2);
        System.out.println("Test Score 3: " + Score3);
        System.out.println("The average of the 3 tests scores is: " + davg);
    }

}

