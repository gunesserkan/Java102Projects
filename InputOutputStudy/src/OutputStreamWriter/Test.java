package OutputStreamWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Test {
    public static void main(String[] args) {
        String data="ğşiü";
        try {
            FileOutputStream fileOutput=new FileOutputStream("output.txt");
            OutputStreamWriter fileWriter= new OutputStreamWriter(fileOutput, Charset.forName("UTF8"));
            fileWriter.write(data);
            fileWriter.close();
            fileOutput.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
