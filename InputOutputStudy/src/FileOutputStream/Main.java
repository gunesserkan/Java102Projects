package FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileOutputStream output=new FileOutputStream("deneme.txt",true);
            String text="\n Deneme yazısı, bu yöntem ile dosyaya yazma işlemi gerçekleştirilir.";
            byte[] bytesOftext=text.getBytes();
            output.write(bytesOftext);
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
