package n1.ex2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class SortTree {
    private String path;

    public static void printDirectory(String path){
        File file = new File(path);
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

        if(!file.exists()){
            System.out.println("The path :"+file.getAbsolutePath()+" does not exist.");
        } else {
            if (file.isDirectory()) {
                System.out.println("D: "+ file.getName()+" / Last modified date: "+date.format(file.lastModified()));
                File[] files = file.listFiles();
                if (files != null) {
                    Arrays.sort(files);
                    for (File f : files) {
                        printDirectory(f.getAbsolutePath());
                    }
                } else {
                    System.out.println("The path is null.");
                }
            } else if (file.isFile()){
                System.out.println("F: "+ file.getName()+" / Last modified date: "+date.format(file.lastModified()));
            } else {
                System.out.println("The path is not correct.");
            }
            }
        }

}
