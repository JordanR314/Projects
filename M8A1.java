import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.*;

public class M8A1 {
    public static void main(String[] args){
        //Try block file read/write
        try{
            //Instantiate file and buffered reader object
            File fileName = new File("pay.csv");
            BufferedReader buff = new BufferedReader(new FileReader(fileName));

            //Read first line of file, add WeeklyPay to title
            String title = buff.readLine();
            title += ",WeeklyPay";

            //ArrayList for holding data
            ArrayList<String> dataArray = new ArrayList<>();

            //Initialize string for each next line
            String line = buff.readLine();

            //While loop to read each line of data, put within String Array
            while (line != null){
                String[] tempArray = line.split(",");

                //File data is transferred to the ArrayList
                for (int i = 0; i < 3; i++){
                    dataArray.add(tempArray[i]);
                }

                //Read next line of data
                line = buff.readLine();
            }

            //ArrayList for holding the weekly pay data, Decimal format to format strings
            ArrayList<String> WeeklyPayArray = new ArrayList<>();
            DecimalFormat deci = new DecimalFormat("$#,###.00");

            //For loop to iterate the parsing of rate and hour data
            for (int i = 1; i < 23; i+=3){
                //Parses both rate data and hour data
                double rate = Double.parseDouble(dataArray.get(i));
                int hours = Integer.parseInt(dataArray.get(i+1));

                //If-else statement for calculating the weekly pay
                if(hours > 40){
                    double wp = (40*rate + 1.5*rate*(hours-40));
                    String weeklyPay = deci.format(wp);
                    WeeklyPayArray.add(weeklyPay);
                }
                else{ //No overtime hours
                    double wp = (40*rate);
                    String weeklyPay = deci.format(wp);
                    WeeklyPayArray.add(weeklyPay);
                }
            }

            //Instantiate BufferedWriter object for output stream
            BufferedWriter buffer = new BufferedWriter(new FileWriter("output.csv"));
            buffer.write(title + "\n");

            //For loop to iterate the output for lines excluding the title
            for (int i = 0; i < 22; i+=3){
                String output = dataArray.get(i) + ",";
                output += dataArray.get(i+1) + ",";
                output += dataArray.get(i+2) + ",";
                output += WeeklyPayArray.get(i/3) + "\n";
                buffer.write(output);
            }
            //Close outstream
            buffer.close();
        }
        //Catch exceptions
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
