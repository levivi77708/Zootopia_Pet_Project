public class Gary {
    private int health;
    private int energy;
    private int happiness;
    private int temperature;

    // Default constructor
    public Gary() {
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
        this.temperature = 70; // Normal body temperature in Fahrenheit
    }

    // Parameterized constructor
    public Gary(int health, int energy, int happiness, int temperature) {
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
        this.temperature = temperature;
    }

    // Getter and Setter for health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Getter and Setter for energy
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // Getter and Setter for happiness
    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    // Getter and Setter for temperature
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    // Method to decrease stats when doing nothing
    public void doNothing() {
        System.out.println("You chose to do nothing. Gary is feeling neglected...");
        
        // Decrease attributes
        health -= 5;
        energy -= 5;
        happiness -= 10;
        temperature -= 2;

        // Check if any stat goes below 0
        if (health < 0 || energy < 0 || happiness < 0 || temperature < 0) {
            System.out.println("Oh no! Gary is too sad and has run away...");
            System.exit(0); // Exit the program
        }

    }

    // Method to display Gary's stats
    public void checkStats() {
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness);
        System.out.println("Temperature: " + temperature + "°F");
    }

    // Method to give Gary a hug and warm him up
    public void giveHug() {
        if (temperature < 60) {
            System.out.println("Gary is cold! Giving him a warm hug...");
            temperature = 70; // Set temperature back to a healthy level
            System.out.println("Gary feels better now! His temperature is back to " + temperature + "°F.");
            happiness += 10; // Hugging increases happiness
            if (happiness > 100) happiness = 100;
        } else {
            System.out.println("Gary is warm enough and doesn't need a hug right now.");
        }
    }
    // Method for Gary to eat and regain energy and health
    public void eat() {
        System.out.println("Gary is eating his favorite food!");
        health += 10; // Eating improves health
        energy += 15; // Eating restores energy
        happiness += 5; // Eating makes Gary a little happier

        // Ensure stats don't exceed maximum values (e.g., 100)
        if (health > 100) health = 100;
        if (energy > 100) energy = 100;
        if (happiness > 100) happiness = 100;

        System.out.println("Gary feels better after eating!");

    }

    // Method for Gary to sleep and regain energy
    public void sleep() {
        System.out.println("Gary is sleeping peacefully");
        energy += 20; // Sleeping restores energy
        health += 5; // Sleeping slightly improves health
        happiness += 5; // Sleeping makes Gary happier

        // Ensure stats don't exceed maximum values (e.g., 100)
        if (health > 100) health = 100;
        if (energy > 100) energy = 100;
        if (happiness > 100) happiness = 100;

        System.out.println("Gary feels refreshed after sleeping!");

    }

    // Method for Gary to play and increase happiness
    public void play() {
        System.out.println("Gary is playing and having fun!");
        happiness += 20; // Playing makes Gary much happier
        energy -= 10; // Playing uses up energy
        health -= 5; // Playing too much can slightly reduce health

        // Ensure stats don't drop below zero
        if (health < 0) health = 0;
        if (energy < 0) energy = 0;
        if (happiness > 100) happiness = 100;

        System.out.println("Gary had a great time playing!");
        checkStats(); // Display updated stats
    }

}
