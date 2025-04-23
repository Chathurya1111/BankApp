Features
BankAccount Class: A base class with common attributes such as accountNumber, holderName, and balance. It provides a default calculateInterest() method that returns 0.0.

SavingAccount Class: Inherits from the BankAccount class and calculates interest based on a provided interest rate.

CurrentAccount Class: Inherits from the BankAccount class and calculates interest by adding an overdraft limit to the balance.

Explanation of Code
BankAccount Class:
The base class that holds common attributes like accountNumber, holderName, and balance.

Provides a method calculateInterest() which is overridden by subclasses.

SavingAccount Class:
Inherits from BankAccount and adds an additional attribute for interestRate.

The calculateInterest() method is overridden to compute interest based on the balance and interest rate.

CurrentAccount Class:
Inherits from BankAccount and adds an overdraftLimit attribute.

The calculateInterest() method is overridden to compute interest by adding the overdraft limit to the balance.
