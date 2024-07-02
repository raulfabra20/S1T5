package n1.ex3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class SortTreeTxt {
    private String path;


    public static void createDirectoryFile(String path) {
        String outputFilePath = ("src/main/java/n1/ex3/Directory.txt");
        File directoryFile = new File(outputFilePath);
        BufferedWriter bfr = null;

        try {
            bfr = new BufferedWriter(new FileWriter(directoryFile));
            writeDirectoryFile(path, bfr);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bfr.close();
            } catch (Exception e) {

            }

        }
    }

    public static void writeDirectoryFile(String path, BufferedWriter bfr) {
        File file = new File(path);
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try {

            if (!file.exists()) {
                bfr.write("The path :" + file.getAbsolutePath() + " does not exist.");
                bfr.newLine();
            } else {
                if (file.isDirectory()) {
                    bfr.write("D: " + file.getName() + " / Last modified date: " + date.format(file.lastModified()));
                    bfr.newLine();
                    File[] files = file.listFiles();
                    if (files != null) {
                        Arrays.sort(files);
                        for (File f : files) {
                            writeDirectoryFile(f.getAbsolutePath(), bfr);
                        }
                    } else {
                        bfr.write("The path is null.");
                        bfr.newLine();
                    }
                } else if (file.isFile()) {
                    bfr.write("F: " + file.getName() + " / Last modified date: " + date.format(file.lastModified()));
                    bfr.newLine();
                } else {
                    bfr.write("The path is not correct.");
                    bfr.newLine();
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
