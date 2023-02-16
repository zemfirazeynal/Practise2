package Files_2;

import java.io.*;

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

    public static void writeIntoFile2(String fileName, byte [] data) throws Exception{
        File file = new File(fileName);
        FileOutputStream fops = new FileOutputStream(file);

        fops.write(data);
        fops.flush();
        fops.close();

    }
}
