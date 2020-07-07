package Florian;

public class mainGame {

    public static void main(String[] args) {
        Player1 p1 = new Player1("Karl", 5 , 0);
        Player2 p2 = new Player2("Kerstin", 5, 0);

        p1.cardStatus();
        p2.cardStatus();

        p1.Jack();
        p2.King();
        p1.Queen();
        p2.Ace();
        p1.Ace();
        p2.Queen();
        p1.King();
        p2.Ace();
        p1.Jack();
        p2.Queen();

        p1.cardStatus();
        p2.cardStatus();






    }

}
