
// Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla awesomeGorilla = new Gorilla(); // instantiate gorilla object.

        awesomeGorilla.throwSomething();
        awesomeGorilla.throwSomething();
        awesomeGorilla.throwSomething();
        awesomeGorilla.eatBananas();
        awesomeGorilla.eatBananas();
        awesomeGorilla.climb();
        awesomeGorilla.displayEnergy();

        // Create a BatTest class to instantiate a bat and have it attack three towns,
        // eat two humans, and fly twice.

        Bat awesomeBat = new Bat(); // instantiate gorilla object.

        awesomeBat.attackTown();
        awesomeBat.attackTown();
        awesomeBat.attackTown();
        awesomeBat.eatHumans();
        awesomeBat.eatHumans();
        awesomeBat.fly();
        awesomeBat.fly();
        awesomeBat.displayEnergy();

    }

}
