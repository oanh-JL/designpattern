package bridge.method;

import bridge.Account;

public class SavingAccount implements Account {
    @Override
    public void openAccount() {
        System.out.println("Saving Account");
    }
}
