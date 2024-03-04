package lab10_1;

import java.security.SecureRandom;

public class Animal {
    protected String name;
    protected int speed;
    protected boolean flyable;

    private Animal(Builder builder) {
        this.name= builder.name;
        this.speed= new SecureRandom().nextInt(builder.maxSpeed + 1);
        this.flyable= builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }
    public static class Builder{
        private  String name;
        private int maxSpeed;
        private boolean flyable;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder withWings(boolean flyable) {
            this.flyable = flyable;
            return this;
        }
        public Animal build (){
            return new Animal(this);
        }
        //Set default value
        public Builder(){
            this.name="Unknow";
            this.maxSpeed=0;
            this.flyable=true;
        }
    }
//    private Animal(String name, int maxSpeed, boolean flyable) {
//        this.name = name;
//        this.speed = new SecureRandom().nextInt(maxSpeed + 1);
//        this.flyable = flyable;
//    }
}
