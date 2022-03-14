package com.example.solid.dip;


public class ShoppingMall {

    /**
     * {@link DebitCard} is tightly coupled with {@link ShoppingMall}
     * and it is violated the DI Principle
     *
     * For solution, we create an interface {@link BankCard} that have common function
     * for {@link DebitCard} & {@link CreditCard}
     */



    /** TIGHT COUPLE CODE  **/

    /**
     *

    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard){
        this.debitCard = debitCard;
    }

    public void doPurchaseSomething(long amount){
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(1000);
    }

     **/

    /** IMPLEMENT Dependency Inversion Principle **/

    // ShoppingMall is now tightly coupled with BankCard interface.
    BankCard bankCard;

    public ShoppingMall(BankCard bankCard){
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        // DebitCard is a child of bankCard, and it is also performed runtime polymorphism
        BankCard bankCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);
    }

}
