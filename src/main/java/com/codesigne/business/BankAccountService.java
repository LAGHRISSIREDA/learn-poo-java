package com.codesigne.business;

import com.codesigne.exceptions.AccountNotFoundException;
import com.codesigne.model.BankAccount;

import java.util.List;

public interface BankAccountService {
    BankAccount addBankAccount(BankAccount ba);
    List<BankAccount> getAllAccounts();
    BankAccount getBankAccountById(String id)throws AccountNotFoundException;
    void addRandomData(int size);
    void credit(String accountId , double amount);
    void debit(String accountId , double amount);
    void transfer(String accountSource,String accountDestination,double amount);
}
