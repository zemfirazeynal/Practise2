package Files.FilesPacks;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P_3 {
    public static void main(String[] args) {

        //FileOutputStream

        try {
            FileOutputStream outputStream = new FileOutputStream(P_2.mainpath + "myfile2.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(P_2.mainpath + "myFile3.txt", true);

            outputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String data = "\n Zeynalli \n";


        try{
            FileOutputStream fileOutputStream = new FileOutputStream(P_2.mainpath+"myFile3.txt",true);

            byte [] bytes = data.getBytes();

            fileOutputStream.write(bytes);
            fileOutputStream.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}