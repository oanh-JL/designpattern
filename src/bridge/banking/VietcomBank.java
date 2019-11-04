package bridge.banking;

import bridge.Account;
import bridge.Bank;

public class VietcomBank extends Bank {

    public VietcomBank(Account account) {
        super(account);
    }

    @Override
    public void execution() {
        System.out.println("Account at Vietcom request to executing");
        account.openAccount();
    }
}
