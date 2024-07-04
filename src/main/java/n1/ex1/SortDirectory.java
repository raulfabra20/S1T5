package n1.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class SortDirectory {

    public static void printDirectory(String path) throws FileNotFoundException {
        File file = new File(path);

        if(!file.exists()){
            System.out.println("The path :"+file.getAbsolutePath()+" does not exist.");
        } else {
            if(file.isDirectory()){
                File[] files = file.listFiles();
                if(files != null){
                    Arrays.sort(files);
                    for(File f : files){
                        System.out.println(f.getName());
                    }
                } else {
                    throw new FileNotFoundException("Error listing the contents of the file");
                }
            } else {
                throw new FileNotFoundException("Error listing the contents of the directory");
            }

        }


    }
}
