package service.types;

import service.Account;
import service.custom.WithDrawable;

public class CurrentAcccounts extends WithDrawable {
    @Override
    public void deposit(double amount) {
        System.out.println (amount+" Current deposit Account");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println (amount+" Current withdraw Account");
    }
}
