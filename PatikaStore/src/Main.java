import java.util.IllegalFormatException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PatikaStore patikaStore = new PatikaStore();
        addBrandAndProduct(patikaStore);
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("<<<PatikaStore>>>");
            System.out.println("1- Notebook");
            System.out.println("2- Cep telefonu");
            System.out.println("3- Marka listesi");
            System.out.println("4- ürün ekle");
            System.out.println("5- ürün Sil");
            System.out.println("6- id ile arama");
            System.out.println("0- Çıkış");
            System.out.print("Tercihiniz: ");
            switch (input.nextInt()) {
                case 0:
                    System.out.println("Yine Bekleriz...");
                    System.exit(1);
                    break;
                case 1:
                    patikaStore.getProductsList(1);
                    break;
                case 2:
                    patikaStore.getProductsList(2);
                    break;
                case 3:
                    System.out.println("Markalar:");
                    System.out.println("----------------------");
                    for (Brand brand : patikaStore.allBrands()) {
                        System.out.println("-"+brand.getName());
                    }
                    System.out.println("----------------------");
                    break;
                case 4:
                    try {
                        patikaStore.addProduct();
                    } catch (IllegalFormatException e) {
                        System.out.println("Hatalı giriş lütfen sayısal bir değer girin.");
                    }
                    break;
                case 5:
                    System.out.print("Ürün id girin: ");
                    int productId=input.nextInt();
                    patikaStore.deleteProduct(productId);
                    break;
                case 6:
                    System.out.print("Ürün id girin: ");
                    int getById=input.nextInt();
                    patikaStore.findProductById(getById);
            }
        }
    }

    private static void addBrandAndProduct(PatikaStore patikaStore) {
        patikaStore.addBrand(1, "LENOVO");
        patikaStore.addBrand(2, "MONSTER");
        patikaStore.addBrand(3, "CASPER");
        patikaStore.addBrand(4, "DELL");
        List<Brand> brands=patikaStore.allBrands();
    }
    private static void setNoteBookProperties(){

    }
    private static void setCellPhoneProperties(){

    }
}
