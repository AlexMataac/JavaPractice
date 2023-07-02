package oop_example.motorbike;

public class MotorBike {

    //state
    private int speed;
    MotorBike() {
        this.speed = 5; //this(5)
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0)
            this.speed = speed;
//        System.out.println(speed);
//        System.out.println(this.speed);
    }

    public MotorBike(int speed) {
        this.speed = speed;
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
       setSpeed(this.speed - howMuch);
    }
    //behaviour
    void start() {
        System.out.println("Bike Started");
    }
}
