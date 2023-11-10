import service.Account;
import service.custom.WithDrawable;

public class BankAppWithdrawalService {

    WithDrawable withDrawable;

    public BankAppWithdrawalService(WithDrawable withDrawable){
        this.withDrawable=withDrawable;
    }

    public void depositToAccount(double amount){
        withDrawable.deposit (amount);
    }

    public void withDrawFromAccount(double amount){
       withDrawable.withdraw (amount);
    }

}
