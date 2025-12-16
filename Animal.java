public interface Animal {
    /** Allows the animal to sleep. */
    public void sleep();
    /** Allows the animal to eat. */
    public void eat();
    /** Allows the animal to play. */
    public void play();
    /** Simulates the animal doing nothing. */
    public void doNothing();

    /** Displays the animal's stats. */
    public void checkStats();

    /** Gets the health of the animal. */
    int getHealth();
    /** Sets the health of the animal. */
    void setHealth(int health);
    /** Gets the energy of the animal. */
    int getEnergy();
    /** Sets the energy of the animal. */
    void setEnergy(int energy);
    /** Gets the happiness of the animal. */
    int getHappiness();
    /** Sets the happiness of the animal. */
    void setHappiness(int happiness);
}
