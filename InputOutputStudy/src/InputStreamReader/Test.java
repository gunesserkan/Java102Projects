package InputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("deneme.txt");
            InputStreamReader inputReader=new InputStreamReader(fileInput,"UTF8");
            System.out.print("Karakter seti:");
            System.out.println(inputReader.getEncoding());
            int i =inputReader.read();
            while (i!=-1){
                System.out.print((char)+i);
                i=inputReader.read();
            }
            fileInput.close();
            inputReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
