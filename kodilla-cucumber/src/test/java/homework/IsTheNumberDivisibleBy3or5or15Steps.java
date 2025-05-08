package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static homework.NumberChecker.numberDivisibilityChecker;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsTheNumberDivisibleBy3or5or15Steps {

    private int number;
    private String answer;

    @Given("The {int} is checked number.")
    public void the_is_checked_number(Integer int1) {
        this.number = int1;
    }

    @When("I check if the number is divisible by three or five or fifteen.")
    public void iCheckIfTheNumberIsDivisibleByThreeOrFiveOrFifteen() {
        this.answer = numberDivisibilityChecker(this.number);
    }

    @Then("The answer is {string}.")
    public void theAnswerIsAnswer(String string) {
        assertEquals(string, this.answer);
    }
}
