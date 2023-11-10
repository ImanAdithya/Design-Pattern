package service.types;

import service.Account;

public class CurrentAcccounts extends Account {
    @Override
    public void deposit(double amount) {
        System.out.println (amount+" Current deposit Account");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println (amount+" Current withdraw Account");
    }
}
