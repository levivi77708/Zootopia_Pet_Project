import java.util.Random;
import java.util.Scanner;

public class Main {

    /** Main method to start the Animal Care Simulator.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Zootopia Tamagotchi!");
        System.out.println("Choose your animal:");
        System.out.println("1. Gary");
        System.out.println("2. Gazelle");
        System.out.println("3. Judy");
        System.out.println("4. Nick"); 

        int choice = scanner.nextInt();
        Animal animal;
        String animalName;

        switch (choice) {
            case 1:
                animal = new Gary();
                animalName = "Gary";
                break;
            case 2:
                animal = new Gazelle();
                animalName = "Gazelle";
                break;
            case 3:
                animal = new Judy();
                animalName = "Judy";
                break;
            case 4:
                animal = new Nick();
                animalName = "Nick";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Gary.");
                animal = new Gary();
                animalName = "Gary";
                break;
        }

        System.out.println("You chose " + animalName + "! Let's take care of them.");

        while (true) {
            System.out.println("\nWhat do you want to do with " + animalName + "?");
            System.out.println("1. Sleep");
            System.out.println("2. Eat");
            System.out.println("3. Play");
            System.out.println("4. Do Nothing");
            System.out.println("5. Check Stats");
            if (animal instanceof Gary) {
                System.out.println("6. Give Hug");
            } else if (animal instanceof Gazelle) {
                System.out.println("6. Sing");
            } else if (animal instanceof Judy) {
                System.out.println("6. Solve Case");
            } else if (animal instanceof Nick) {
                System.out.println("6. Eat Pawpsicle");
            }
            System.out.println("7. Quit");

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    animal.sleep();
                    break;
                case 2:
                    animal.eat();
                    break;
                case 3:
                    animal.play();
                    break;
                case 4:
                    animal.doNothing();
                    break;
                case 5:
                    animal.checkStats();
                    break;
                case 6:
                    if (animal instanceof Gary) {
                        ((Gary) animal).giveHug();
                    } else if (animal instanceof Gazelle) {
                        ((Gazelle) animal).sing();
                    } else if (animal instanceof Judy) {
                        System.out.println("Enter the case number to solve:");
                        int num = scanner.nextInt();
                        ((Judy) animal).solveCase(num);
                    } else if (animal instanceof Nick) {
                        System.out.println("How many pawpsicles? (1-3):");
                        int num = scanner.nextInt();
                        ((Nick) animal).eatPawpsicle(num);
                    }
                    break;
                case 7:
                    System.out.println("Goodbye! Thanks for playing.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid action. Try again.");
                    continue;
            }

            // Random event: sometimes stats decrease randomly
            if (random.nextInt(100) < 20) { // 20% chance
                System.out.println("Oh no! " + animalName + " had a random mishap!");
                animal.setHealth(Math.max(0, animal.getHealth() - random.nextInt(10)));
                animal.setEnergy(Math.max(0, animal.getEnergy() - random.nextInt(10)));
                animal.setHappiness(Math.max(0, animal.getHappiness() - random.nextInt(10)));
                System.out.println(animalName + "'s stats have changed unexpectedly.");
            }

            // Ensure stats are within bounds
            animal.setHealth(Math.min(100, animal.getHealth()));
            animal.setEnergy(Math.min(100, animal.getEnergy()));
            animal.setHappiness(Math.min(100, animal.getHappiness()));

            // Check if any stat reached zero
            if (animal.getHealth() <= 0 || animal.getEnergy() <= 0 || animal.getHappiness() <= 0) {
                System.out.println("Oh no! " + animalName + " has died because their stats reached zero!");
                scanner.close();
                return;
            }
        }
    }
}
