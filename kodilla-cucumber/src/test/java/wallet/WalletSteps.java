package wallet;

import io.cucumber.java.en.And;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WalletSteps {

    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final CashMachineSlot cashMachineSlot = new CashMachineSlot();
    private final  CashMachine cashMachine = new CashMachine(cashMachineSlot);
    private final Cashier cashier = new Cashier(cashSlot);


    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
    }
    @When("i request $30")
    public void i_request_$30() {
        cashier.withdraw(wallet, 30);
    }
    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assert.assertEquals(30, cashSlot.getContents());
    }
    @Then("the balance of my wallet should be $170")
    public void the_balance_of_my_wallet_should_be_$170() {
        Assert.assertEquals("Incorrect wallet balance", 170,  wallet.getBalance());
    }
    @Given("there is $100 in my wallet")
    public void there_Is_$100_In_My_Wallet(){
        wallet.deposit(100);
       int balance = wallet.getBalance();
        System.out.println("My actual balance is: " + balance);
    }
    @When("I withdraw $200")
    public void i_Withdraw_$200() {
        cashier.withdraw(wallet,200);
    }
    @Then("nothing should be dispensed")
    public void nothing_Should_Be_Dispensed() {
        int actual = cashSlot.getContents();
        Assert.assertEquals(0, actual);
    }
    @And("I should be told that I don't have enough money in my wallet")
    public void i_Should_Be_Told_That_I_DonT_Have_Enough_Money_In_My_Wallet() {

        String expected = "Balance insufficient. Please request another amount";
        Assert.assertEquals(expected, cashier.getInformation());
    }
    @When("I check the balance of my wallet")
    public void i_Check_The_Balance_Of_My_Wallet() {
        int actualBalance = cashMachine.checkWalletBalance(wallet);
        Assert.assertEquals(100, actualBalance);
    }
    @Then("I should see that the balance is $100")
    public void i_Should_See_That_The_Balance_Is_$100() {
        int actualBalance = cashMachine.checkWalletBalance(wallet);
        Assert.assertEquals(100, actualBalance);
    }
    @Given("I should have $100 in my wallet")
    public void i_Should_Have_$100_In_My_Wallet() {
        wallet.deposit(100);
        Assert.assertEquals(100, cashMachine.checkWalletBalance(wallet));
    }
    @When("I request $100 from cash machine")
    public void i_Request_$100_From_Cash_machine() {
        cashMachine.withdrawalFromCashMachine(wallet,100);
    }
    @Then("I should receive $100 from cash machine")
    public void i_Should_Receive_$100_from_cash_machine() {
        Assert.assertEquals(100, cashMachineSlot.getCash());
    }
    @And("I can check actual balance $0 after withdrawal")
    public void i_can_check_Actual_Balance_$0_After_Withdrawal() {
        Assert.assertEquals(0,cashMachine.checkWalletBalance(wallet));
    }
    @Given("I have $500 in my wallet")
    public void i_Have_$500_In_My_Wallet() {
        wallet.deposit(500);
        Assert.assertEquals(500, wallet.getBalance());
    }
    @When("I want to withdraw $600 from cash machine")
    public void i_Want_To_Withdraw_$600_From_Cash_Machine() {
        cashMachine.withdrawalFromCashMachine(wallet, 600);
    }
    @Then("I should not receive any money")
    public void i_Should_Not_Receive_Any_Money() {
        Assert.assertEquals(0, cashMachineSlot.getCash());
    }
    @Given("I have no money in my wallet")
    public void i_Have_No_Money_In_My_Wallet() {
        Assert.assertEquals(0, wallet.getBalance());
    }
    @When("I deposit $1000 using cash machine")
    public void i_Deposit_$1000_Using_Cash_Machine() {
        cashMachine.depositCashIntoCashMachine(wallet, 1000);
        Assert.assertEquals(1000, cashMachineSlot.getCash());
    }

    @Then("My wallet balance should be $1000")
    public void my_Wallet_Balance_Should_Be_$1000() {
        Assert.assertEquals(1000, wallet.getBalance());
    }
}

