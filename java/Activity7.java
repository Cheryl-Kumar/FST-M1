package activities;

interface BicycleParts {
    public int gears = 0;
    public int currentSpeed = 0;
}

interface BicycleOperations {
    public void applyBrake(int decrease);
    public void speedUp(int increase);
}
 
class Bicycle implements BicycleParts, BicycleOperations {

    public int gears;
    public int currentSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    public void applyBrake(int decrease) {
        currentSpeed = currentSpeed - decrease;
        System.out.println("Current speed after brakes " + currentSpeed);
    }

    public void speedUp(int increase) {
        currentSpeed = currentSpeed + increase;
        System.out.println("Current speed after increase " + currentSpeed);
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}

class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gears, int currentSpeed, int startHeight) {
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }  
}

public class Activity7 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}