package com.codesigne;

import com.codesigne.model.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = null;
        bankAccount = new BankAccount();
        bankAccount.accoundId = "123-456";
        bankAccount.balance = 2324;
        bankAccount.currency = "MAD";

        System.out.println("Account Id = "+bankAccount.accoundId);
    }
}