package Florian;

public class F_A_Outcome {

    public static void main(String[] args) {
        F_A_Vodka v1 = new F_A_Vodka("Grey Goose", 40, "cleare" );
        F_A_Whiskey w1 = new F_A_Whiskey("Glan Grand", 40, "brown");


        F_A_Whiskey WKY[] = new F_A_Whiskey[3];

        WKY[0] = new F_A_Whiskey("Oban", 40, "lightbrown");
        WKY[1] = new F_A_Whiskey("Glan Morangy", 45, "some kind of brwon");
        WKY[2] = new F_A_Whiskey("Jack Daniels", 38, "the ugly one");

        F_A_Vodka VDK[] = new F_A_Vodka[3];

        VDK[0] = new F_A_Vodka("Absolut Vodka", 40, "like a mirror");
        VDK[1] = new F_A_Vodka("KARNEVAL", 38, "transparent");
        VDK[2] = new F_A_Vodka("Belvedere", 45, "se-through");


        v1.drink();
        w1.drink();


        for(int i = 0; i < VDK.length; i++){
            VDK[i].drinks();
        }

        for(int i = 0; i < WKY.length; i++){
            WKY[i].drinks();
        }


    }

}
