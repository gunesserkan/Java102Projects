import javax.xml.crypto.Data;
import java.util.*;

public class AccountManager {
    private Set<Account> accounts = new TreeSet<>();

    public AccountManager() {
    }

    public Account login(String email, String password) throws InvalidAuthenticationException {
        Iterator<Account> iterator = accounts.iterator();
        while (iterator.hasNext()) {
            Account tempAccount = iterator.next();
            User tempUser = tempAccount.getUser();
            if (tempUser.getEmail().equals(email)
                    && tempUser.getPassword().equals(password)) {
                tempUser.setLastLogin(new Date().toString());
                tempAccount.setAuthenticationStatus(Authentication.SUCCESS);
                return tempAccount;
            }
        }
        throw new InvalidAuthenticationException();
    }

    public void createAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("1- Bireysel Hesap ");
        System.out.println("2- Kurumsal Hesap ");
        System.out.println("Hangi tür Hesap oluşturmak istersiniz?: ");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                accounts.add(createIndividualAccount());
                break;
            case 2:
                accounts.add(createEnterpriseAccount());
                break;
            default:
                System.out.println("Hatalı seçim");
        }
        System.out.println("Hesap başarıyla oluşturuldu giriş yapabilirsiniz.");

    }

    private Account createIndividualAccount() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ad: ");
        String name = input.nextLine();
        System.out.print("Soyad: ");
        String surname = input.nextLine();
        System.out.print("E-mail: ");
        String email = input.nextLine();
        System.out.print("Parola: ");
        String password = input.nextLine();
        System.out.print("Meslek: ");
        String job = input.nextLine();
        System.out.print("Yaş: ");
        int age = input.nextInt();
        return new IndividualAccount(new User(name, surname, email, password, job, age));
    }

    private Account createEnterpriseAccount() {
        //Enterprise hesap özellikleri ile Individual hesap özelliklerinin
        //değişiklik ggösterebilmesinden kaynaklı hesap oluşturma için farklı metodlar oluşturuldu.
        Scanner input = new Scanner(System.in);
        System.out.println("Ad: ");
        String name = input.nextLine();
        System.out.println("Soyad: ");
        String surname = input.nextLine();
        System.out.println("E-mail: ");
        String email = input.nextLine();
        System.out.println("Parola: ");
        String password = input.nextLine();
        System.out.println("Meslek: ");
        String job = input.nextLine();
        System.out.println("Yaş: ");
        int age = input.nextInt();
        return new EnterpriseAccount(new User(name, surname, email, password, job, age));
    }
}
