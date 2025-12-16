/**
 * Represents Nick, a character with attributes like health, energy, and happiness.
 * This class provides methods to interact with Nick, such as eating, sleeping, and playing.
 * @author Amirah B, Ryan L, Vivi L, Eva C, Copilot
 */
public class Nick implements Animal {
    private int health = 100;
    private int energy = 100;
    private int happiness = 100;

    /** Default constructor for Nick. Initializes health, energy, and happiness to 100. */
    public Nick() {
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
    }

    /** Parameterized constructor for Nick.
     * @param health initial health
     * @param energy initial energy
     * @param happiness initial happiness
     */
    public Nick(int health, int energy, int happiness) {
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
    }

    /** Gets the health of Nick.
     * @return the health value
     */
    @Override
    public int getHealth() {
        return health;
    }

    /** Sets the health of Nick.
     * @param health the health value to set
     */
    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    /** Gets the energy of Nick.
     * @return the energy value
     */
    @Override
    public int getEnergy() {
        return energy;
    }

    /** Sets the energy of Nick.
     * @param energy the energy value to set
     */
    @Override
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /** Gets the happiness of Nick.
     * @return the happiness value
     */
    @Override
    public int getHappiness() {
        return happiness;
    }

    /** Sets the happiness of Nick.
     * @param happiness the happiness value to set
     */
    @Override
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    /** Simulates Nick doing nothing, decreasing energy and happiness. */
    @Override
    public void doNothing() {
        // Doing nothing decreases energy and happiness slightly
        this.energy -= 5;
        this.happiness -= 5;
        // Health remains unchanged
        validateStats();
    }

    /** Allows Nick to eat pawpsicles, increasing energy and happiness.
     * @param num number of pawpsicles (up to 3)
     */
    public void eatPawpsicle(int num) {
        System.out.println("Nick is enjoying a pawpsicle!");
        if (num <= 3 && num > 0) {
            this.energy += num * 5; // Each pawpsicle gives 5 energy
            this.happiness += num * 3; // Each pawpsicle gives 3 happiness
        }
        else {
            System.out.println("Nick can only eat up to 3 pawpsicles at a time!");
        }
        validateStats();
    }

    /** Validates and adjusts stats to ensure they are within valid ranges. */
    public void validateStats() {
        // Ensure stats don't drop below zero
        if (health < 0) health = 0;
        if (energy < 0) energy = 0;
        if (happiness > 100) happiness = 100;
    }

    /** Allows Nick to sleep, increasing energy and health. */
    @Override
    public void sleep() {
        System.out.println("Nick is sleeping and getting rest!");
        this.energy += 30;
        this.health += 10;
        validateStats();
    }

    /** Allows Nick to eat, increasing energy, health, and slightly decreasing happiness. */
    @Override
    public void eat() {
        System.out.println("Nick is eating!");
        this.energy += 15;
        this.health += 5;
        this.happiness -= 1;
        validateStats();
    }

    /** Displays Nick's current stats. */
    @Override
    public void checkStats() {
        System.out.println("Current Stats:");
        System.out.println("Health: " + this.health);
        System.out.println("Energy: " + this.energy);
        System.out.println("Happiness: " + this.happiness);
    }

     /** Allows Nick to play, increasing happiness and decreasing energy and health. */
    @Override
    public void play() {
        System.out.println("Nick is playing and having fun!");
        this.happiness += 20; // Playing makes Nick much happier
        this.energy -= 10; // Playing uses up energy
        this.health -= 5; // Playing too much can slightly reduce health

        // Ensure stats don't drop below zero
        if (health < 0) health = 0;
        if (energy < 0) energy = 0;
        if (happiness > 100) happiness = 100;

        System.out.println("Nick had a great time playing!");

    }
}
