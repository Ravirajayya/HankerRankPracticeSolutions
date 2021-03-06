import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.lang.String;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String strTime) 
    {
        LocalTime time = LocalTime.parse(strTime.replaceAll("[^:\\d]", ""));
        String value = null;
        
        if(strTime.replaceAll("[:^\\d]", "").equals("AM"))
        {
            if(time.getHour() == 12 && time.getMinute() == 0)
                value = time.with(LocalTime.MIDNIGHT).format(DateTimeFormatter.ISO_LOCAL_TIME);
            else if(time.getHour() == 12 && time.getMinute() != 0)
                value = time.minusHours(12).toString();
            else
                value = time.minusHours(0).toString();
        }
        else
        {
            if(time.getHour() != 12)
                value = time.plusHours(12).toString();
            else
                value = time.plusHours(0).toString();
        }
        
        return value;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}