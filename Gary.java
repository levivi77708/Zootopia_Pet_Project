/**
 * Represents Gary, a character with attributes like health, energy, and happiness.
 * This class provides methods to interact with Gary, such as eating, sleeping, and playing.
 * @author Amirah B, Ryan L, Vivi L, Eva C, Copilot
 */
public class Gary implements Animal {


    private int health;
    private int energy;
    private int happiness;
    private int temperature;
    

    /**
     * Default constructor for the Gary class.
     * Initializes Gary's health, energy, happiness, and temperature to default values.
     */    
    public Gary() {
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
        this.temperature = 70; // Normal body temperature in Fahrenheit
    }

    /**
     * Parameterized constructor for the Gary class.
     * Allows setting initial values for health, energy, happiness, and temperature.
     * 
     * @param health      The initial health value.
     * @param energy      The initial energy value.
     * @param happiness   The initial happiness value.
     * @param temperature The initial temperature value.
     */
    public Gary(int health, int energy, int happiness, int temperature) {
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
        this.temperature = temperature;
    }


    /**
     * Gets the current health level of Gary.
     * 
     * @return The current health level.
     */    
    @Override
    public int getHealth() {
        return health;
    }

    /**
     * Sets the health level of Gary.
     * 
     * @param health The new health level to set.
     */
    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Gets the current energy level of Gary.
     * 
     * @return The current energy level.
     */
    @Override
    public int getEnergy() {
        return energy;
    }

    /**
     * Sets the energy level of Gary.
     * 
     * @param energy The new energy level to set.
     */
    @Override
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    
    /**
     * Gets the current happiness level of Gary.
     * 
     * @return The current happiness level.
     */
    @Override
    public int getHappiness() {
        return happiness;
    }

    /**
    * Sets the happiness level of Gary.
    * 
    * @param happiness The new happiness level to set.
    */
    @Override
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    /**
     * Gets the current temperature of Gary.
    * 
    * @return The current temperature of Gary.
    */
    public int getTemperature() {
        return temperature;
    }

    /**
     * Sets the temperature of Gary.
     * 
     * @param temperature The new temperature to set.
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
    * Method to decrease Gary's stats when doing nothing.
    * Doing nothing decreases health, energy, happiness, and temperature.
    */
    @Override
    public void doNothing() {
        System.out.println("You chose to do nothing. Gary is feeling neglected...");
        
        // Decrease attributes
        this.health -= 5;
        this.energy -= 5;
        this.happiness -= 10;
        this.temperature -= 2;

    }

    /**
     * Displays Gary's current stats, including health, energy, happiness, and temperature.
    */
    @Override
    public void checkStats() {
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness);
        System.out.println("Temperature: " + temperature + "°F");
    }


    /**
     * Gives Gary a hug to warm him up and increase his happiness.
     * If Gary's temperature is below 60°F, this method sets his temperature to 70°F
     * and increases his happiness. If his happiness exceeds 100, it is capped at 100.
     * If Gary's temperature is already warm enough, no action is taken.
     */
    public void giveHug() {
        if (temperature < 60) {
            System.out.println("Gary is cold! Giving him a warm hug...");
            this.temperature = 70; // Set temperature back to a healthy level
            System.out.println("Gary feels better now! His temperature is back to " + temperature + "°F.");
            this.happiness += 10; // Hugging increases happiness
            if (happiness > 100) happiness = 100;
        } else {
            System.out.println("Gary is warm enough and doesn't need a hug right now.");
        }
    }

    /**
     * Method for Gary to eat and regain energy and health.
     * Eating improves Gary's health, restores energy, and slightly increases happiness.
     * Ensures that health, energy, and happiness do not exceed their maximum values (100).
     */
    @Override
    public void eat() {
        System.out.println("Gary is eating his favorite sweet treat to make him feel better!");
        this.health += 10; // Eating improves health
        this.energy += 15; // Eating restores energy
        this.happiness += 5; // Eating makes Gary a little happier

        // Ensure stats don't exceed maximum values (e.g., 100)
        if (health > 100) health = 100;
        if (energy > 100) energy = 100;
        if (happiness > 100) happiness = 100;

        System.out.println("Gary feels better after eating!");

    }

    /**
     * Method for Gary to sleep and regain energy.
     * Sleeping restores Gary's energy, slightly improves health, and increases happiness.
     * Ensures that health, energy, and happiness do not exceed their maximum values (100).
     */
    @Override
    public void sleep() {
        System.out.println("Gary is sleeping peacefully");
        this.energy += 20; // Sleeping restores energy
        this.health += 5; // Sleeping slightly improves health
        this.happiness += 5; // Sleeping makes Gary happier

        // Ensure stats don't exceed maximum values (e.g., 100)
        if (health > 100) health = 100;
        if (energy > 100) energy = 100;
        if (happiness > 100) happiness = 100;

        System.out.println("Gary feels refreshed after sleeping!");

    }

    /**
     * Method for Gary to play and increase happiness.
     * Playing makes Gary much happier but uses up energy and slightly reduces health.
     * Ensures that stats do not drop below zero.
     */
    @Override
    public void play() {
        System.out.println("Gary is having fun playing with his new friend!");
        this.happiness += 20; // Playing makes Gary much happier
        this.energy -= 10; // Playing uses up energy
        this.health -= 5; // Playing too much can slightly reduce health

        // Ensure stats don't drop below zero
        if (health < 0) health = 0;
        if (energy < 0) energy = 0;
        if (happiness > 100) happiness = 100;

        System.out.println("Gary had a great time playing with you!");

    }

}
