package FileReaderFileWriterExample;

import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        String data = "Java öğreniyorum";
        try {
            FileWriter writerFİle=new FileWriter("fileWriterOut.txt");
            writerFİle.write(data);
            writerFİle.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
