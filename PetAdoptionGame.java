import java.util.Scanner;

public class PetAdoptionGame {

    // Pet attributes
    static String petName = "";
    static int hungerLevel = 50;
    static int happinessLevel = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Pet Adoption Game Menu ---");
            System.out.println("1. Adopt a Pet");
            System.out.println("2. Feed the Pet");
            System.out.println("3. Play with the Pet");
            System.out.println("4. Check Status");
            System.out.println("5. End Game");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    adoptPet(scanner);
                    break;
                case 2:
                    feedPet();
                    break;
                case 3:
                    playWithPet();
                    break;
                case 4:
                    checkStatus();
                    break;
                case 5:
                    endGame();
                    return;  // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Adopt a Pet
    static void adoptPet(Scanner scanner) {
        if (petName.isEmpty()) {
            System.out.print("Enter the name of your pet: ");
            petName = scanner.next();
            hungerLevel = 50;
            happinessLevel = 50;
            System.out.println("Congratulations! You've adopted " + petName + ".");
        } else {
            System.out.println("You've already adopted " + petName + ".");
        }
    }

    // Feed the Pet
    static void feedPet() {
        if (checkIfPetExists()) {
            if (hungerLevel < 90) {
                hungerLevel += 10;
                happinessLevel -= 10;
                if (happinessLevel <= 0) {
                    happinessLevel = 0;
                }
            if (happinessLevel <= 0 || happinessLevel > 100 || hungerLevel <= 0 || hungerLevel > 100) {
                endGame();
                return;
            }
                System.out.println(petName + " has been fed.");
            } else {
                System.out.println(petName + " is already full!");
            }
        }
    }

    // Play with the Pet
    static void playWithPet() {
        if (checkIfPetExists()) {
            if (happinessLevel < 90) {
                happinessLevel += 10;
                hungerLevel -= 20;
                if (hungerLevel < 0) {
                    hungerLevel = 0;
                }
            if (happinessLevel <= 0 || happinessLevel > 100 || hungerLevel <= 0 || hungerLevel > 100) {
                endGame();
                return;
            }
                System.out.println(petName + " played and is happier now");

            } else {
                System.out.println(petName + " is already very happy!");
            }
        }
    }

    // Check Status
    static void checkStatus() {
        if (checkIfPetExists()) {
            System.out.println(petName + "'s current status:");
            System.out.println("Hunger level: " + hungerLevel);
            System.out.println("Happiness level: " + happinessLevel);
        }
    }

    // End Game
    static void endGame() {
        if (checkIfPetExists()) {
            System.out.println("Ending the game. Final status of " + petName + ":");
            System.out.println("Hunger level: " + hungerLevel);
            System.out.println("Happiness level: " + happinessLevel);
            System.out.println("Thank you for playing!");
        }
    }

    // Utility method to check if a pet has been adopted
    static boolean checkIfPetExists() {
        if (petName.isEmpty()) {
            System.out.println("No pet has been adopted yet. Please adopt a pet first.");
            return false;
        }
        return true;
    }
}
