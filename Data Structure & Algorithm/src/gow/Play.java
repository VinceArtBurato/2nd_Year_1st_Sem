// Name: Burato, Vince Art  		Section Code: T207
package gow;

import java.util.ArrayList;

public class Play {
	
	ArrayList<String> warCards = new ArrayList<String>();

	String errorLine = "**********************************************";
	boolean war = false;
	int rank1 = 0;
	int rank2 = 0;
	
	
	public void printCards(ArrayList<String>list,int player) {
		
		System.out.println("\nPlayer "+player+":");
		if(list.size()<3) {
			list.clear();
		}
		for(int i=0;i<list.size();i++) {
			if(i==10||i==20||i==30||i==40) {
				System.out.println();
			}
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	
	public void checkingCards(ArrayList<String>list1, ArrayList<String>list2) {
		
		for(int i=0;i<26;i++) {
			
			if(list1.get(i).length()>2) {
				System.out.println("\n"+errorLine);
				System.out.println("You entered "+list1.get(i)+" , it is invalid");
				System.out.println("The game is terminated, Try again");
				System.out.println(errorLine);
				System.exit(0);
			}
			
			if(list2.get(i).length()>2) {
				System.out.println("\n"+errorLine);
				System.out.println("You entered "+list2.get(i)+" , it is invalid");
				System.out.println("The game is terminated, Try again");
				System.out.println(errorLine);
				System.exit(0);
			}
		}
		
	}

	public void compareCards(ArrayList<String>list1, ArrayList<String>list2) {
		
		checkingCards(list1,list2);
		
		for(int i=0;i<100;i++) {
			
			if(list1.size()<3) {
				System.out.println("\nPlayer 2 wins!");
				printCards(list1,1);
				printCards(list2,2);
				System.exit(0);
			}
			
			if(list2.size()<3) {
				System.out.println("\nPlayer 1 wins!");
				printCards(list1,1);
				printCards(list2,2);
				System.exit(0);
			}
			
			System.out.println("\nTurn: "+(i+1));
			printCards(list1,1);
			printCards(list2,2);
			war = false;
			
			switch(list1.get(0).trim().charAt(0)) {
			case '2':
				rank1+=1;
				break;
			case '3':
				rank1+=2;
				break;
			case '4':
				rank1+=3;
				break;
			case '5':
				rank1+=4;
				break;
			case '6':
				rank1+=5;
				break;
			case '7':
				rank1+=6;
				break;
			case '8':
				rank1+=7;
				break;
			case '9':
				rank1+=8;
				break;
			case 'T':
				rank1+=9;
				break;
			case 'J':
				rank1+=10;
				break;
			case 'Q':
				rank1+=11;
				break;
			case 'K':
				rank1+=12;
				break;
			case 'A':
				rank1+=13;
				break;
			default:
				System.out.println("\n"+errorLine);
				System.out.println("You entered "+list1.get(0)+" , it is invalid");
				System.out.println("The game is terminated, Try again");
				System.out.println(errorLine);
				System.exit(0);
				break;
			}
			switch(list2.get(0).trim().charAt(0)) {
			case '2':
				rank2+=1;
				break;
			case '3':
				rank2+=2;
				break;
			case '4':
				rank2+=3;
				break;
			case '5':
				rank2+=4;
				break;
			case '6':
				rank2+=5;
				break;
			case '7':
				rank2+=6;
				break;
			case '8':
				rank2+=7;
				break;
			case '9':
				rank2+=8;
				break;
			case 'T':
				rank2+=9;
				break;
			case 'J':
				rank2+=10;
				break;
			case 'Q':
				rank2+=11;
				break;
			case 'K':
				rank2+=12;
				break;
			case 'A':
				rank2+=13;
				break;
			default:
				System.out.println("\n"+errorLine);
				System.out.println("You entered "+list2.get(0)+" , it is invalid");
				System.out.println("The game is terminated, Try again");
				System.out.println(errorLine);
				System.exit(0);
				break;
			}
			
			if(rank1>rank2) {
				list1.add(list1.get(0));
				list1.remove(0);
				list1.add(list2.get(0));
				list2.remove(0);
				if(warCards.size()>0) {
					for(int j=0;j<warCards.size();j++) {
						list1.add(warCards.get(j));
					}
					warCards.clear();
				}
			} 
			
			else if(rank1<rank2) {
				list2.add(list2.get(0));
				list2.remove(0);
				list2.add(list1.get(0));
				list1.remove(0);
				
				if(warCards.size()>0) {
					
					for(int j=0;j<warCards.size();j++) {
						list2.add(warCards.get(j));
					}
					warCards.clear();
				}
			}
			
			if(rank1==rank2) {
				war=true;
				 
				for(int index=0;index<4;index++) {
					warCards.add(list1.get(index));
					warCards.add(list2.get(index));
				}
				
				for(int index1=0;index1<4;index1++) {
					list1.remove(0);
					list2.remove(0);
				}
			}
			System.out.println("-----------------------------------------");
			if(war==true) {
				System.out.print("                       *** WAR! ***");
			}
			rank1 *= 0;
			rank2 *= 0;
		}
	}
	

}


