package service.types;

import service.Account;

public class SalaryServerAccounts extends Account {
    @Override
    public void deposit(double amount) {
        System.out.println (amount+" Salary Server deposit Account");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println (amount+" Salary Server withdraw Account");
    }
}
