package com.timbuchalka;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Tim","Buchalka",1000.00);
        double balance = account.deposit(200.00,true);
        assertEquals(1200.00,balance,0);
        assertEquals(1200,account.getBalance(),0);
    }

    @org.junit.Test
    public void withdraw() {
    fail("LOL") ;
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Tim","Buchalka",1000.00);
        double balance = account.withdraw(200.00,true);
        assertEquals(800.00,balance,0);
    }

    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Tim","Buchalka",1000.00);
        account.deposit(200.00,true);
        assertEquals(1200,account.getBalance(),0);
    }

    
}