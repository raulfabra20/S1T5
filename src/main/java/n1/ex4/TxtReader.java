package n1.ex4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class TxtReader {

    public static void readTxtFile(String path){
        BufferedReader bfr = null;


        try {
            bfr = new BufferedReader(new FileReader(path));
            String line;
            while((line = bfr.readLine()) != null ) {
                if(line  != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error ocurred while reading the file. "+e.getMessage());
        } finally {
            try {
                if (bfr != null) {
                    bfr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
}
