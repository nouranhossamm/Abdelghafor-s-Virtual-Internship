# Abdelghafor's Virtual Internship

## Task 1: Pet Adoption Game

### Introduction
---------------

Welcome to the Pet Adoption Game, a console-based application that simulates the experience of adopting and taking care of a pet. In this game, you can adopt a pet, feed it, play with it, and check its status. The game tracks the pet's hunger and happiness levels, and it ends if these levels drop to critical values.

### How to Play
--------------

#### Adopt a Pet

To start the game, adopt a pet by entering its name. This will set the initial hunger and happiness levels to 50.

#### Feed Your Pet

Feed your pet to increase its hunger level. If the hunger level is already at 90, the pet is considered full, and no further increase is allowed.

#### Play with Your Pet

Play with your pet to increase its happiness level. If the happiness level is already at 90, the pet is considered too happy, and no further increase is allowed.

#### Check Your Pet's Status

Check your pet's current hunger and happiness levels at any time.

#### End the Game

End the game to view the final status of your pet. If the pet's hunger or happiness levels are 0 or below, the game will end with a message indicating that the pet did not survive.

### System Requirements
-----------------------

* Java 8 or later

### How to Run
-------------

1. Compile the `PetAdoptionGame.java` file using `javac`.
2. Run the `PetAdoptionGame` class using `java`.

### Troubleshooting
-------------------

* Ensure that you have adopted a pet before attempting to feed, play with, or check its status.
* Regularly feed and play with your pet to maintain its well-being and prevent the game from ending prematurely.

---------------

## Task 2: Personal Finance Tracker

### Introduction
---------------

Welcome to the Personal Finance Tracker, a command-line application designed to help users manage their financial transactions. It allows users to record transactions, view and sort transactions, view a financial summary, and gain insights into their spending habits.

### How to Use
--------------

#### Record a Transaction

Record a financial transaction with a description, amount, and category.

#### View Transactions

View all transactions with optional sorting by amount.

#### View Financial Summary

View a financial summary including total income, total expenses, and balance.

#### Get Insights

Gain insights into spending habits by category.

#### Exit

Close the application.

### System Requirements
-----------------------

* Java 8 or later

### Troubleshooting
-------------------

* Ensure all inputs are correctly formatted (e.g., amounts should be numerical values, descriptions and categories should be properly spelled).
* If sorting does not work as expected, check that the sorting logic is correctly implemented and applied.

### Sample Output
-----------------

The application will display a menu with options to input transactions, view transactions, view a financial summary, get insights, or exit. Sample output for each feature is shown below:

#### Input Transaction

* Enter description: [user input]
* Enter amount: [user input]
* Enter category: [user input]

#### View Transactions

* [table displaying all transactions with columns for description, amount, and category]

#### View Financial Summary

* Total Income: [total income]
* Total Expenses: [total expenses]
* Balance: [balance]

#### Get Insights

* [table displaying category analysis with columns for category, total expenses, and percentage of total expenses]

