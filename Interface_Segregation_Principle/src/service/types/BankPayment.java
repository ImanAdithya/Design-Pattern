package service.types;

import service.Payment;
import service.custom.Bank;

import java.util.List;

public class BankPayment implements Bank {
    @Override
    public void initiatePayments() {
        System.out.println ("Payment Initiated");
    }

    @Override
    public Object status() {
        System.out.println ("Status called");
        return null;
    }

    @Override
    public List<Object> getPayments() {
        System.out.println ("Return All Payments");
        return null;
    }

}
