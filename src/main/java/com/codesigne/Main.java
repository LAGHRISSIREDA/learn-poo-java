package com.codesigne;

import com.codesigne.model.BankAccount;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        HashMap<String,BankAccount> bankAccountHashMap = new HashMap<>();
        //fill hashmap
        bankAccountHashMap.put("cc1",new BankAccount());
        bankAccountHashMap.put("cc2",new BankAccount());
        bankAccountHashMap.put("cc3",new BankAccount());
        bankAccountHashMap.put("cc4",new BankAccount());
        bankAccountHashMap.put("cc5",new BankAccount());

        //print al data
        System.out.println("=========================Data========================");
        for(BankAccount ba : bankAccountHashMap.values()){
            System.out.println(toJson(ba));
        }




    }

    //create function to fetch data format json
    public static String toJson(BankAccount o) throws JsonProcessingException {
        ObjectMapper  objectMapper = new ObjectMapper();
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
    }

    public static void printAcoount(BankAccount bankAccount){
        System.out.println("*****************************************************");
        System.out.println("Account Id = "+bankAccount.getAccoundId());
        System.out.println("Balance = "+bankAccount.getBalance());
        System.out.println("Currency = "+bankAccount.getCurrency());
        System.out.println("Status = "+bankAccount.getStatus());
        System.out.println(bankAccount.equals(bankAccount));
        System.out.println(bankAccount.hashCode());
        System.out.println("*****************************************************");
    }
}
