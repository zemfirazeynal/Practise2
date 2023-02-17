package FileOperation;

import java.io.File;

public class CreatNewFileExample {
    public static void main(String[] args) {

        String mainPath = "src/FileOperation/";
        try{
            File file = new File(mainPath+"fileop.txt");
            file.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
