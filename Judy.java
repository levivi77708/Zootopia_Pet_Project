/**
 * Represents Judy, a character with attributes like health, energy, and happiness.
 * This class provides methods to interact with Judy, such as eating, sleeping, and playing.
 * @author Amirah B, Ryan L, Vivi L, Eva C, Copilot
 */
public class Judy implements Animal {
    private int health = 100;
    private int energy = 100;
    private int happiness = 100;

    /** Sets the health of Judy, ensuring it stays between 0 and 100.
     * @param health the health value to set
     */
    @Override
    public void setHealth(int health) {
        this.health = Math.max(0, Math.min(100, health));
    }

    /** Sets the energy of Judy, ensuring it stays between 0 and 100.
     * @param energy the energy value to set
     */
    @Override
    public void setEnergy(int energy) {
        this.energy = Math.max(0, Math.min(100, energy));
    }

    /** Sets the happiness of Judy, ensuring it stays between 0 and 100.
     * @param happiness the happiness value to set
     */
    @Override
    public void setHappiness(int happiness) {
        this.happiness = Math.max(0, Math.min(100, happiness));
    }

    /** Gets the current health level of Judy.
     * @return the health value
     */
    @Override
    public int getHealth() {
        return this.health;
    }  

    /** Gets the current energy level of Judy.
     * @return the energy value
     */
    @Override
    public int getEnergy() {
        return this.energy;
    }

    /** Gets the current happiness level of Judy.
     * @return the happiness value
     */
    @Override
    public int getHappiness() {
        return this.happiness;
    }

    /** Allows Judy to sleep, increasing energy and health. */
    @Override
    public void sleep() {
        System.out.println("Judy is sleeping...");
        this.energy += 30;
        this.health += 10;
    }

    /** Allows Judy to eat, increasing energy and health, slightly decreasing happiness. */
    @Override
    public void eat() {
        System.out.println("Judy is eating...");
        this.energy += 15;
        this.health += 5;
        this.happiness -= 1;
    }

    /** Simulates Judy doing nothing, decreasing energy, health, and happiness. */
    @Override
    public void doNothing() {
        System.out.println("Judy is doing nothing and getting bored...");
        this.energy -= 2;
        this.health -= 1;
        this.happiness -= 2;
    }
    /** Allows Judy to solve a case, simulating work with random success.
     * @param num the case number
     */
    public void solveCase(int num) {
        System.out.println("Judy is working on solving case #" + num + "...");

        // Simulate solving the case in steps
        for (int i = 1; i <= 3; i++) {
            System.out.println("Working on step " + i + " of the case...");
            this.energy -= 5; // Each step reduces energy
            this.health -= 2; // Each step slightly reduces health

            // Ensure stats don't drop below zero
            if (this.energy < 0) this.energy = 0;
            if (this.health < 0) this.health = 0;
        }

        // Randomly determine if the case is solved successfully
        boolean caseSolved = new java.util.Random().nextBoolean();

        if (caseSolved) {
            System.out.println("Judy successfully solved case #" + num + "!");
            this.happiness += 10; // Success increases happiness
        } else {
            System.out.println("Judy couldn't solve case #" + num + "...");
            this.happiness -= 5; // Failure decreases happiness
            this.energy -= 5; // Failure uses more energy
        }

        // Ensure stats remain within valid ranges
        if (this.happiness > 100) this.happiness = 100;
        if (this.happiness < 0) this.happiness = 0;
        if (this.energy < 0) this.energy = 0;

        // Display updated stats
        checkStats();
    }

    /** Allows Judy to play, increasing happiness and decreasing energy and health. */
    @Override
    public void play() {
        System.out.println("Judy is playing and having fun!");
        this.happiness += 20; // Playing makes Judy much happier
        this.energy -= 10; // Playing uses up energy
        this.health -= 5; // Playing too much can slightly reduce health

        // Ensure stats don't drop below zero
        if (health < 0) health = 0;
        if (energy < 0) energy = 0;
        if (happiness > 100) happiness = 100;

        System.out.println("Judy had a great time playing!");
    }

    /** Displays Judy's current stats. */
    @Override
    public void checkStats() {
        System.out.println("Current Stats:");
        System.out.println("Health: " + this.health);
        System.out.println("Energy: " + this.energy);
        System.out.println("Happiness: " + this.happiness);
    }

}   
 
