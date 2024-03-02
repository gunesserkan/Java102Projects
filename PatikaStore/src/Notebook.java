import java.util.Scanner;

public class Notebook extends Product {
    double camera;
    double battery;
    String color;

    public Notebook() {
    }

    public Notebook(int id, String name, double price, String brand, int storage, double screen, int ram, double camera, double battery, String color) {
        super(id, name, price, brand, storage, screen, ram);
        this.camera = camera;
        this.battery = battery;
        this.color = color;
    }

    @Override
    public void createProduct(Brand brand) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ürün adı: ");
        String producName = input.nextLine();
        System.out.print("Fiyat: ");
        double price = input.nextDouble();
        System.out.print("Depolama: ");
        int storage = input.nextInt();
        System.out.print("Ekran: ");
        int screen = input.nextInt();
        System.out.print("Ram: ");
        int ram = input.nextInt();
        System.out.print("Kamera: ");
        double camera = input.nextDouble();
        System.out.print("Batarya: ");
        double battery = input.nextDouble();
        System.out.print("Renk: ");
        input.nextLine();
        String color = input.nextLine();
         brand.addProduct(new Notebook(brand.getProductIDCounter(), producName, price,brand.getName(), storage, screen, ram, camera, battery, color));
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
