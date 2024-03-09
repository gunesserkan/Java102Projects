public class EnterpriseAccount extends Account{
    public EnterpriseAccount(User user) {
        super(user);
    }

    @Override
    public boolean createInsurancePolicy() {
        return false;
    }
}
