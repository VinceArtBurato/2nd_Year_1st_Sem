// Name: Burato, Vince Art  		Section Code: T207
package game_of_war;

public class Card implements Comparable <Card> {
    
    public static String ranks = "23456789TJQKA";
    public static String suits = "cdhs";
        
    private char rank;
    private char suit;
    
    public Card(char rank, char suit) {
    	
        if ((ranks.indexOf(rank) == -1) || (suits.indexOf(suit) == -1))
            throw new RuntimeException("can't construct card with specified rank and/or suit");
        
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public int compareTo(Card other) {

        return(Card.ranks.indexOf(this.rank) - Card.ranks.indexOf(other.rank));
    }
    
    public String toString() {
        return "" + this.rank + this.suit;
    }
}

