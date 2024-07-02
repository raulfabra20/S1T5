package n1.ex2;


import n1.ex2.SortTree;

public class Main {
    public static void main(String[] args) {

        if(args.length != 1){
            System.out.println("Argument number not valid.");
        } else{
            String input = args[0];
            SortTree.printDirectory(input);
        }


    }
}
