import java.util.*;

public class Deck {
    private ArrayList<Card> deck;

    // Constructor
    public Deck() {
        this.deck = new ArrayList<>();
        createDeck();
    }

    // Create a standard deck of 52 cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Print all cards in the deck
    public void printDeck() {
        System.out.println("_______DECK________");
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Print a specific card
    public void printCard(Card card) {
        System.out.println("Selected Card: " + card);
    }

    // Check if two cards are of the same suit
    public boolean sameCard(Card c1, Card c2) {
        return c1.getSuit().equalsIgnoreCase(c2.getSuit());
    }

    // Check if two cards have the same rank
    public boolean compareCard(Card c1, Card c2) {
        return c1.getRank().equalsIgnoreCase(c2.getRank());
    }

    // Find a specific card in the deck
    public boolean findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println("Card found: " + card);
                return true;
            }
        }
        System.out.println("Card not found.");
        return false;
    }

    // Shuffle the deck
    public void shuffleDeck() {
        System.out.println("_________Shuffling Deck_________");
        Collections.shuffle(deck);
    }

    // Deal 5 random cards
    public void dealCard() {
        System.out.println("_________Dealing 5 random cards_________");

        if (deck.size() < 5) {
            System.out.println("Not enough cards left in the deck!");
            return;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }

        System.out.println("________Cards left in deck________");

        for (int i = 5; i < deck.size(); i++) {
            System.out.println(deck.get(i));
        }
    }
}


















