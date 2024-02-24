package lab7_2;

import java.security.SecureRandom;

public class Tiger extends Animal{
    @Override
    public int speed() {
        return new SecureRandom().nextInt(101);
    }
}
