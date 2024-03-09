public class IndividualAccount extends Account {
    public IndividualAccount(User user) {
        super(user);
    }

    @Override
    public boolean createInsurancePolicy() {
        return false;
    }
}
