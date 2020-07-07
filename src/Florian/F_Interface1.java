package Florian;

//example 1

public class F_Interface1 implements F_Inter{

    String back;


    public void myMethod(String i) {
        System.out.println("Hi Mom");
        back = back + i;
        System.out.println(i);
    }
}
