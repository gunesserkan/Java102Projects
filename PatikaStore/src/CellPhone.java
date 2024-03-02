import java.util.Scanner;

public class CellPhone extends Product {
    public CellPhone() {
    }

    public CellPhone(int id, String name, double price, String brand, int storage, double screen, int ram) {
        super(id, name, price, brand, storage, screen, ram);
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
        int ram=input.nextInt();
        brand.addProduct(new CellPhone(brand.getProductIDCounter(), producName,price,brand.getName(),storage,screen,ram));
    }
}
