// Connor Burke
// CS110
// War class 

public class War
{
   /**
   * Constant for a tie
   */
   public static final int TIE = 3;
   /**
   * Constant for number of cards in deck
   */
   public static final int CARDS = 52;
   
   public static void main(String [] args)
   {
      Card [] deck = createDeck();
      Card [] userOne = new CARD[CARDS];
      Card [] userTwo = new Card[CARDS];'
      
      for (int i = 0; i < CARDS; i++)
      {
         if(i % 2 == 0)
         {
            userOne[i / 2] = shuffledDeck[i];
         }
         else
         {
            userTwo[i / 2] = shuffledDeck[i];
         }
      }
      while(hasCards(userOne) && hasCards(userTwo))
      {
         turn(userOne, userTwo);
      }
      
      if(hasCards(userOne)
         System.out.println("User one wins!");
      else
         System.out.println("User two wins!");
   }
}