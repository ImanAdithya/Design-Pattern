import service.custom.Fixed;

public class BankAppFixedService {
      Fixed fixed;
      public  BankAppFixedService(Fixed fixed){
          this.fixed=fixed;
      }
      public void depositToAccount(double amount){
          fixed.deposit (amount);
      }

}
