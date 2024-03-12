package ByteArrayStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        String data = "Bitirme projesi ";
        ByteArrayOutputStream byteOutputArray=new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();
        try {
            byteOutputArray.write(dataByteArray);
            String newData=byteOutputArray.toString();
            System.out.println("Çıktı: "+newData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
