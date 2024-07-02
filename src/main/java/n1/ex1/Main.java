package n1.ex1;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if(args.length != 1){
            System.out.println("Argument number not valid.");
        } else{
            String input = args[0];
            SortDirectory.printDirectory(input);
        }







        //javac  *.java   compila todos los archivos java de la carpeta.
        // n1ex1.Main

        // C:\Users\Raúl\IdeaProjects\S1T5\src\main\java\n1\ex1\List     ruta directorio.



    }

}
