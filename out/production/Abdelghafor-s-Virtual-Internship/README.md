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

### Flowchart
------------
        
                                          +---------------+
                                          |  Start Game   |
                                          +---------------+   
                                                  |
                                                  |
                                                  v
                                         +-------------------+
                                         |  Adopt a Pet      |
                                         |  (Enter Pet Name) |
                                         +-------------------+
                                                  |
                                                  |
                                                  v
                                    +----------------------------+
                                    |  Initialize Pet            |
                                    |  (Hunger=50, Happiness=50) |
                                    +----------------------------+
                                                  |
                                                  |
                                                  v
                                         +-------------------+
                                         |  Main Menu        |
                                         |  1. Feed Pet      |
                                         |  2. Play with Pet |
                                         |  3. Check Status  |
                                         |  4. End Game      |
                                         +-------------------+
                                                  |
                                                  |
                                                  v
                                        +--------------------+
                                        |  Feed Pet          |
                                        |  (Increase Hunger) |
                                        +--------------------+
                                                  |
                                                  |
                                                  v
                                  +---------------------------------+
                                  |  Check Hunger                   |
                                  |  (If Hunger >= 90, Pet is Full) |
                                  +---------------------------------+
                                                 |
                                                 |
                                                 v
                                      +-----------------------+
                                      |  Play with Pet        |
                                      |  (Increase Happiness) |
                                      +-----------------------+
                                                 |
                                                 |
                                                 v
                              +-----------------------------------------+
                              |  Check Happiness                        |
                              |  (If Happiness >= 90, Pet is Too Happy) |
                              +-----------------------------------------+
                                                 |
                                                 |
                                                 v
                                  +---------------------------------+
                                  |  Check Status                   |
                                  |  (Display Hunger and Happiness) |
                                  +---------------------------------+
                                                 |
                                                 |
                                                 v
                          +----------------------------------------------+
                          |  End Game                                    |
                          |  (Check if Hunger or Happiness <= 0)         |
                          |  If so, Game Over, else Display Final Status |
                          +----------------------------------------------+
                                                 |
                                                 |
                                                 v
                                  +------------------------------+
                                  |  Game Over                   |
                                  |  (Display Game Over Message) |
                                  +------------------------------+
