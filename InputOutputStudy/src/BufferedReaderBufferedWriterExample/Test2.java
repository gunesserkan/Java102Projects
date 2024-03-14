package BufferedReaderBufferedWriterExample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Test2 {
    public static void main(String[] args) {
        String data ="Java Öğreniyorum";
        File file=new File("BufferedWriterTest.txt");

        try {
            FileWriter writeFile=new FileWriter(file, Charset.forName("UTF8"));
            BufferedWriter writeBuff=new BufferedWriter(writeFile);

            writeBuff.write(data);

            writeBuff.close();
            writeFile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
