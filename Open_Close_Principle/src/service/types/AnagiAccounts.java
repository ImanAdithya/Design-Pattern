package service.types;

import service.Account;

public class AnagiAccounts extends Account {
    @Override
    public void deposit(double amount) {
        System.out.println (amount+" Anagi deposit Account");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println (amount+" Anagi withdraw Account");
    }
}
