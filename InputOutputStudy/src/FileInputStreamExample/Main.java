package FileInputStreamExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("deneme.txt");
            int i = input.read();
            while (i!=-1){
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
