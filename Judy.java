public class Judy {
    private int health = 100;
    private int energy = 100;
    private int happiness = 100;

    // Setter methods to modify attributes
    public void setHealth(int health) {
        this.health = Math.max(0, Math.min(100, health));
    }

    public void setEnergy(int energy) {
        this.energy = Math.max(0, Math.min(100, energy));
    }

    public void setHappiness(int happiness) {
        this.happiness = Math.max(0, Math.min(100, happiness));
    }

    // Getter methods to retrieve attributes
    public int getHealth() {
        return this.health;
    }  

    public int getEnergy() {
        return this.energy;
    }

    public int getHappiness() {
        return this.happiness;
    }

    // Method to solve a case
    public void solveCase(int num) {
        System.out.println("Solving case #" + num);
        this.health -= 5;
        this.energy -= 15;
        this.happiness += 5;
    }

    // Method to do nothing
    public void doNothing() {
        System.out.println("Judy is doing nothing...");
        this.energy -= 2;
        this.health -= 1;
        this.happiness -= 2;
    }

    // Method for Judy to eat and restore health and energy
public void eat() {
    System.out.println("Judy is enjoying a healthy meal!");
    health += 10; // Eating restores health
    energy += 15; // Eating restores energy

    // Ensure stats don't exceed maximum values
    if (health > 100) health = 100;
    if (energy > 100) energy = 100;

    System.out.println("Judy feels energized after eating!");
    checkStats(); // Display updated stats
}

// Method for Judy to sleep and restore energy, health, and happiness
public void sleep() {
    System.out.println("Judy is taking a well-deserved nap.");
    energy += 20; // Sleeping restores energy
    health += 5; // Sleeping slightly improves health
    happiness += 5; // Sleeping makes Judy happier

    // Ensure stats don't exceed maximum values
    if (health > 100) health = 100;
    if (energy > 100) energy = 100;
    if (happiness > 100) happiness = 100;

    System.out.println("Judy feels refreshed after sleeping!");
    checkStats(); // Display updated stats
}

// Method for Judy to play and increase happiness
public void play() {
    System.out.println("Judy is playing and having a great time!");
    happiness += 20; // Playing makes Judy much happier
    energy -= 10; // Playing uses up energy
    health -= 5; // Playing too much can slightly reduce health

    // Ensure stats don't drop below zero or exceed maximum values
    if (health < 0) health = 0;
    if (energy < 0) energy = 0;
    if (happiness > 100) happiness = 100;

    System.out.println("Judy had a lot of fun playing!");
    checkStats(); // Display updated stats
}
    // Method to check and display the current stats
    public void checkStats() {
        System.out.println("Current Stats:");
        System.out.println("Health: " + this.health);
        System.out.println("Energy: " + this.energy);
        System.out.println("Happiness: " + this.happiness);
    }
}   