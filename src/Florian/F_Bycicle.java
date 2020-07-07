package Florian;

//example 2

public class F_Bycicle implements F_Inter2{

    int speed;
    String name;

    F_Bycicle(String n, int s){
        this.speed = s;
        this.name = n;
    }


    @Override
    public void move(int increase) {
        speed = speed + increase;
    }

    @Override
    public void applyBreaks(int decrease) {
        speed = speed -decrease;
    }

    @Override
    public void speedStatus() {
        System.out.println( name + " the Speed is: " + speed);
    }


}
