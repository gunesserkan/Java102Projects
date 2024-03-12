package BufferredInput_OutputSteam;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test2 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("deneme.txt");
            String data = "Buffered test";
            BufferedOutputStream bufferedOut = new BufferedOutputStream(file);
            byte[] byteArray = data.getBytes();
            bufferedOut.write(byteArray);
            bufferedOut.close();
            file.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
