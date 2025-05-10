Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When i request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Withdrawal from the wallet using cash machine
    Given I should have $100 in my wallet
    When I request $100 from cash machine
    Then I should receive $100 from cash machine
    And I can check actual balance $0 after withdrawal

  Scenario: I can withdraw money from my wallet but not more than actual wallet balance
    Given I have $500 in my wallet
    When I want to withdraw $600 from cash machine
    Then I should not receive any money

  Scenario:  I cannot get credit on my account
    Given I have no money in my wallet
    When I request $100 from cash machine
    Then I should not receive any money

  Scenario: I can deposit money into my wallet using cash machine
    Given I have no money in my wallet
    When I deposit $1000 using cash machine
    Then My wallet balance should be $1000


