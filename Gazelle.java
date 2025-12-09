public class Gazelle {
    private int health = 100;
    private int energy = 100;
    private int happiness = 100;

    // No-argument constructor
    public Gazelle() {
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
    }

    // Parameterized constructor
    public Gazelle(int health, int energy, int happiness) {
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
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

    // Method to simulate doing nothing
    public void doNothing() {
        //Doing nothing decreases energy, health, and happiness by 5
        this.energy -= 5;
        this.happiness -= 5;
        this.health -= 5;
    }

    // Method to check stats with separate print statements
    public void checkStats() {
    System.out.println("Gazelle Stats:");
    System.out.println("Health: " + health);
    System.out.println("Energy: " + energy);
    System.out.println("Happiness: " + happiness);
}

}