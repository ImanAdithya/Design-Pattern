package service.types;

import service.Account;

public class SavingAccounts extends Account {
    @Override
    public void deposit(double amount) {
        System.out.println (amount+" Saving deposit Account");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println (amount+" Saving withdraw Account");
    }
}
