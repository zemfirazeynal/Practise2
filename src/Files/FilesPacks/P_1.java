package Files.FilesPacks;

import java.io.File;
import java.io.IOException;

public class P_1 {
    public static void main(String[] args) {

        String mainpath = "src/Files/FilesPacks/";
        File file1 = new File("File1.txt");

        try {
            System.out.println(file1.createNewFile());
            System.out.println(file1.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file2 = new File (mainpath+"File2.pdf");

        try{
            System.out.println(file2.createNewFile());
            System.out.println(file2.getName());
        }catch (IOException e){
            e.printStackTrace();
        }

        File file3 = new File (mainpath+"File3.jpg");

        try{
            System.out.println(file3.createNewFile());
            System.out.println(file3.getName());
        }catch (IOException e){
            e.printStackTrace();
        }

        //System.out.println(file2.delete());
        //System.out.println(file3.delete());

        File pack = new File(mainpath+"Pack");
        System.out.println(pack.mkdir());

        File packs = new File((mainpath+"Packs/Pack1/Pack2/Pack3"));
        System.out.println(packs.mkdirs());

        File file4 = new File( mainpath+ "Packs/Pack1/Pack2/Pack3/File4.txt");

        try{
            System.out.println(file4.createNewFile());
            System.out.println(file4.getName());
        }catch(IOException e){
            e.printStackTrace();
        }





    }
}
