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
        if (this.cashMachine.length == 0) {
            return 0;
        }
        double totalBalance = 0;
        for (int i = 0; i < this.cashMachine.length; i++) {
            totalBalance += this.cashMachine[i].getBalance();
        }
        return totalBalance;
    }
    public double getAverageOfAllWithdrawals() {
        double totalBalance = 0;
        if(this.cashMachine.length ==0) {
            return 0;
        }
        for (int i = 0; i < this.cashMachine.length; i++) {
            totalBalance += this.cashMachine[i].getAverageOfWithdrawals();
        }
        return totalBalance / this.cashMachine.length;
    }
    public double getAverageOfAllDeposits () {
        double totalBalance = 0;
        if(this.cashMachine.length == 0) {
            return 0;
        }
        for (int i = 0; i < this.cashMachine.length; i++) {
            totalBalance += this.cashMachine[i].getAverageOfDeposits();
        }
        return totalBalance / this.cashMachine.length;
    }
}




