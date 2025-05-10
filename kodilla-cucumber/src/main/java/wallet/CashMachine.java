package wallet;

public class CashMachine {

    private final CashMachineSlot cashMachineSlot;

    public CashMachine(CashMachineSlot cashMachineSlot) {
        this.cashMachineSlot = cashMachineSlot;
    }
    public int checkWalletBalance(Wallet wallet) {
        return wallet.getBalance();
    }
    public void withdrawalFromCashMachine(Wallet wallet, int amount) {
        if (amount > 0 && amount <= wallet.getBalance()) {
            wallet.debit(amount);
            cashMachineSlot.slotContents(amount);
        }
    }

    public void depositCashIntoCashMachine(Wallet wallet, int amount) {
        cashMachineSlot.slotContents(amount);
        wallet.deposit(amount);
    }

}


