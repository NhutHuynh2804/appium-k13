package lab7_2;

import java.security.SecureRandom;

public class Dog extends Animal {
    private static final int MAX_SPEED=60;
    public Dog(){
        this.name="Dog";
        this.speed = new SecureRandom().nextInt(MAX_SPEED+1);
    }


}
