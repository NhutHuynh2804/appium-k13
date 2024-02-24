package lab7_2;

import java.security.SecureRandom;

public class Animal {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int speed(){
         return new SecureRandom().nextInt(50);
    }
}
