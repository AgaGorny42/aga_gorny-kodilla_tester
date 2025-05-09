Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When i request $30
    Then $30 should be dispensed

  Scenario: Withdrawal of all the money from the wallet
    Given I should have $170 in my wallet
    When I request $170
    Then $170 should be dispensed

  Scenario:  Unsuccessful withdrawal from the wallet
    Given I should have $0 in my wallet
    When I request $20
    Then Withdrawal should be rejected

  Scenario: Checking balance of my wallet
    Given I have &0 in my wallet
    When I request to check the balance in my wallet
    Then I should get information about the wallet ballance

  Scenario:  Cash withdrawal at Cashier
    Given I have deposited $500 in my wallet
    When I request $50
    Then $50 should be in cashslot