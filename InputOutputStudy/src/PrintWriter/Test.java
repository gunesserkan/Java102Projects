package PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) {
        String data ="Java Öğreniyorum";
        try {
            PrintWriter writer=new PrintWriter("output.txt");
            writer.write(data);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
