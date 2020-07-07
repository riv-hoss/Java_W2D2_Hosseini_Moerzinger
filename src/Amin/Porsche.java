package Amin;

public class Porsche extends A1_Car{

    String modelName;
    double  motorCC;
    double weightKG;

    // constructor
    public Porsche (String modelName, double  motorCC, double weightKG) {
        this.modelName = modelName;
        this.motorCC = motorCC;
        this.weightKG = weightKG;
    }

    public void carInfo () {
        double cons = carConsump(motorCC, weightKG);
        System.out.printf("Porsche %s has fuel consumption of %.2f.\n", modelName, cons);
    }

    @Override
    public void carMake(String name) {
        System.out.printf("It was made by %s.\n", name);
    }

    @Override
    public double carConsump (double motorCC, double weightKG) {
        return Math.log(motorCC / weightKG) * 15.0;

    }
}
