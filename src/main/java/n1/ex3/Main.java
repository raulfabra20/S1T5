package n1.ex3;

import static n1.ex3.SortTreeTxt.createDirectoryFile;

public class Main {

    public static void main(String[] args) {

        if(args.length != 1){
            System.out.println("Argument number not valid.");
        } else{
            String input = args[0];
            SortTreeTxt.createDirectoryFile(input);
        }

    }
}
