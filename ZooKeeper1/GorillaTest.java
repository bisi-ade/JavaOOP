
// Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla awesomeGorilla = new Gorilla(); // instantiate gorilla object.
        awesomeGorilla.displayEnergy();
        awesomeGorilla.throwSomething();
        awesomeGorilla.throwSomething();
        awesomeGorilla.throwSomething();
        awesomeGorilla.eatBananas();
        awesomeGorilla.eatBananas();
        awesomeGorilla.climb();
        awesomeGorilla.displayEnergy();
    }
}
