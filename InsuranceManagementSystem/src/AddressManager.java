import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Scanner;

public class AddressManager {
    private static Scanner input;

    public static void addAddress(User user) {
        input = new Scanner(System.in);
        System.out.println("1 Ev adresi");
        System.out.println("2 İş adresi");
        System.out.print("Adres türü: ");
        int choise = input.nextInt();
        input.nextLine();
        System.out.print("Adres takma adı: ");
        String name = input.nextLine();
        System.out.print("Şehir: ");
        String city = input.nextLine();
        System.out.print("İlçe/semt: ");
        String district = input.nextLine();
        System.out.print("Mahalle: ");
        String neighbourhood = input.nextLine();
        System.out.print("Posta kodu: ");
        String postCode = input.nextLine();
        System.out.print("Açık adres: ");
        String exactAddress = input.nextLine();
        if (choise == 1) {
            user.getAddresses().add(new HomeAddress(name, city, district, neighbourhood, postCode, exactAddress));
        } else if (choise == 2) {
            user.getAddresses().add(new BusinessAddress(name, city, district, neighbourhood, postCode, exactAddress));
        }
    }

    public static void removeAddress(User user) {
        List<Address> adresses=user.getAddresses();
        System.out.print("Silinecek adres ID: ");
        int id = input.nextInt();
        for (Address tempAddress:adresses){
            if (tempAddress.getId()==id){
                adresses.remove(tempAddress);
                break;
            }
        }
    }
}
