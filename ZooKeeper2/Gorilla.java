
// Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()

// inherit the Mammal class
public class Gorilla extends Mammal {
    // For the throwSomething() method, have it print out a message indicating that
    // the gorilla has thrown something, as well as decrease the energy level by 5
    public void throwSomething() {
        System.out.println("Gorilla has thown a banana!");
        energyLevel -= 5;
    }

    // For the eatBananas() method, have it print out a message indicating the
    // gorilla's satisfaction and increase its energy by 10
    public void eatBananas() {
        System.out.println("Gorilla Tommy is  Full. Lots of bananas to thank...");
        energyLevel += 10;
    }

    // For the climb() method, have it print out a message indicating the gorilla
    // has climbed a tree and decrease its energy by 10
    public void climb() {
        System.out.println("Gorilla is getting fatigued as a result of climbing a tree...");
        energyLevel -= 10;
    }
}