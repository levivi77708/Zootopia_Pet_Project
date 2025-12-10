public class Nick {
    private int health = 100;
    private int energy = 100;
    private int happiness = 100;

    // Default constructor
    public Nick() {
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
    }

    // Parameterized constructor
    public Nick(int health, int energy, int happiness) {
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
    }

    // Getters and setters (optional, if needed)
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    // Method to simulate doing nothing
    public void doNothing() {
        // Doing nothing decreases energy and happiness slightly
        this.energy -= 5;
        this.happiness -= 5;
        // Health remains unchanged
    }

    // Method to check and display the current stats
    public void checkStats() {
        System.out.println("Current Stats:");
        System.out.println("Health: " + this.health);
        System.out.println("Energy: " + this.energy);
        System.out.println("Happiness: " + this.happiness);
    }

    // Method for Nick to eat and restore health and energy
    public void eat() {
    System.out.println("Nick is eating a delicious meal!");
    health += 10; // Eating restores health
    energy += 15; // Eating restores energy

    // Ensure stats don't exceed maximum values
    if (health > 100) health = 100;
    if (energy > 100) energy = 100;

    System.out.println("Nick feels better after eating!");
    checkStats(); // Display updated stats
}

// Method for Nick to sleep and restore energy, health, and happiness
public void sleep() {
    System.out.println("Nick is sleeping peacefully.");
    energy += 20; // Sleeping restores energy
    health += 5; // Sleeping slightly improves health
    happiness += 5; // Sleeping makes Nick happier

    // Ensure stats don't exceed maximum values
    if (health > 100) health = 100;
    if (energy > 100) energy = 100;
    if (happiness > 100) happiness = 100;

    System.out.println("Nick feels refreshed after sleeping!");
    checkStats(); // Display updated stats
}

// Method for Nick to play and increase happiness
public void play() {
    System.out.println("Nick is playing and having fun!");
    happiness += 20; // Playing makes Nick much happier
    energy -= 10; // Playing uses up energy
    health -= 5; // Playing too much can slightly reduce health

    // Ensure stats don't drop below zero or exceed maximum values
    if (health < 0) health = 0;
    if (energy < 0) energy = 0;
    if (happiness > 100) happiness = 100;

    System.out.println("Nick had a great time playing!");
    checkStats(); // Display updated stats
}

}