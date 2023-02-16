package Files_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOStream {
    public static void main(String[] args) {

        try{
            FileInputStream fins = new FileInputStream("src/Files_3/input.txt");
            int i = fins.read();
            while(i!=-1) {
                System.out.print((char) i);
                i = fins.read();
            }
            fins.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("---------------");

    }
}
