package objects.account;

import objects.Account;
import objects.insurance.Insurance;
import org.jetbrains.annotations.NotNull;

public class Individual extends Account {


    public Individual(User user) {
        super(user);
    }

    @Override
    public boolean addInsurance(Insurance insurance) {
        return false;
    }

    @Override
    public int compareTo(@NotNull Account o) {
        return o.getUser().getFirstName().charAt(0);
    }
}
