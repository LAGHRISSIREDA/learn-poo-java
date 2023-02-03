package com.codesigne.model;

import java.util.Objects;
import java.util.UUID;

public class BankAccount {
    private String accoundId;
    private double balance;
    private String currency;
    private AccoutStatus status;

    public BankAccount(){
        this.accoundId = UUID.randomUUID().toString();
        this.balance = 345;
        this.currency = "MAD";
        this.status = AccoutStatus.CREATED;
    }

    //getters and setters


    public String getAccoundId() {
        return accoundId;
    }

    public void setAccoundId(String accoundId) {
        this.accoundId = accoundId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccoutStatus getStatus() {
        return status;
    }

    public void setStatus(AccoutStatus status) {
        this.status = status;
    }


    //to string && hash ------------------------------------------------------


    @Override
    public String toString() {
        return "BankAccount{" +
                "accoundId='" + accoundId + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", status=" + status +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(accoundId, balance, currency, status);
    }
}
