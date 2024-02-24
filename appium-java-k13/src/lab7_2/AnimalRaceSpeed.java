package lab7_2;

public class AnimalRaceSpeed {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.setName("Dog");
        Animal horse = new Horse();
        horse.setName("Horse");
        Animal tiger = new Tiger();
        tiger.setName("Tiger");

        int dogSpeed = dog.speed();
        System.out.println(dog.getName() + " is running with a speed of: " + dogSpeed + " km/h");
        int horseSpeed = horse.speed();
        System.out.println(horse.getName() + " is running with a speed of: " + horseSpeed + " km/h");
        int tigerSpeed = tiger.speed();
        System.out.println(tiger.getName() + " is running with a speed of: " + tigerSpeed + " km/h");


        Animal winner;
        int maxSpeed = Math.max(tigerSpeed, (Math.max(dogSpeed, horseSpeed)));
        if (maxSpeed == tigerSpeed) {
            winner = tiger;
        } else if (maxSpeed == horseSpeed) {
            winner = horse;
        } else {
            winner = dog;
        }
        System.out.println("Winner is " + winner.getName() + ", with speed: " + maxSpeed + " km/h");

    }
}