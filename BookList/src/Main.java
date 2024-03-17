import javax.xml.crypto.Data;
import java.util.*;

/**
 * Author: gunes
 * Project: BookList
 * E-mail: gunesserkan883@gmail.com
 * Creation Date: 3/17/2024 11:17 PM
 */
public class Main {
    public static void main(String[] args) {
        //Book class'ından 10 adet nesne üretilmesi
        Book book1 = new Book("book1", 100, "author1", new Date(1905 - 2 - 11));
        Book book2 = new Book("book2", 25, "author2", new Date(1910 - 5 - 21));
        Book book3 = new Book("book3", 300, "author3", new Date(1920 - 3 - 31));
        Book book4 = new Book("book4", 70, "author4", new Date(1930 - 8 - 18));
        Book book5 = new Book("book5", 500, "author5", new Date(1940 - 12 - 7));
        Book book6 = new Book("book6", 600, "author6", new Date(1950 - 6 - 26));
        Book book7 = new Book("book7", 57, "author7", new Date(1960 - 4 - 13));
        Book book8 = new Book("book8", 800, "author8", new Date(1970 - 1 - 29));
        Book book9 = new Book("book9", 900, "author9", new Date(1980 - 11 - 30));
        Book book10 = new Book("book10", 1000, "author10", new Date(1990 - 9 - 6));
        //Book türünde bir ArrayList oluşturulup eleman eklenmesi
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        //Kitap adı ve yazar adlarını tutacak Map oluşturulması
        Map<String, String> booksMap = new HashMap<>();
        //Stream api kullanarak kitap adı ve yazar adının eklenmesi
        books.stream().forEach(o -> {
            booksMap.put(o.getName(), o.getAuthorName());
        });
        //stream api kullanılarak sayfa sayısı 100'den büyük olan kitaplardan oluşan alt listenin oluşturulması
        List<Book> subList = new ArrayList<>();
        books.stream().filter(o -> o.getPageCount() > 100).forEach(o -> subList.add(o));

        //Kitap bilgilerinin ekrana yazılması
        System.out.println("Kitap bilgileri:");
        books.stream().forEach(
                o -> System.out.println("Kitap adı: " + o.getName() + " Kitap yazarı: " + o.getAuthorName() + " Yayın tarihi: " + o.getRealeaseDate().getTime()));
        System.out.println();
        // Maplenen bilgilerin ekrana yazılması
        System.out.println("Maplenen bilgiler: ");
        books.stream().forEach(o -> {
            System.out.println(booksMap.get(o.getName()));
        });
        System.out.println();
        //sayfa sayısı 100'den büyük olan kitap listesinin yazıldırılması
        System.out.println("Sayfa sayısı 100'den büyük olan kitaplar: ");
        subList.stream().forEach(o -> {
            System.out.println("Kitap adı: " + o.getName() + " Kitap yazarı: " + o.getAuthorName() + " Yayın tarihi: " + o.getRealeaseDate().getTime());
        });

    }
}
