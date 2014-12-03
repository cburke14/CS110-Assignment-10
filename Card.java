// Connor Burke
// CS110
// Card class

public class Card extends Comparable
{
   /**
   * Array for suits
   */
   private static String[] suits = {"clubs", "diamonds", "hearts", "spades"};
   /**
   * Suit constants
   */
   public static final int CLUBS = 0;
   public static final int DIAMONDS = 1;
   public static final int HEARTS = 2;
   public static final int SPADES = 3;
   /**
   * Array for ranks
   */
   private static String[] ranks = {null, null, "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack",
   "queen", "king", "ace"};
   /**
   * Face card constants
   */
   public static final int JACK = 11;
   public static final int QUEEN = 12;
   public static final int KING = 13;
   public static final int ACE = 14;
   
   /**
   * Rank variable
   */
   private int rank;
   /**
   * Suit variable
   */
   private int suit;
   
   /**
   * Card constructor - takes rank and suit for arguments
   */
   public Card(int rank, int suit)
   {
      if (rank < 2 || rank > ACE)
          throw new IllegalArgumentException("invalid rank: " + rank);
      if (suit < 0 || suit > 3)
          throw new IllegalArgumentException("invalid suit: " + suit);
      this.rank = rank;
      this.suit = suit;  
   }  
   
   /**
   * Returns the card suit
   */
   public int getSuit()
   {
      return this.suit;
   } 
   
   /**
   * Returns the card rank
   */
   public int getRank()
   {
      return this.rank;
   }
   
   /**
   * Converts card rank and suit to string format
   */ 
   public String toString()
   {
      return ranks[rank] + " of " + suits[suit];
   }
   
   /**
   * Compares two cards to see if they are equal in rank
   */ 
   public boolean equals(Card x)
   {
      if(this.rank == x.rank)
         return true;
      else
         return false;
   }  
}