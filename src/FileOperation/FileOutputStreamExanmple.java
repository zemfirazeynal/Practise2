package FileOperation;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamExanmple {
    public static void main(String[] args) {

        String mainPath = "src/FileOperation/";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(mainPath+"fileop.txt");
            fileOutputStream.write(1997);
            fileOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        String data = "I am fileOutputStream in byte";

        try{
            FileOutputStream fileOutputStream = new FileOutputStream(mainPath+"fileop.txt", true);
            byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(dataBytes);
            fileOutputStream.close();
        }catch (Exception e){
            System.out.println(e);

        }

    }
}
