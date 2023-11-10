import service.Account;
import service.custom.Fixed;
import service.custom.WithDrawable;
import service.types.*;

public class Main {
    public static void main(String[] args) {


        WithDrawable withDrawable=new SavingAccounts ();
        BankAppWithdrawalService b1=new BankAppWithdrawalService (withDrawable);
        b1.depositToAccount (100000);
        b1.withDrawFromAccount (3000);

        System.out.println ();

        Fixed fixed=new FixedAccounts ();
        BankAppFixedService b2=new BankAppFixedService (fixed);
        b2.depositToAccount (200000);
    }
}