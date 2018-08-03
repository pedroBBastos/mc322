package deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Deck {

  private List<Card> cardsList;
  private static Suit[] suitRank = {Suit.HEART, Suit.TILE, Suit.CLOVER, Suit.SPADE};

  public Deck() {
    initiateDeck();
  }

  private void initiateDeck() {
    this.cardsList = new ArrayList();
    for(Value v : Value.values())
      for(Suit s : Suit.values())
        this.cardsList.add(new Card(v, s));
    this.shuffleDeck();
  }

  public void shuffleDeck() {
    Collections.shuffle(this.cardsList);
  }

  public Card draw() {
    Card c = this.cardsList.get(this.cardsList.size()-1);
    this.cardsList.remove(c);
    return c;
  }

  public void resetDeck() {
    initiateDeck();
  }

  public void putCardOnDeck(Card c) {
    if(!this.cardsList.contains(c))
      this.cardsList.add(c);
    this.shuffleDeck();
  }

  public static void setSuitRank(Suit[] newSuitRank) {
    suitRank = newSuitRank;
  }

  public static int getSuitRankPosition(Suit suit) {
    for(int i=0; i<4; i++)
      if(suitRank[i] == suit)
        return i;
    return 0;
  }
}
