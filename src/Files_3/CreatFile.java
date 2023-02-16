package Files_3;

import java.io.File;

public class CreatFile {
    public static void main(String[] args) {
        try {
            File f = new File("src/Files_3/output.txt");
            f.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
