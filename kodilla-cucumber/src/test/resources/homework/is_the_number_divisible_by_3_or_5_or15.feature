Feature:  Is the number divisible by three or five or fifteen?

  Scenario Outline: The number is or isn't divisible by three or five or fifteen.

    Given The <number> is checked number.
    When  I check if the number is divisible by three or five or fifteen.
    Then  The answer is <answer>.
    Examples:
      | number | answer |
      | 30 | "FizzBuzz" |
      | 3 | "Fizz" |
      | 5 | "Buzz" |
      | 1 | "None" |