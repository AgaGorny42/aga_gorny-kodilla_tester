package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachimeTestSuite {

    CashMachine transactions = new CashMachine();

    @Test
    public void shouldCheckWhenZeroTransactions() {
        assertEquals(0, transactions.getNumberOfTransactions());
        assertEquals(0, transactions.getBalance(), 0.01);
        assertEquals(0,transactions.getNumberOfWithdrawals());
        assertEquals(0, transactions.getNumberOfDeposits());
        assertEquals(0, transactions.getAverageOfWithdrawals());
        assertEquals(0, transactions.getAverageOfDeposits());
        assertEquals(0, transactions.getSumOfWithdrawals());
        assertEquals(0, transactions.getSumOfDeposits());
    }
    @Test
    public void shouldAddTransactionsToTableDepositAndWithdrawal() {
        transactions.addTransaction(0.00);
        transactions.addTransaction(300);
        transactions.addTransaction(-100);
        assertEquals(200, transactions.getBalance(), 0.01);
        assertEquals(2, transactions.getNumberOfTransactions());
    }
    @Test
    public void shouldAddWithdrawals() {
        transactions.addTransaction(0);
        transactions.addTransaction(-2.00);
        transactions.addTransaction(-200.00);
        transactions.addTransaction(50.00);
        assertEquals(2, transactions.getNumberOfWithdrawals());
        assertEquals(-101, transactions.getAverageOfWithdrawals(), 0.001);
        System.out.println("average of withdrawals: " + transactions.getAverageOfWithdrawals());
        assertEquals(-202.00, transactions.getSumOfWithdrawals());

        }
    @Test
    public void ShouldAddDeposits () {
        transactions.addTransaction(0);
        transactions.addTransaction(01.00);
        transactions.addTransaction(100.00);
        transactions.addTransaction(-20.00);
        assertEquals(2, transactions.getNumberOfDeposits());
        assertEquals(50.5, transactions.getAverageOfDeposits(), 0.1);
        System.out.println("average of deposits: " + transactions.getAverageOfDeposits());
        assertEquals(101.00, transactions.getSumOfDeposits());
    }
}
