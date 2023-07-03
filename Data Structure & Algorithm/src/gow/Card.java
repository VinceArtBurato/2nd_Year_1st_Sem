// Name: Burato, Vince Art  		Section Code: T207
package gow;

import java.util.*;

public class Card extends Play{	
	
	ArrayList<String> player1Cards1 = new ArrayList<String>();
	ArrayList<String> player2Cards2 = new ArrayList<String>();
	
	String pile1, pile2;
	String[] player1Cards, player2Cards;
	
	Scanner scan = new Scanner(System.in).useDelimiter("\\n");
	String line = "-------------------------------------------";
	
	public void playerInputs() {
		System.out.println("Enter Player 1's cards (from top to bottom): ");
		pile1 = scan.next();
		int totalPile1 = pile1.length();
		
		if(pile1.length()!=78) {
			
			System.out.println(line);
			System.out.println("Each player should have 26 cards! Please input cards again");
			System.out.println(line);
			playerInputs();
		}
		
		if(totalPile1==78) {
		player1Cards = pile1.trim().split(" ");
		
		for(int i=0;i<26;i++) {
			player1Cards1.add(player1Cards[i].trim());
			}
		}
		
		System.out.println("Enter Player 2's cards (from top to bottom): ");
		pile2 = scan.next();
		int totalPile2 = pile2.length();
		
		if(pile2.length()!=78) {
			
			System.out.println(line);
			System.out.println("Each player should have 26 cards! Please input cards again");
			System.out.println(line);
			playerInputs();
		}
		
		if(totalPile2==78) {
		player2Cards = pile2.trim().split(" ");
		
		for(int i=0;i<26;i++) {
			player2Cards2.add(player2Cards[i].trim());
			}
		}
		
		compareCards(player1Cards1, player2Cards2);
	}
	
	
}

