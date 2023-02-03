package com.codesigne.model;

public class CurrentAccount extends BankAccount{

    private double overDraft;

    public CurrentAccount(){
        super();
    }

    @Override
    public String toString() {
        return super.toString()+" "+ this.overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft){this.overDraft = overDraft;}
}
