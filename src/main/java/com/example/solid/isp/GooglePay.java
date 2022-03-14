package com.example.solid.isp;

public class GooglePay implements UPIPayments, CashBackManager{
    @Override
    public void payMoney() {

    }

    @Override
    public void scratchCard() {

    }

    @Override
    public void getCashBackAsCreditbalance() {
        // this feature is there in gpay
    }
}
