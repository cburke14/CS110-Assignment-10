// Connor Burke
// CS110
// Deck class

public class Deck
{
   /**
   * Total number of cards in deck
   */
   public final static int CARDS_IN_DECK = 52;

   /**
   * Array of cards 
   */
   private Card [] deck;
   
   /**
   * Card count
   */
   private int count;
   
    /**
    * Create a basic deck (52 cards)
    */
   public Deck()
   {
      newDeck();
   }
   /**
    * Create a new collection of 52 cards, in sorted order
    */
   public void newDeck()
   {
      deck = new Card[CARDS_IN_DECK];
      for (int i = Card.ACE; i <= Card.KING; i++)
      {
         for (int s = Card.SPADES; s<=Card.CLUBS; s++)
         {
            deck[count]=new Card(i,s);
            count = count + 1;
         }
      }
     
   }
   /** 
     * Dealing a card
     */
   public Card dealCard()
   {
      count--;
      return deck[count];
   }
   /** 
     * Return count
     */
   public int cardsLeft()
   {  
      return count;
   }
   /** 
     * Shuffle cards
     */
   public void shuffle()
   {
      int num;
      Card temp;
      Random rand = new Random();
      for (int i = 0; i < count; i++)
      {
         num = rand.nextInt(count);
         temp = deck[i];
         deck[i]=deck[num];
         deck[num]=temp;
      }
   }
   /** 
     * Determine if deck is empty
     */
   public boolean isEmpty()
   {
      return (cardsLeft() == 0);
   }
}
