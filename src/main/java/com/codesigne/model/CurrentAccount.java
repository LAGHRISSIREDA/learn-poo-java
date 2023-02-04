package com.codesigne.model;

public class CurrentAccount extends BankAccount{

    private double overDraft;

    public CurrentAccount(){
        super();

    }

    public CurrentAccount(String currency,double amount,double overDraft){
        super(currency,amount);
        this.overDraft = overDraft;
    }

    @Override
    public String toString() {
        return super.toString()+" "+ this.overDraft;
    }

    @Override
    public String getType() {
        return "CURRENT_ACCOUNT";
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft){this.overDraft = overDraft;}
}
