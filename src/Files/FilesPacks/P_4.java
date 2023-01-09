package Files.FilesPacks;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class P_4 {
    public static void main (String [] args) throws IOException {

        byte [] list = {90, 101, 109, 102, 105, 114, 97};

        ByteArrayInputStream inputStream = new ByteArrayInputStream(list);
        int i = inputStream.read();

        while(i!=-1){
            System.out.println((char)i);
            i = inputStream.read();
        }
        inputStream.close();


        System.out.println();
        System.out.println("-------------");

        ByteArrayInputStream inputStream2 = new ByteArrayInputStream(list);
        int i2 = (int) inputStream2.skip(3);

        while(i2!=-1){
            System.out.println((char)i2);
            i2 = inputStream2.read();
        }
        inputStream2.close();

        System.out.println();
        System.out.println("----------------");

        ByteArrayInputStream inputStream3 = new ByteArrayInputStream(list, 0,3);
        int i3 =inputStream3.read();

        while (i3!=-1){
            System.out.print((char)i3);
            i3 = inputStream3.read();
        }
        inputStream3.read();
        inputStream3.close();

        System.out.println();
        System.out.println("----------------");

        ByteArrayInputStream inputStream4 = new ByteArrayInputStream(list);
        int i4 =inputStream4.read();
        i4 =inputStream4.read();

        System.out.println(inputStream4.available());
        inputStream4.close();


    }

}
