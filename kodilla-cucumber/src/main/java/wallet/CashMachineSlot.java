package wallet;

public class CashMachineSlot {

    private int cash;

    public int getCash(){
        return cash;
    }

    public void slotContents(int amount){
        this.cash = amount;
    }
}
