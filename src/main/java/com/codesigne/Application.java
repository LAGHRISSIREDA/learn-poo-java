package com.codesigne;

import com.codesigne.business.BankAccountService;
import com.codesigne.business.BankAccountServiceImpl;
import com.codesigne.exceptions.AccountNotFoundException;
import com.codesigne.model.BankAccount;
import com.codesigne.model.CurrentAccount;
import com.codesigne.model.SavingAccount;
import com.codesigne.utils.DataTransformationUtils;

import java.util.List;
import java.util.function.Consumer;

public class Application {
    public static void main(String[] args) throws AccountNotFoundException {
        BankAccountService bankAccountService = new BankAccountServiceImpl();
        bankAccountService.addBankAccount(new CurrentAccount("MAD",243,345345));
        bankAccountService.addBankAccount(new SavingAccount("MAD",243,345345));
        BankAccount bankAccount = new CurrentAccount("MAD",243,345345);
        bankAccount.setAccoundId("test");
        bankAccountService.addBankAccount(bankAccount);

        BankAccount ba = bankAccountService.getBankAccountById("tet");
        System.out.println(ba.toString());
//        List<BankAccount> allAccounts = bankAccountService.getAllAccounts();

//        bankAccountService.getAllAccounts().stream().map(DataTransformationUtils::toJson).forEach(System.out::println);

//        for(BankAccount ba : allAccounts){
//            if(ba instanceof CurrentAccount){
//                System.out.println(ba.toString());
//            }
//        }

        //display 3
//        allAccounts.forEach(new Consumer<BankAccount>() {
//            @Override
//            public void accept(BankAccount bankAccount) {
//                if(bankAccount instanceof SavingAccount){
//                    System.out.println(bankAccount.toString());
//                }
//            }
//        });

        //display 4
//        allAccounts.forEach((account)->{
//            System.out.println(account.toString());
//        });

        //display 5 with lambda
//        allAccounts.forEach(System.out::println);

        //serach banaccount by id
//        BankAccount bankAccount1 = null;
//        try {
//            bankAccount1 = bankAccountService.getBankAccountById("tst");
//        } catch (AccountNotFoundException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//            throw new RuntimeException(e);
        }
//        System.out.println(bankAccount1.toString());
//        System.out.println("************************");


}
