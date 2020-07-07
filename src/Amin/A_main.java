package Amin;

public class A_main {


    public static void main(String[] args) {

        // ==================================== A1 ============================================
        System.out.println("==================================== A1 ======" +
                "======================================");
        Porsche carOne = new Porsche("911GT", 4000.0, 1500.0);

        carOne.carInfo();


        // ==================================== A3 ============================================
        System.out.println("\n==================================== A3 ======" +
                "======================================");
        Bike bikeOne = new Bike("KTM", "Mountain", 12);

        bikeOne.move(4);
        bikeOne.applyBreaks(5);
    }

}
