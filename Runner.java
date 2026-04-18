import javax.swing.JOptionPane;
/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */

public class Runner {

        public static void main(String[] args)
        {
            //try block to check the inputs as integers and the questions as not 0
            try {
                String input;     // To hold input
                int questions;    // Number of questions
                int missed;       // Number of questions missed

                // Get the number of questions on the exam
                input = JOptionPane.showInputDialog("How many questions are on the exam?");
                questions = Integer.parseInt(input);

                // Get the number of questions the student missed
                input = JOptionPane.showInputDialog("How many questions did the student miss?");
                missed = Integer.parseInt(input);

                // Create an Exam object
                Exam exam = new Exam(questions, missed);

                // Display the test results
                String message = "Each question counts " + exam.getPointsEach();
                message += " points.\nThe exam score is " + exam.getScore();
                message += "\nThe exam grade is " + exam.getGrade();
                JOptionPane.showMessageDialog(null, message);

                System.exit(0);
            }
            // Catches the exception for input not being an integer
            catch (NumberFormatException e){
                System.out.println("NumberFormatException: " + e.getMessage());
                System.exit(0);
            }
            // Catches the exception for when the questions are 0 and the questions missed are 0
            catch (ArithmeticException e){
                System.out.println("ArithmeticException: " + e.getMessage());
                System.exit(0);
            }
        }
    }


