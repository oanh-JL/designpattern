package bridge.method;

import bridge.Account;

public class CheckingAccount implements Account {
    @Override
    public void openAccount() {
        System.out.println("Checking Account");
    }
}
