package com.codesigne.model;

public class BankAccount {
    public String accoundId;
    public double balance;
    public String currency;
    public String status;

    public BankAccount(){
        this.status = "CREATED";
    }
}
