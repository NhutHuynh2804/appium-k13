package lab7_2;

import java.util.ArrayList;
import java.util.List;

public class RaceController {
    //List<Animal>
    //RaceController
    //addRacer
    //startRace()
    private List<Animal> racers;
    public RaceController(){
        racers = new ArrayList<>();
    }
    public void addRacer(Animal racer){
        racers.add(racer);
    }
    public void startRace(){
        if(racers.isEmpty()){
            System.out.println("No Animal join race");
            return;
        }
        Animal winner =racers.get(0);
        int Max_Speed=winner.getSpeed();
        for (Animal racer : racers) {
            int speed = racer.getSpeed();
            if(speed>Max_Speed){
                Max_Speed=speed;
                winner=racer;
            }
        }
        System.out.println("Animal winner is:"+winner.getName()+", with speed:"+Max_Speed+"km/h");
    }


    public static void main(String[] args) {
        RaceController raceController = new RaceController();
        raceController.addRacer(new Horse());
        raceController.addRacer(new Dog());
        raceController.addRacer(new Tiger());

        // Add more animals to the race if needed
        // raceController.addRacer(new AnotherAnimal());

        raceController.startRace();
    }
}