package bridge;

import bridge.banking.TPBank;
import bridge.banking.VietcomBank;
import bridge.method.CheckingAccount;
import bridge.method.Withdrawal;

public class Client {

    public static void main(String[] args) {
        Bank VietcomBank = new VietcomBank(new Withdrawal(145699866, 20000));
        VietcomBank.execution();
        Bank TPBank = new TPBank(new CheckingAccount());
        TPBank.execution();
    }
}
