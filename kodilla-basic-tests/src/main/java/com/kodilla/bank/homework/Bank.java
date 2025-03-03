package com.kodilla.bank.homework;

public class Bank {

    CashMachine cashMachine[];
    int size;

    public Bank() {
        this.size = 0;
        this.cashMachine = new CashMachine[0];
    }
    public void addCashMachine(CashMachine atm) {
        this.size++;
        CashMachine[] newCashMachine = new CashMachine[this.size];
        System.arraycopy(cashMachine, 0, newCashMachine, 0, cashMachine.length);
        newCashMachine[this.size - 1] = atm;
        this.cashMachine = newCashMachine;
    }
    public double getTotalBalanceOfAllCashMachines() {
        double totalBalance = 0;
        for (int i = 0; i < this.cashMachine.length; i++) {
            totalBalance += this.cashMachine[i].getBalance();
        }
        return totalBalance;
    }
    public double getNumberOfDepositsOfAllAtms() {
        int totalDeposits = 0;
        for (int i = 0; i < this.cashMachine.length; i++) {
            totalDeposits += cashMachine[i].getNumberOfDeposits();
        }
        return totalDeposits;
    }
    public double getNumberOfWithdrawalsOfAllAtms() {
        int totalWithdrawals = 0;
        for (int i = 0; i < this.cashMachine.length; i++) {
            totalWithdrawals += cashMachine[i].getNumberOfWithdrawals();
        }
        return totalWithdrawals;
    }
    public double getSumOfAllWithdrawalsOfAllAtms () {
        double sum = 0;
        for (int i = 0; i < this.cashMachine.length; i++) {
            sum += cashMachine[i].getSumOfWithdrawals();
        }
        return sum;
    }
    public double getSumOfAllDepositsOfAllAtms () {
        double sum = 0;
        for (int i = 0; i < this.cashMachine.length; i++) {
            sum += cashMachine[i].getSumOfDeposits();
        }
        return sum;
    }
    public double getAverageOfAllWithdrawals() {
        if(getNumberOfWithdrawalsOfAllAtms() == 0) {
            return 0;
        }
        return getSumOfAllWithdrawalsOfAllAtms()/getNumberOfWithdrawalsOfAllAtms();
    }
    public double getAverageOfAllDeposits() {
        if(getNumberOfDepositsOfAllAtms() == 0) {
            return 0;
        }
        return getSumOfAllDepositsOfAllAtms() / getNumberOfDepositsOfAllAtms();
    }
}




