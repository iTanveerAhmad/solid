package com.example.solid.srp;

public class Bank {

    /**
     *
     * WE HAVE A FUNCTIONS like
     * printPassBook()        --> will move to PrinterService
     * getLoanInterestInfo()  --> will move to LoanService
     * sendOTP()              --> will move to NotificationService
     * NOT PART OF ONE CLASS BECAUSE EACH FUNCTION HAVE DIFFERENT NATURE/BEHAVIOUR
     *
     */

    public long deposit(long amount){
        return  amount;
    }

    public long withdraw(long amount){
        return  amount;
    }
}
