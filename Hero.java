import java.util.ArrayList;

/**
 * This class represents a superhero character and implements the Contract interface.
 * It tracks promises made by the hero and allows the hero to fulfill them.
 */
public class Hero implements Contract {

    private String name; // Name of the hero
    private String power; // Primary superpower of the hero
    private ArrayList<String> promises; // List of promises the hero has made
    private ArrayList<String> fulfilledPromises; // List of promises the hero has fulfilled

    /**
     * Constructor for Hero class.
     * 
     * @param name The hero's name
     * @param power The hero's primary superpower
     */
    public Hero(String name, String power) {
        this.name = name;
        this.power = power;
        this.promises = new ArrayList<>();
        this.fulfilledPromises = new ArrayList<>();
    }

    /**
     * Makes a promise that the hero commits to.
     * 
     * @param promise The promise made by the hero
     */
    @Override
    public void makePromise(String promise) {
        promises.add(promise);
        System.out.println(this.name + " has made a promise: \"" + promise + "\"");
    }

    /**
     * Fulfills the first unfulfilled promise.
     */
    @Override
    public void fulfillPromise() {
        if (promises.isEmpty()) {
            System.out.println(this.name + " has no promises left to fulfill.");
        } else {
            String fulfilled = promises.remove(0);
            fulfilledPromises.add(fulfilled);
            System.out.println(this.name + " has fulfilled the promise: \"" + fulfilled + "\"");
        }
    }

    /**
     * Returns the current status of all promises.
     * 
     * @return A string indicating the promises fulfilled and pending.
     */
    @Override
    public String checkPromiseStatus() {
        return this.name + " has fulfilled " + fulfilledPromises.size() + " promise(s) and has " + promises.size() + " pending.";
    }

    /**
     * Returns a string representation of the hero.
     * 
     * @return A string describing the hero.
     */
    @Override
    public String toString() {
        return "Hero: " + this.name + "\nPower: " + this.power + "\n" + this.checkPromiseStatus();
    }

    public static void main(String[] args) {
        // Create a Marvel-inspired hero
        Hero spiderman = new Hero("Spider-Man", "Wall-crawling and web-slinging");

        // Spider-Man makes some promises
        spiderman.makePromise("Save Aunt May");
        spiderman.makePromise("Stop the Green Goblin");
        spiderman.makePromise("Help the Avengers");

        // Check status
        System.out.println(spiderman);

        // Spider-Man fulfills promises
        spiderman.fulfillPromise();
        spiderman.fulfillPromise();

        // Check status again
        System.out.println(spiderman);

        // Spider-Man fulfills the last promise
        spiderman.fulfillPromise();

        // Check final status
        System.out.println(spiderman);
    }
}