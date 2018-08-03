package deck.teste;

import deck.*;

public class Teste {
  public static void main(String[] args){
    Deck deck = new Deck();
    Card c = deck.draw();
    System.out.println(c.getValue() + " - " + c.getSuit());
  }
}
