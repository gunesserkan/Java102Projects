package SerializationAndObjectStream;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        //Dosyaya Nesne yazma
//        Car c1=new Car("Audi","A6");
//
//        try {
//            FileOutputStream outputStream=new FileOutputStream("araba.txt");
//            ObjectOutputStream output = new ObjectOutputStream(outputStream);
//            output.writeObject(c1);
//            output.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        //Dosyadan Nesne okuma
        try {
            FileInputStream inputStream = new FileInputStream("araba.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Car newCar = (Car) objectInputStream.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());
            inputStream.close();
            objectInputStream.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
