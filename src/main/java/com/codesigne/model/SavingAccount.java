package com.codesigne.model;

public class SavingAccount extends BankAccount{

    private double interestRate;

    public SavingAccount(){
        super();
    }

    @Override
    public String getType() {
        return "SAVING_ACCOUNT";
    }

    public SavingAccount(String currency,double amount,double interestRate){
        super(currency,amount);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
