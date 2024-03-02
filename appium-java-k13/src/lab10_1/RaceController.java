package lab10_1;

public class RaceController {
    public static void main(String[] args) {
        Animal tiger = new Animal.Builder()
                .withName("Tiger")
                .withMaxSpeed(100)
                .withWings(false)
                .build();
        Animal snake = new Animal.Builder()
                .withName("Snake")
                .withMaxSpeed(20)
                .withWings(false)
                .build();
        Animal falcon = new Animal.Builder()
                .withName("Falcon")
                .withMaxSpeed(200)
                .withWings(true)
                .build();
        Animal eagle = new Animal.Builder()
                .withName("Eagle")
                .withMaxSpeed(220)
                .withWings(true)
                .build();
        Animal horse = new Animal.Builder()
                .withName("Horse")
                .withMaxSpeed(85)
                .withWings(false)
                .build();
        determineWinner(tiger,snake,falcon,eagle,horse);

    }

    private static void determineWinner(Animal...animals) {
        Animal winner =null;
        int maxSpeed = 0;
        for (Animal animal : animals) {
            if(animal!=null && !animal.isFlyable()){
                int speed = animal.getSpeed();
                if(speed>maxSpeed){
                    maxSpeed=speed;
                    winner=animal;
                }
            }
        }
        if(winner!=null){
            System.out.println("Animal winner is:"+winner.getName()+"with speed"+maxSpeed+"km/h");
        }
        else {
            System.out.println("No animal join this race");
        }
    }
}
