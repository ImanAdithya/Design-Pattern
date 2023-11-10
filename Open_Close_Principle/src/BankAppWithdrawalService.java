import service.Account;

public class BankAppWithdrawalService {

    Account account;

    public BankAppWithdrawalService(Account account){
        this.account=account;
    }

    public void depositToAccount(double amount){
        account.deposit (amount);
    }

    public void withDrawFromAccount(double amount){
        account.withdraw (amount);
    }


//Violate Open Close Principle
//    public void depositToSavingAccount(double amount){
//        System.out.println (amount+" Deposit your Saving Account..");
//    }
//
//    public void depositToCurrentAccount(double amount){
//        System.out.println (amount+" Deposit your Current Account..");
//    }
//
//    public void withDrawingFormSavingAccount(double amount){
//        System.out.println (amount+" withDrawing Form Saving Account..");
//    }
//
//    public void withDrawingFormCurrentAccount(double amount){
//        System.out.println (amount+" withDrawing Form Current Account..");
//    }
//
//    public void DepositFormSalaryServerAccount(double amount){
//        System.out.println (amount+" Deposit Form Salary Server Account..");
//    }
//    public void withDrawingFormSalaryServerAccount(double amount){
//        System.out.println (amount+" withDrawing Form Salary Server Account..");
//    }

}
