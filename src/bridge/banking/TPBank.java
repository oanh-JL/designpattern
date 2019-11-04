package bridge.banking;

import bridge.Account;
import bridge.Bank;

public class TPBank extends Bank {
    public TPBank(Account account) {
        super(account);
    }

    @Override
    public void execution() {
        System.out.println("Account at TP Bank  request to executing");
        account.openAccount();
    }
}
