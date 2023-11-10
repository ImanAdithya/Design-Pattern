package service.custom;

import service.Payment;

public interface Loan extends Payment {
    void initiateLoanSettlement();
    void initiatePayment();
}
