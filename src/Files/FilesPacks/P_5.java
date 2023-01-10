package Files.FilesPacks;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class P_5 {
    public static void main(String[] args) throws IOException {
        String data = "Zem Zeyn 15041997 !!!...";

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        byte [] bytes = data.getBytes(StandardCharsets.UTF_8);

        byteArrayOutputStream.write(bytes);
        System.out.print(byteArrayOutputStream);
        byteArrayOutputStream.close();

    }
}
