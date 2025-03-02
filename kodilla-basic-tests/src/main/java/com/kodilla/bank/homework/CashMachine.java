package com.kodilla.bank.homework;

public class CashMachine {

    private double totalTransactions[];
    private int size;
    private double balance = 0;
//    private double withdrawal;
//    private double deposit;

    public CashMachine() {
        this.size = 0;
        this.totalTransactions = new double[0];
//        this.withdrawal = 0;
//        this.deposit = 0;
    }
    public void addTransaction(double transaction) {
        if (transaction == 0) {
            return;
        }
        this.size++;
        double[] newTransactions = new double[this.size];
        System.arraycopy(totalTransactions, 0, newTransactions, 0, totalTransactions.length);
        newTransactions[this.size - 1] = transaction;
        this.totalTransactions = newTransactions;
        this.balance += transaction;
    }
    public double getBalance() {
        return this.balance;
    }
    public int getNumberOfTransactions() {
        return this.size;
    }
    public int getNumberOfWithdrawals() {
        int count = 0;
        for (int i = 0; i < this.size; i++) {
            if (totalTransactions[i] < 0) {
                count++;
            }
        }
        return count;
//        public int getNumberOfWithdrawals(double transaction) {
//        if (transaction < 0) {
//            this.withdrawal++; }
//         return this.withdrawals;
    }
    public int getNumberOfDeposits() {
        int count = 0;
        for (int i = 0; i < this.size; i++) {
            if (totalTransactions[i] > 0) {
                count++;
            }
        }
        return count;

//        public int getNumberOfDeposits(double transaction) {
//        if (transaction > 0) {
//            this.deposit++; }
//        return this.deposit;
    }
    public double getAverageOfWithdrawals() {
        double sum = 0;
        if (this.totalTransactions.length != 0) {
            for (int i = 0; i < this.totalTransactions.length; i++) {
                if (totalTransactions[i] < 0) {
                    sum += this.totalTransactions[i];
                }
            }
            return sum / getNumberOfWithdrawals();
        }
        return 0.0;
    }
    public double getAverageOfDeposits() {
        double sum = 0;
        if(this.totalTransactions.length == 0) {
            return 0.0;
        }
        for (int i = 0; i < this.totalTransactions.length; i++) {
            if (totalTransactions[i] > 0) {
                sum += this.totalTransactions[i];
            }
        }
        return sum / getNumberOfDeposits();
    }
}


