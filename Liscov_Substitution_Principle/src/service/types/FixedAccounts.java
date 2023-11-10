package service.types;

import service.Account;
import service.custom.Fixed;

public class FixedAccounts extends Fixed {
    @Override
    public void deposit(double amount) {
        System.out.println (amount+" Fixed Account deposit");
    }

//    //cant be a withdraw account for fixedAccounts
//    @Override
//    public void withdraw(double amount) {
//        System.out.println (amount+" Fixed Account withdraw");
//    }
}
