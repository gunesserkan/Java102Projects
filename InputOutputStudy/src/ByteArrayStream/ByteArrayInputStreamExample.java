package ByteArrayStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) {
        byte[] array = {1, 2, 3, 54, 66};
        ByteArrayInputStream byteArray = new ByteArrayInputStream(array,2,3);
        System.out.println("Kullanılabilen byte sayısı : " + byteArray.available());
        int i = byteArray.read();
        while (i != -1) {
            System.out.println(i);
            i = byteArray.read();
        }
        try {
            byteArray.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

