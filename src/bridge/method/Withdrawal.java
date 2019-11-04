package bridge.method;

import bridge.Account;

public class Withdrawal implements Account {
    long seriesId;
    double cash;

    public Withdrawal(long seriesId, double cash) {
        this.seriesId = seriesId;
        this.cash = cash;
    }

    @Override
    public void openAccount() {
        System.out.println("account " + seriesId + " was pending to serving with cash " + cash);
    }
}
