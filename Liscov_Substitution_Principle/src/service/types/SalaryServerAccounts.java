package service.types;

import service.Account;
import service.custom.WithDrawable;

public class SalaryServerAccounts extends WithDrawable {
    @Override
    public void deposit(double amount) {
        System.out.println (amount+" Salary Server deposit Account");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println (amount+" Salary Server withdraw Account");
    }
}
