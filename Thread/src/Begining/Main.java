package Begining;

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter("Begining.Counter-1");
        Counter c2= new Counter("Begining.Counter-2");
        c1.start();
        c2.start();
    }
}
