// Name: Burato, Vince Art  		Section Code: T207
package game_of_war;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    
    static Pile pile1;
    static Pile pile2;
    static int numTurns;
    
    
    public static void printPiles() {

    
       System.out.println("Turn: " + numTurns + System.lineSeparator());
       System.out.println("player1:");
       System.out.println(pile1 + System.lineSeparator());
       System.out.println("player2:");
       System.out.println(pile2);
       System.out.println("--------------------------------------");
    }
    
    public static void printWar() {
    
        System.out.println("                                        *** WAR! ***" + System.lineSeparator());
    }
    
    public static void main(String[] args) {
    	
      System.out.println("                        The Game Of War\n");
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter Player 1's cards (from top to bottom):");
      pile1 = new Pile(scanner.nextLine());
      System.out.println("\nEnter Player 2's cards (from top to bottom):");
      pile2 = new Pile(scanner.nextLine());

      numTurns = 2;
        
      while(!pile1.isEmpty() && !pile2.isEmpty() && numTurns!=5000){    
          Iterator<Card> card1 = pile1.iterator();
          Iterator<Card> card2 = pile2.iterator();
           Pile table_card = new Pile("");
          printPiles();
          boolean war = true;
          while(card1.hasNext() && card2.hasNext() && war == true){ 
            Card player1 = card1.next();
            Card player2 = card2.next();
           
            if(player1.compareTo(player2)==0){
              printWar();
              Iterator<Card> card11 = pile1.iterator();
              Iterator<Card> card22 = pile2.iterator();
              int i = 0;
              while(card11.hasNext() && card22.hasNext() && i!=4){
                table_card.enqueue(card11.next());
                table_card.enqueue(card22.next());
                i++;
              }
              pile1.dequeue();
              pile1.dequeue();
              pile1.dequeue();
              pile1.dequeue();
              card1 = pile1.iterator();
              pile2.dequeue();
              pile2.dequeue();
              pile2.dequeue();
              pile2.dequeue();
              card2 = pile2.iterator();
 
            }else if(player1.compareTo(player2)>0){
              for(Card card: table_card){
                pile1.enqueue(card);
              }
              pile1.enqueue(player1);
              pile1.enqueue(player2);
              pile1.dequeue();
              pile2.dequeue();
              break;
            }else if(player1.compareTo(player2)<0){
             for(Card card: table_card){
              pile2.enqueue(card);
              }
              pile2.enqueue(player1);
              pile2.enqueue(player2);
              pile1.dequeue();
              pile2.dequeue();
              break;
            }
            
           
            }
            numTurns++;
            if(pile1.isEmpty()){
              System.out.println("player 2 wins!");
              break;
           }
             if(pile2.isEmpty()){
              System.out.println("player 1 wins!");
              break;
            }
            if(numTurns==5000){
            System.out.println("Draw!");
              break;
            }
          }
         
      
    }
}
