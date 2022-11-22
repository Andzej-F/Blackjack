package _Chapter_8_More_OOP;

import static _Chapter_8_More_OOP.Rank.JACK;

public class Card {
  private Suit suit;
  private Rank rank;

  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit() {
    return suit;
  }

  public void setSuit(Suit suit) {
    this.suit = suit;
  }

  public Rank getRank() {
    return rank;
  }

  public void setRank(Rank rank) {
    this.rank = rank;
  }

  public static void main(String[] args) {
    Card card1 = new Card(Suit.CLUBS, JACK);
    Card card2 = new Card(Suit.DIAMONDS, Rank.TEN);
//    int tolal = card1.plus(card2);
//    Hand myHand=new Hand()
//    myHand.add(card1);
//    myHand.add(card2);
//    int tolal = myhand.getTotal();

    System.out.println(card1);
    System.out.println(card2);
  }

  public int getValue() {
    return this.rank.getValue();
  }

  @Override
  public String toString() {
//    JACK {Club symbol}
    return this.rank.toString().concat(" ").concat(this.suit.toString());
  }
}
