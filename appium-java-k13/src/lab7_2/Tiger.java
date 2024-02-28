package lab7_2;

import java.security.SecureRandom;

public class Tiger extends Animal{
    private static final int MAX_SPEED=100;
    public Tiger(){
        this.name = "Tiger";
        this.speed = new SecureRandom().nextInt(MAX_SPEED+1);
    }
}
