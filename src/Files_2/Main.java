package Files_2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileUtility.writeIntoFile("test.txt", "Hello World!", true);
    }
}
