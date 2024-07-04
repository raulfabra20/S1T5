package n1.ex4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class TxtReader {

    public static void readTxtFile(String path){

        try (BufferedReader bfr = new BufferedReader(new FileReader(path))){
            String line;
            while((line = bfr.readLine()) != null ) {
                    System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file. "+e.getMessage());
        }
}
}
