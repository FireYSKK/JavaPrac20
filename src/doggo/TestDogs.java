package doggo;

public class TestDogs {
    public static void main(String[] args) {
        Dog dog1 = new GoldenRetriever("Paddy", 7);
        Dog dog2 = new Chihuahua("August", 3);
        Dog dog3 = new Bloodhound("Max", 10);
        dog1.goodBoy();
        dog2.bark();
        dog2.goodBoy();
        dog3.goodBoy();
    }
}
