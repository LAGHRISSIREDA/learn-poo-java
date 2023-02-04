package com.codesigne.business;

import com.codesigne.exceptions.AccountNotFoundException;
import com.codesigne.model.BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankAccountServiceImpl implements BankAccountService{
    private List<BankAccount> bankAccountList = new ArrayList<>();
    @Override
    public BankAccount addBankAccount(BankAccount ba) {
        bankAccountList.add(ba);
        return ba;
    }

    @Override
    public List<BankAccount> getAllAccounts() {
        return bankAccountList;
    }

    @Override
    public BankAccount getBankAccountById(String id)throws AccountNotFoundException {
     return  bankAccountList.stream().filter(acc -> acc.getAccoundId().equals(id)).findFirst().orElseThrow(()-> new AccountNotFoundException(String.format("Account ID =  %s not found",id)));
//        for(BankAccount ba : bankAccountList){
//            if(ba.getAccoundId().equals(id)){
//                return ba;
//            }
//        }
//        throw new AccountNotFoundException("BankAccount Not Found");
    }

    @Override
    public void addRandomData(int size) {

    }

    @Override
    public void credit(String accountId, double amount) {

    }

    @Override
    public void debit(String accountId, double amount) {

    }

    @Override
    public void transfer(String accountSource, String accountDestination, double amount) {

    }
}
