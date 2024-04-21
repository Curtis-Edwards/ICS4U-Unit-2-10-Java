/*
* This is the main code that runs with the Vehicle Class.
*
* @author  Curtis Edwards
* @version 1.0
* @since   2024-04-20
*/

/**
* This is the Main2 class.
*/
final class Main2 {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private Main2() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // Constants for magic numbers
        final int fortyNumber = 40;

        final Vehicle car = new Vehicle("Red", fortyNumber);

        System.out.println("Created car.\nStatus:\n");
        car.status();

        System.out.println("\nDone.");
    }
}
