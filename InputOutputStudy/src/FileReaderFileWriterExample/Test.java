package FileReaderFileWriterExample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.Charset;

public class Test {
    public static void main(String[] args) {
        try {
            FileReader readFile = new FileReader("deneme.txt", Charset.forName("UTF8"));
            int i= readFile.read();
            while (i!=-1){
                System.out.print((char) i);
                i= readFile.read();
            }
            readFile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
