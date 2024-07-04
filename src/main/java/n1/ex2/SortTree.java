package n1.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class SortTree {
    private String path;

    public static void printDirectory(String path) throws FileNotFoundException {
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
                    throw new FileNotFoundException("Error listing the contents of the file");
                }
            } else if (file.isFile()){
                System.out.println("F: "+ file.getName()+" / Last modified date: "+date.format(file.lastModified()));
            } else {
                throw new FileNotFoundException("Error listing the contents of the directory");
            }
            }
        }

}
