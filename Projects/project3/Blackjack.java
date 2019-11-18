package blackjack;
import java.util.ArrayList;
import java.util.Scanner;
public class Blackjack {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		CardDeck deck = new CardDeck(); 
		deck.shuffle();
		
		Card playerCard1 = deck.nextCard();
		Card playerCard2 = deck.nextCard();
		Card dealerCard1 = deck.nextCard();
		Card dealerCard2 = deck.nextCard();
		
		ArrayList<Card> hand = new ArrayList<Card>(10);
		ArrayList<Card> DealerHand = new ArrayList<Card>(4);
		
		hand.add(playerCard1);
		hand.add(playerCard2);
		
		DealerHand.add(dealerCard1);
		DealerHand.add(dealerCard2);
		
		String card1 = playerCard1.toString();
		String card2 = playerCard2.toString();
		String card3 = dealerCard1.toString();
		String card5 = dealerCard2.toString();
		
		System.out.println("Your First card is: "+card1);
		System.out.println("Your Second card is: "+card2);
		System.out.println("The dealers Card is: "+card3);
		
	
		while (countHand(hand) < 21){ //while loop checking to see if your hand exceeds 21
		System.out.println("Your total hand value is: "+countHand(hand));
	
		System.out.println("If you would like to hit please type: \"hit\"");
		System.out.println("If you would like to stay please type: \"stay\"");
		String cmd = scan.nextLine();
		String hit = "hit";
		String stay = "stay";
		
		if(cmd.equals(hit)){					//if player says stay it adds a card to their hand, and counts the hand to see if the player busts
			Card playerCard3 = deck.nextCard();
			String card4 = playerCard3.toString();
			hand.add(playerCard3);
			System.out.println("Your card is: "+card4);
			if(countHand(hand) > 21){						//check to see if your hand is above 21
				System.out.println("Your hand total exceeds 21 you bust");
				break;
			}
			}
		else if(cmd.equals(stay)){
			while(countHand(DealerHand) < 17 && countHand(DealerHand) <21){	//if player checks it plays out the dealers hand, it hits if under 17 adn checks if dealer busts
				DealerHand.add(deck.nextCard());
				if(countHand(DealerHand) > 21){
					System.out.println("The Dealer busts, you win!");
					break;
				}
			}
			if(countHand(DealerHand) > countHand(hand)){					//checks to see who has the better hand the dealer or player
				for(int x = 0; x<DealerHand.size();x++){
					System.out.println("Dealers Card number "+(x+1)+" is: "+DealerHand.get(x).toString());
					
				}
				System.out.println("The Dealers card total is: "+countHand(DealerHand));
				if(countHand(DealerHand) < 21){								//checks if the dealer busted or not
				System.out.println("The Dealer has the better hand you lose!");
				break;
				}
				else{
					System.out.println("The Dealer busts, you win!");
					break;
				}
				
			}else if(countHand(DealerHand) < countHand(hand)){			//checks to see who has the better non busted hand
				System.out.println("The Dealer has the worse hand you win!");
				break;
			}else{
				System.out.println("Both hands are equal the game is a tie");
				break;
			}
		}
		}
		}
			
		
	public static int countHand(ArrayList<Card> hand){
		int amt = 0;
		
		for(int i = 0; i<hand.size();i++){    // loop to sum the values of the hand
			amt = amt + hand.get(i).getRank().getValue();
													
			if (amt > 21 ){
				for (int x = 0; x<hand.size();x++){
					if (hand.get(x).getRank().getValue() == 11){ // determining if the hand is greater than 21 but also has an ace then reduce the total of the hand by 10 effectively making the ace a 1
						amt = amt -10;
						}
					}
				
				}
			}return amt; 
			
			
			}
		}
	


