package BufferredInput_OutputSteam;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("deneme.txt");
            BufferedInputStream buffInput = new BufferedInputStream(fileInputStream);

            int i = buffInput.read();
            while (i!=-1){
                System.out.print((char) i);
                i=buffInput.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
