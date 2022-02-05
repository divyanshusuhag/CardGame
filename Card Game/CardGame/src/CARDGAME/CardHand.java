/**
 * @author Divyanshu
 * @Studentid 991631895
 */
package CARDGAME;

import java.util.Random;

import CARDGAME.Card.Suit;
import CARDGAME.Card.Value;

public class CardHand {
    public static Card[] generateHand(int numCards,
            Value[] cardValues, Suit[] cardSuits) {
        // We'll use Random to generate random numbers
        Random random = new Random();
        
        Card[] hand = new Card[numCards];

        for (int i = 0; i < hand.length; i++) {
            Card.Value value = cardValues[random.nextInt(cardValues.length)];
            Card.Suit suit = cardSuits[random.nextInt(cardSuits.length)];

            Card card = new Card(value, suit);
            hand[i] = card;
        }
        return hand;
    }
}
