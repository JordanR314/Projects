import java.util.Scanner; // Import Scanner

public class Tests { // Sets up class Tests with private data fields
    private double average;
    private int count;
    private int score;

    public Tests(){ // Builds constructor for Tests with methods getCount and setScore
        this.getCount();
        this.setScore(0);
    }

    public void getAverage() { // Method for getting the average of the scores, scanner initiate and sets sum and count
        Scanner scnr = new Scanner(System.in);
        double sumofscores = 0.0;
        count = 0;

        while (true) { // While loop for entering scores
            System.out.println("Enter a test score (-1 to quit)");
            score = scnr.nextInt();

            if (score == -1) { // if score is -1, breaks loop
                break;
            }

            sumofscores += score; // attributes the score to sum and adds 1 to count for each score
            count++;
        }

        if (count == 0) { // If no scores, average will be NaN
            average = sumofscores / count;
        }
        else { // Calculates average from sum and scores
            average = sumofscores / count;
        }
    }

    public int getCount(){ // Sets getCount method for getting the count
        return count;
    }

    void setScore(int newScore){ // Sets setScore method to set current score
        this.score = newScore;
    }

    public int getScore(){ // Sets getScore method to get the current score
        return this.score;
    }

        public String toString () { // Sets toString method to format the output with count and average
            String Output = "The average of the " + count + " scores entered is ";
            return Output + String.format("%.2f", average);
        }
    }