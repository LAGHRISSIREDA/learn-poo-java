package com.codesigne.model;

public class SavingAccount extends BankAccount{

    private double interestRate;

    public SavingAccount(){
        super();
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
