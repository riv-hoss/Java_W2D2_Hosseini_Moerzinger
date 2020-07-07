public class F_A_Vodka extends F_Abstract{

    String name;
    int vol;
    String color;


    F_A_Vodka(String n, int v, String c){
        name = n;
        vol = v;
        color = c;
    }




    @Override
    public void drink() {
        System.out.println("Vodka: " + name + "  Vol: " + vol + "  Color: " + color + ".");
    }
}
