package Files_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileIOStream {
    public static void main(String[] args) {

        try{
            FileInputStream fis = new FileInputStream("src/Files_3/input.txt");
            int i = fis.read();
            while(i!=-1) {
                System.out.print((char) i);
                i = fis.read();
            }
            fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("---------------");

        try{
            String data = "Salam Dunya";
            FileOutputStream fos = new FileOutputStream("src/Files_3/output.txt");
            byte [] bytes = data.getBytes(StandardCharsets.UTF_8);
            fos.write(bytes);
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
