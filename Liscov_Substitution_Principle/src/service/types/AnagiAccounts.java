package service.types;

import service.Account;
import service.custom.WithDrawable;

public class AnagiAccounts extends WithDrawable {
    @Override
    public void deposit(double amount) {
        System.out.println (amount+" Anagi deposit Account");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println (amount+" Anagi withdraw Account");
    }
}
