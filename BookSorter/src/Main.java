import Model.Book;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();
        books.add(new Book("Sefiller", 680, "Victor Hugo", LocalDate.of(1862, 1, 1)));
        books.add(new Book("Suç Ve Ceza", 1263, "Dostoyevski", LocalDate.of(1866, 8, 5)));
        books.add(new Book("Savaş Ve Barış", 1476, "Tolstoy", LocalDate.of(1867, 10, 10)));
        books.add(new Book("Satranç", 75, "Stefan Zweig", LocalDate.of(1943, 7, 18)));
        books.add(new Book("Açlık", 80, "Knut Hamsun", LocalDate.of(1890, 12, 3)));
        System.out.println();
        System.out.println("##########--Alfabetik Olarak Sıralama---##########");
        System.out.println();
        books.forEach((o1) -> {
            System.out.println("Kitap Adı: " + o1.getName() + " Yazar Adı: " + o1.getAutHorName() + "Yayın Tarihi: " + o1.getPublishDate());
        });
        Set<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageCount() - o2.getPageCount();
            }
        }.reversed());
        books2.addAll(books);
        System.out.println();
        System.out.println("##########--Sayfa Sayısına Göre Sıralama---##########");
        System.out.println();
        books2.forEach((o1) -> {
            System.out.println("Kitap Adı: " + o1.getName() + " Yazar Adı: " + o1.getAutHorName() + "Sayfa Sayısı: " + o1.getPageCount());
        });

    }
}
