package service.types;

import service.Account;
import service.custom.WithDrawable;

public class SavingAccounts extends WithDrawable {
    @Override
    public void deposit(double amount) {
        System.out.println (amount+" Saving deposit Account");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println (amount+" Saving withdraw Account");
    }
}
