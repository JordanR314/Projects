public class Runner { // Sets up runner class for main

    public static void main (String[]args) { // main for blueprint call

        Tests tester = new Tests(); // Initiates tester, calls getAverage, and print with toString method
        tester.getAverage();
        System.out.println(tester);
    }
}