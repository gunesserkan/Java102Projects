import java.util.ArrayList;
import java.util.List;

public abstract class Account implements Comparable<Account> {
    public User user;
    public Authentication authenticationStatus;

    public List<Insurance> insuranceList;

    public Account(User user) {
        this.user = user;
        authenticationStatus = Authentication.FAIL;
        insuranceList = new ArrayList<>();
    }

    public final void showUserInfo() {
        System.out.println("Hesap Bilgileri: ");
        System.out.println("Ad: " + user.getName() + " Soyad: " + user.getSurname() + " Email: " + user.getEmail() + " Son giriş: " + user.getLastLogin());
        System.out.println("--------------------------------------------");
        System.out.println("Sigorta bilgileri: ");
        System.out.println("-------------------------");
        insuranceList.forEach((o) -> {
            System.out.println("Sigorta Türü: " + o.getName() + "/ Sigorta bitiş tarihi: " + o.getInsuranceFinishDate());
        });
        System.out.println("--------------------------------------------");
        System.out.println("Adresler: ");
        System.out.println("-------------------------");
        user.getAddresses().forEach((o) -> {
            System.out.println("ID: " + o.getId() + " Açık adress: " + o.getExactAddress());
        });
        System.out.println("--------------------------------------------");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Authentication getAuthenticationStatus() {
        return authenticationStatus;
    }

    public List<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void addInsurance(Insurance insurance) {
        insuranceList.add(insurance);
    }

    public void setAuthenticationStatus(Authentication authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public void addAdress() {
        AddressManager.addAddress(user);
    }

    public void removeAdress() {
        AddressManager.removeAddress(user);
    }

    public List<Address> getAdreses() {
        return user.getAddresses();
    }

    public abstract boolean createInsurancePolicy();

    @Override
    public int compareTo(Account o) {
        return this.user.getName().compareTo(o.user.getName());
    }
}
