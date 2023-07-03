// Name: Burato, Vince Art  		Section Code: T207
package game_of_war;

import java.util.Scanner;

public class Pile extends QueueArray <Card> {
    
    public Pile(String cards) {

        Scanner scanner = new Scanner(cards);
        while (scanner.hasNext()) {
            String card = scanner.next();
            this.enqueue(new Card(card.charAt(0),card.charAt(1)));
        }
        scanner.close();
    }
    
    public String toString() {

        String s = "";
        int i = 0;
        for (Card card : this) {
            s += card + "  ";
            if (i % 10 == 9) 
                s += System.lineSeparator();
            i = (i+1) % 10;
        }
        return s;
    }
}