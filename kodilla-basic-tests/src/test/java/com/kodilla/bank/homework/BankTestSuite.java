package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void whenZeroAtmInBank () {
        Bank bank = new Bank();

        assertEquals(0, bank.getTotalBalanceOfAllCashMachines());
        assertEquals(0, bank.getAverageOfAllWithdrawals());
        assertEquals(0, bank.getAverageOfAllDeposits());
        assertEquals(0, bank.getNumberOfDepositsOfAllAtms());
        assertEquals(0, bank.getNumberOfWithdrawalsOfAllAtms());

    }
    @Test
    public void shouldCheckCashMachineLengthWhenThreeAtmsAdded() {
        Bank bank = new Bank();

        CashMachine atm = new CashMachine();
        CashMachine atm1 = new CashMachine();
        CashMachine atm2 = new CashMachine();

        bank.addCashMachine(atm);
        bank.addCashMachine(atm1);
        bank.addCashMachine(atm2);

        assertEquals(3, bank.cashMachine.length);
    }
    @Test
    public void shouldGetTotalBalanceOfAllCashMachines () {
        Bank bank = new Bank();
        CashMachine atm = new CashMachine();
        CashMachine atm1 = new CashMachine();
        CashMachine atm2 = new CashMachine();

        bank.addCashMachine(atm);
        bank.addCashMachine(atm1);
        bank.addCashMachine(atm2);

            atm.addTransaction(0.00);
            atm.addTransaction(-50.00);
            atm.addTransaction(200.00);

            atm1.addTransaction(0.0);
            atm1.addTransaction(100.00);
            atm1.addTransaction(-300.00);

            atm2.addTransaction(0.0);
            atm2.addTransaction(60.00);
            atm2.addTransaction(-5.00);


            assertEquals(5.0, bank.getTotalBalanceOfAllCashMachines(), 0.01);
        }
    @Test
    public void toCheckTotalNumbersOfAllDepositsAndAllWithdrawals () {
        Bank bank = new Bank();
        CashMachine atm = new CashMachine();
        CashMachine atm1 = new CashMachine();
        CashMachine atm2 = new CashMachine();

        bank.addCashMachine(atm);
        bank.addCashMachine(atm1);
        bank.addCashMachine(atm2);

        atm.addTransaction(0.0);
        atm.addTransaction(-1.00);
        atm.addTransaction(-100.00);
        atm.addTransaction(-45.00);
        atm.addTransaction(60.00);

        atm1.addTransaction(0.0);
        atm1.addTransaction(-200.00);
        atm1.addTransaction(50.00);

        atm2.addTransaction(-350.00);
        atm2.addTransaction(50.00);
        atm2.addTransaction(0.0);

        assertEquals(3, bank.getNumberOfDepositsOfAllAtms());
        assertEquals(5,bank.getNumberOfWithdrawalsOfAllAtms());
        assertEquals(-696.00, bank.getSumOfAllWithdrawalsOfAllAtms());
        assertEquals(160.00, bank.getSumOfAllDepositsOfAllAtms());
    }
   @Test
   public void toCheckAverageOfAllWithdrawals () {
       Bank bank = new Bank();
       CashMachine atm = new CashMachine();
       CashMachine atm1 = new CashMachine();
       CashMachine atm2 = new CashMachine();

        bank.addCashMachine(atm);
        bank.addCashMachine(atm1);
        bank.addCashMachine(atm2);

        atm.addTransaction(0.0);
        atm.addTransaction(-1.00);
        atm.addTransaction(-100.00);
        atm.addTransaction(-45.00);
        atm.addTransaction(60.00);

        atm1.addTransaction(0.0);
        atm1.addTransaction(-200.00);

        atm.getAverageOfWithdrawals();
       System.out.println("atm average of withdrawals: " + atm.getAverageOfWithdrawals());
        atm1.getAverageOfWithdrawals();
        atm2.getAverageOfWithdrawals();

        assertEquals(-86.50, bank.getAverageOfAllWithdrawals(), 0.01);
    }
    @Test
    public void toCheckAverageOfAllDeposits() {

        Bank bank = new Bank();
        CashMachine atm = new CashMachine();
        CashMachine atm1 = new CashMachine();
        CashMachine atm2 = new CashMachine();

        bank.addCashMachine(atm);
        bank.addCashMachine(atm1);
        bank.addCashMachine(atm2);

        atm.addTransaction(0.0);
        atm.addTransaction(-1.00);
        atm.addTransaction(100.00);
        atm.addTransaction(50.00);
        System.out.println("avarage of deposits atm: " + atm.getAverageOfDeposits());

        atm1.addTransaction(0.0);
        atm1.addTransaction(200.00);

        atm2.addTransaction(350.00);
        atm2.addTransaction(0.0);
        System.out.println("average of deposits atm2: " + atm2.getAverageOfDeposits());

        assertEquals(175.00, bank.getAverageOfAllDeposits(), 0.01);

    }
}






