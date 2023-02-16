package Files_3;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileReaderWriter {
    public static void main(String[] args) {
        String data = "I am FileWriter operation";

        try{
            FileWriter fileWriter = new FileWriter("src/Files_3/output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(data);
            bufferedWriter.close();
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
