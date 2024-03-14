package BufferedReaderBufferedWriterExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) {
        try {
            FileReader readFile = new FileReader("deneme.txt");
            BufferedReader readBuff = new BufferedReader(readFile);
            String line = readBuff.readLine();
            while (line != null) {
                System.out.println(line);
                line = readBuff.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
