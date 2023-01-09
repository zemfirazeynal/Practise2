package Files.FilesPacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class P_2 {
    //Inputstream

    static String mainpath = "src/Files/FilesPacks/";

    public static void main (String [] args){


        try{
            File f1 = new File(mainpath+"myFile1.txt");
            FileInputStream inputStream = new FileInputStream(mainpath+"myFile1.txt");
            int i = inputStream.read();
            while (i!=-1){
                System.out.print((char)i);
                i=inputStream.read();
            }
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("___________________");

        try{
            File f2 = new File(mainpath+"myFile2.txt");
            FileInputStream inputStream = new FileInputStream(mainpath+"myFile2.txt");
            System.out.println("count of character: "+inputStream.available());
            int i = inputStream.read();
            i = inputStream.read();
            i = inputStream.read();
            i = inputStream.read();
            System.out.println(inputStream.available());
            inputStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }


        System.out.println("______________________");

        try {
            File f3 = new File(mainpath+"myFile3.txt");
            FileInputStream inputStream = new FileInputStream(mainpath+"myFile3.txt");
            inputStream.skip(15);
            int i = inputStream.read();
            while(i!=-1){
                System.out.print((char)i);
                i = inputStream.read();
            }inputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("______________________");

        try{
            File f4 = new File(mainpath+"myFile4.txt");
            FileInputStream inputStream = new FileInputStream(mainpath+"myFile4.txt");
            inputStream.skip(42);
            int i = inputStream.read();
            while(i!=-1){
                System.out.print((char)i);
                i = inputStream.read();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
