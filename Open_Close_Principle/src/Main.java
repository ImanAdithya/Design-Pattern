import service.Account;
import service.types.AnagiAccounts;
import service.types.CurrentAcccounts;
import service.types.SalaryServerAccounts;
import service.types.SavingAccounts;

public class Main {
    public static void main(String[] args) {

        Account savingAccount=new SavingAccounts ();
        BankAppWithdrawalService b1=new BankAppWithdrawalService (savingAccount);
        b1.depositToAccount (100000);
        b1.withDrawFromAccount (5000);

        Account currentAccount=new CurrentAcccounts ();
        BankAppWithdrawalService b2=new BankAppWithdrawalService (currentAccount);
        b2.depositToAccount (200000);
        b2.withDrawFromAccount (1000);


        Account salaryServerAccount=new SalaryServerAccounts ();
        BankAppWithdrawalService b3=new BankAppWithdrawalService (salaryServerAccount);
        b3.depositToAccount (70000);
        b3.withDrawFromAccount (8000);

        Account anagiAccount=new AnagiAccounts ();
        BankAppWithdrawalService b4=new BankAppWithdrawalService (anagiAccount);
        b4.depositToAccount (40000);
        b4.withDrawFromAccount (10000);
    }
}