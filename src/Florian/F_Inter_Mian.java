package Florian;

// main method for example 1 and 2

public class F_Inter_Mian {


    public static void main(String[] args) {
       F_Interface1 shit = new F_Interface1();

        shit.myMethod("i'm Back");

        F_Bycicle bike1 =  new F_Bycicle("KTM", 30);

        bike1.applyBreaks(4);

        bike1.move(6);

        bike1.speedStatus();

        bike1.move(12);

        bike1.speedStatus();


    }

}
