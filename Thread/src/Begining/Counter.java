package Begining;

public class Counter extends Thread {

    public Counter(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName()+" Çalıştı");
        for (int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
