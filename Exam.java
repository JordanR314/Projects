//sets up extended class Exam from Assessment
public class Exam extends Assessment{

    //Sets new private data fields
    private int questions;
    private int missed;

    //Creates public class method for instantiation with two parameters
    public Exam(int questions, int missed){
        this.questions = questions;
        this.missed = missed;

        //Calls setScore method to input the score parameter
        setScore(100-(100*this.missed/this.questions));
    }

    //Creates public method to get the points for each question in an exam object
    public int getPointsEach(){
        return 100/this.questions;
    }

    //Creates public method to get the number of missed questions for an exam object
    public int getNumMissed(){
        return this.missed;
    }

}
