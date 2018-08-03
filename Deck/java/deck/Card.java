package deck;

public class Card implements Comparable<Card> {
  private Value value;
  private Suit suit;

  public Card(Value value, Suit suit) {
    this.value = value;
    this.suit = suit;
  }

  @Override
  public int compareTo(Card c) {

    if(this.value.getValue() < c.value.getValue())
      return -1;

    if(this.value.getValue() > c.value.getValue())
      return 1;

    if(Deck.getSuitRankPosition(this.suit) < Deck.getSuitRankPosition(c.suit))
      return -1;

    return 1;
  }

  public Value getValue() {
    return this.value;
  }

  public Suit getSuit() {
    return this.suit;
  }
}
