import java.util.Scanner;

public abstract class Product {
    int id;
    String name;
    double price;
    String brand;
    int storage;
    double screen;
    int ram;

    public Product() {
    }

    public Product(int id, String name, double price, String brand, int storage, double screen, int ram) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.storage = storage;
        this.screen = screen;
        this.ram = ram;
    }
    public abstract void createProduct(Brand brand);
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
