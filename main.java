import java.util.*;

//NAME : Sharvari Godbole
//PRN : 23070126117
//BATCH : AIML B2

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        boolean exit = false;

        System.out.println("______Creating Deck______");
        deck.createDeck();
        System.out.println("_______Deck Created______");

        while (!exit) {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Print Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Deal 5 Cards");
            System.out.println("4. Find a Card");
            System.out.println("5. Compare Two Cards");
            System.out.println("6. Check Same Suit (Same Card)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;

                case 2:
                    deck.shuffleDeck();
                    break;

                case 3:
                    deck.dealCard();
                    break;

                case 4:
                    System.out.print("Enter card rank (e.g., Ace, King, 2, 3, etc.): ");
                    String rank = scanner.nextLine();
                    System.out.print("Enter card suit (Clubs, Diamonds, Hearts, Spades): ");
                    String suit = scanner.nextLine();
                    deck.findCard(rank, suit);
                    break;

                case 5:
                    System.out.print("Enter first card rank: ");
                    String rank1 = scanner.nextLine();
                    System.out.print("Enter first card suit: ");
                    String suit1 = scanner.nextLine();
                    System.out.print("Enter second card rank: ");
                    String rank2 = scanner.nextLine();
                    System.out.print("Enter second card suit: ");
                    String suit2 = scanner.nextLine();

                    Card card1 = new Card(rank1, suit1);
                    Card card2 = new Card(rank2, suit2);

                    if (deck.compareCard(card1, card2)) {
                        System.out.println("Both cards have the same rank.");
                    } else {
                        System.out.println("Cards have different ranks.");
                    }
                    break;

                case 6:
                    System.out.print("Enter first card rank: ");
                    String r1 = scanner.nextLine();
                    System.out.print("Enter first card suit: ");
                    String s1 = scanner.nextLine();
                    System.out.print("Enter second card rank: ");
                    String r2 = scanner.nextLine();
                    System.out.print("Enter second card suit: ");
                    String s2 = scanner.nextLine();

                    Card c1 = new Card(r1, s1);
                    Card c2 = new Card(r2, s2);

                    if (deck.sameCard(c1, c2)) {
                        System.out.println("Both cards belong to the same suit.");
                    } else {
                        System.out.println("Cards belong to different suits.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
