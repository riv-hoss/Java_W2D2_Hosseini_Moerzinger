package Amin;


public class Bike implements VehicleControls {
    String brand;
    String model;
    String color;
    int speed;
    int size;


    public Bike (String brand, String model, int speed) { // constructor
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }


    @Override
    public void move(int i){
        speed += i;
        System.out.println("Current speed is: " + speed);

    }

    @Override
    public void applyBreaks(int i) {
        speed -= i;
        if (speed < 0) {
            System.out.printf("Current speed: %.2f\n" +
                    "You broke too hard. You're going back in time now, enjoy!",speed);
        } else {
            System.out.println("Current speed is: " + speed);
        }

    }

}
