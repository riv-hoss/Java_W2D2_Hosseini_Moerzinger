public class F_A_Whiskey extends F_Abstract{


    String name;
    int vol;
    String color;


    F_A_Whiskey(String n, int v, String c){
        this.name = n;
        this.vol = v;
        this.color = c;
    }


    @Override
    public void drink() {
        System.out.println("Wihiskey: " + this.name + "  Vol: " + this.vol + "  Color: " + this.color + ".");
    }
}
