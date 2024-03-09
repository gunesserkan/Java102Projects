import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        Scanner input = new Scanner(System.in);
        boolean isProgramContinue = true;
        boolean isContinue = false;
        while (isProgramContinue) {
            System.out.println("********************************************");
            System.out.println("<<<Sigorta Yönetim Sistemi>>>");
            System.out.println("********************************************");
            System.out.println("1 Giriş yap");
            System.out.println("2 Kayıt oluştur");
            System.out.println("3- programı sonlandır");
            System.out.print("Yapmak istediğiniz işlem: ");
            int choise = input.nextInt();
            input.nextLine();
            try {
                switch (choise) {
                    //Case 1 begin
                    case 1:
                        System.out.print("E-mail: ");
                        String email = input.nextLine();
                        System.out.print("Password: ");
                        String password = input.nextLine();
                        Account account = login(email, password, accountManager);
                        if (account != null)
                            isContinue = true;
                        while (isContinue) {
                            System.out.println("********************************************");
                            account.showUserInfo();
                            System.out.println("1- Adres ekleme");
                            System.out.println("2- Adres silme");
                            System.out.println("3- Adres listeleme");
                            System.out.println("4- Sigorta oluşturma");
                            System.out.println("5- çıkış yap");
                            System.out.print("Yapmak istediğiniz işlemi seçin: ");
                            int choose = input.nextInt();
                            switch (choose) {
                                case 1:
                                    account.addAdress();
                                    break;
                                case 2:
                                    account.removeAdress();
                                    break;
                                case 3:
                                    System.out.println("--------------------------------------------");
                                    account.getAdreses().forEach((o) -> {
                                        System.out.println("Adres ID: " + o.getId() + " Adres takma adı: " + o.getName() + " açık adres: " + o.getExactAddress());
                                    });
                                    System.out.println("----------------------------------------------");
                                    break;
                                case 4:
                                    System.out.println("-------------------------------------------------");
                                    Insurance.showInsurances();
                                    System.out.print("Hangi tür sigorta oluşturmak istersiniz: ");
                                    int insuranceCoose = input.nextInt();
                                    Insurance newInsurance = Insurance.createInsurance(insuranceCoose);
                                    if (newInsurance != null)
                                        account.addInsurance(newInsurance);
                                    else
                                        System.out.println("Lütfen seçiminizi kontrol ederek tekrar deneyiniz.");
                                    break;
                                case 5:
                                    isContinue = false;
                                    break;
                            }
                        }
                        break;
                    //Case 1 End
                    case 2:
                        // Case 2 begin
                        createAccount(accountManager);
                        break;
                    //Case 2 end
                    case 3:
                        //Case 3 begin
                        System.exit(1);
                        //Case 3 end
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static Account login(String email, String password, AccountManager accountManager) {
        Account account = null;
        try {
            account = accountManager.login(email, password);
        } catch (Exception e) {
            System.out.println("Hata!!!");
            System.out.println(e.getMessage());
        }
        return account;
    }

    public static void createAccount(AccountManager accountManager) {
        accountManager.createAccount();
    }
}
