package Files_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileIOStream {
    public static void main(String[] args) {

        try{
            FileInputStream fileInputStream = new FileInputStream("src/Files_3/input.txt");
            int i = fileInputStream.read();
            while(i!=-1) {
                System.out.print((char) i);
                i = fileInputStream.read();
            }
            fileInputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("---------------");

        try{
            String data = "I am FileOutputStream operation";
            FileOutputStream fileOutputStream = new FileOutputStream("src/Files_3/output.txt", true);
            byte [] bytes = data.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
