package n1.ex4;


import static n1.ex4.TxtReader.readTxtFile;

public class Main {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Argument number not valid.");
        } else {
            String input = args[0];
            TxtReader.readTxtFile(input);




        }
    }

}
