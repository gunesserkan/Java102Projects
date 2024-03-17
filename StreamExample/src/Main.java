import java.util.ArrayList;
import java.util.Comparator;

/**
 * Author: gunes
 * Project: StreamExample
 * E-mail: gunesserkan883@gmail.com
 * Creation Date: 3/17/2024 10:09 PM
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArray = new ArrayList<>();
        integerArray.add(25);
        integerArray.add(25);
        integerArray.add(25);
        integerArray.add(12);
        integerArray.add(3);
        integerArray.add(89);
        integerArray.add(25);
        integerArray.add(44);
        integerArray.add(100);
        integerArray.add(7);
        integerArray.add(63);

        //elemanları tek tek ekrana yazdırma
        integerArray.stream().forEach(integer -> System.out.println(integer));
        System.out.println("--------------------------------------------------");

        //filter kullanımı
        integerArray.stream().filter(i -> i > 60).forEach(i -> System.out.println(i));
        System.out.println("--------------------------------------------------");

        //tekrar eden verilerin distinct() ile filtrelenmesi
        integerArray.stream().distinct().forEach(i -> System.out.println(i));
        System.out.println("--------------------------------------------------");

        //değerleri sıralama, comparator ile kendi sıralama kuralımızı da belirleyebiliriz
        integerArray.stream().sorted().forEach(i -> System.out.println(i));
        System.out.println("--------------------------------------------------");

        //reversed ile tersten sıralama
        integerArray.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));
        System.out.println("--------------------------------------------------");

        //limit metodu ile istenilen adette eleman elde etme
        integerArray.stream().limit(5l).forEach(i-> System.out.println(i));
        System.out.println("--------------------------------------------------");

        //skip metodu ile atlama yapma
        integerArray.stream().skip(5l).limit(2l).forEach(i-> System.out.println(i));
        System.out.println("--------------------------------------------------");

        //akış içerisinde aranılan değerin var olup olmamasına göre tru/false döndürme
        System.out.println(integerArray.stream().anyMatch(i->i==25));
        System.out.println("--------------------------------------------------");

        //akış elemanlarının hepsinini kurala (i->i>10) uygun olup olmamasına göre true/false döndürür
        System.out.println(integerArray.stream().allMatch(i->i>10));
        System.out.println("--------------------------------------------------");

        //akış elemanlarının hiç birinin kurala (i->i>10) uygun olup olmamasına göre true/false döndürür
        System.out.println(integerArray.stream().noneMatch(i->i<0));
        System.out.println("--------------------------------------------------");

        //map() metodu ile akış elemanlarına değişikli uygulama
        integerArray.stream().map(i->i*2).forEach(i-> System.out.println(i));
        System.out.println("--------------------------------------------------");

    }
}
