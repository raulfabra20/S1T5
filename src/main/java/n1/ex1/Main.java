package n1.ex1;

import java.io.File;


public class Main {
    public static void main(String[] args) {

        if(args.length != 1){
            System.out.println("Argument number not valid. Please provide a single directory path.");
        } else{
            String input = args[0];
            SortDirectory.printDirectory(input);
        }

    }

}
