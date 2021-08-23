import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static String dayOfProgrammer(int y) {
        
        if(y>=1700 && y<=1917) {
            if(y%4 == 0) {
                return "12.09."+y;
            }
            else {
                return "13.09."+y;
            }
        }
        else {
            if(y == 1918) {
                return "26.09."+y;
            }
            else {
                if(y%400 == 0) {
                    return "12.09."+y;
                }
                else if(y%4 == 0 && y%100 != 0) {
                    return "12.09."+y;
                }
                else {
                    return "13.09."+y;
                }
            }
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
