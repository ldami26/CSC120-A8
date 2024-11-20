/**
 * This interface defines the contract for classes that implement it.
 * It contains methods that must be implemented by any implementing class.
 */
public interface Contract {

    /** An action the class must perform. */
    void makePromise(String promise);

    /** Execute the promised action. */
    void fulfillPromise();

    /** Return the status of the promise. */
    String checkPromiseStatus();
}