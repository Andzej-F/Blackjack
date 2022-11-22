package _Chapter_8_More_OOP;

public enum Rank {
  ACE(1),// 0
  TWO(2),// 1
  THREE(3),// 2
  FOUR(4), // 3
  FIVE(5), // 4
  SIX(6),// 5
  SEVEN(7), // 6
  EIGHT(8),// 7
  NINE(9),// 8
  TEN(10),// 9
  JACK(10),// 10
  QUEEN(10),// 11
  KING(10); //12

  private int value;
  private String favoriteSong;

  Rank(int value) {
    this.value = value;
  }

  //  Rank KING = new Rank("KING");
//  Rank KING = new Rank("QUEEN");
//  Rank JACK = new Rank("JACK");
//  assertEquals(10, Rank.KING.getValue())
  public int getValue() {
//    return switch (this) {
//      case JACK, QUEEN, KING -> 10;
//      default -> this.ordinal() + 1;
//    };
    return value;
  }
}
