package Files_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {
    private static void writeIntoFile(String fileName,String text, boolean append) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, append));){
            bw.write(text);
        }
    }

    public static void writeIntoFile(String fileName,String text) throws IOException {
        writeIntoFile(fileName,text,false);
    }

    public static void appendIntoFile(String fileName,String text) throws IOException {
        writeIntoFile(fileName,text,true);
    }
}
