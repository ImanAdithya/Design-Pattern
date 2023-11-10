package service.custom;

import service.Payment;

public interface Bank extends Payment {
    void initiatePayments();
}
