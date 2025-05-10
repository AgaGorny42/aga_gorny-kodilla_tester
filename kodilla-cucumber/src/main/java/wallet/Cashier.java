package wallet;

public class Cashier {

    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String withdraw(Wallet wallet, int amount){
        if(amount <= wallet.getBalance()) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        }else if (amount > wallet.getBalance())
            System.out.println(getInformation());
        return getInformation();
    }
    public String getInformation(){
        return "Balance insufficient. Please request another amount";
    }
}
