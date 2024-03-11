<<<<<<< HEAD
package File;

import java.io.File;
import java.io.IOException;

public class ClassFileExample {
=======
import java.io.File;
import java.io.IOException;

public class Main {
>>>>>>> e2a9054428be22c90f9e653ed84a45198f52364d
    public static void main(String[] args) {
        File file = new File("deneme.txt");
        //Dosya oluşturma
        createFİle(file);
        //Dosya silme
//        deleteFile(file);

    }

    public static void createFİle(File file) {
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu.");
            } else {
                System.out.println("Dosya Zaten mevcut!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteFile(File file) {
        if (file.delete())
            System.out.println("Dosya silindi.");
        else
            System.out.println("Dosya mevcut değil");
    }
}

