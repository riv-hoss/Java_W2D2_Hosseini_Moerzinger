package Florian;

public class Player1 implements CardGame{

    String name;
    int cards;
    int cardpoints;

    Player1(String n, int c, int cp){
        this.name = n;
        this.cards = c;
        this.cardpoints = cp;

    }

    @Override
    public void cardStatus() {
        System.out.println(name + "'s points are " + cardpoints + " and there are " + cards + " Cards left.");
    }

    public void minuscard(){
        cards = cards - 1;
    }
    public void cardinfo(){
        System.out.println(name + " Cards: " + cards +  " Points: " + cardpoints);
    }

    @Override
    public void Ace() {
        cardpoints = cardpoints + 12;
        minuscard();
        cardinfo();
    }

    @Override
    public void King() {
        cardpoints = cardpoints + 10;
        minuscard();
        cardinfo();
    }

    @Override
    public void Queen() {
        cardpoints = cardpoints + 8;
        minuscard();
        cardinfo();
    }

    @Override
    public void Jack() {
        cardpoints = cardpoints + 6;
        minuscard();
        cardinfo();
    }


}
