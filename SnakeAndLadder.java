

public class SnakeAndLadder {
	public static final int source = 0;
	public static final int destination = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position1=0,diceRoll1=0,position2=0,diceRoll2=0;
		while(position1 < destination && position2<destination)
		{
			diceRoll1++;
				int randomCheck = (int) Math.floor(Math.random() * 10) % 6+1;
				int randomPlay = (int) (Math.random() * 10) % 3;
				switch(randomPlay) {
				case 0:
					System.out.println("No play");
					position1+=0;
					break;
				case 1:
					System.out.println("Well done");
					position1 += randomCheck;
					break;
				case 2:
					System.out.println("Snake");
					position1 -= randomCheck;
					break;
				}
	            if (position1 == 100) {
	                break;
	            } else if (position1 > 100) {
	                position1 -= randomCheck;
	                System.out.println("Not valid Dice Face. You are staying on same position.");
	            } else if (position1 < 0) {
	                position1 = source; // Starting from zero again.
	                System.out.println("You came back to start.");
	            } else {
	                System.out.println("New Position player1: " + position1);
	            }
		  
				diceRoll2++;
				int randomCheck1 = (int) Math.floor(Math.random() * 10) % 6+1;
				int randomPlay1 = (int) (Math.random() * 10) % 3;
				switch(randomPlay1) {
				case 0:
					System.out.println("No play");
					position2+=0;
					break;
				case 1:
					System.out.println("Well done");
					position2 += randomCheck1;
					break;
				case 2:
					System.out.println("Snake");
					position2 -= randomCheck1;
					break;
				}
	            if (position2 == 100) {
	                break;
	            } else if (position2 > 100) {
	                position2 -= randomCheck1;
	                System.out.println("Not valid Dice Face. You are staying on same position.");
	            } else if (position2< 0) {
	                position2 = source; // Starting from zero again.
	                System.out.println("You came back to start.");
	            } else {
	                System.out.println("New Position player2: " + position2);
	            }
		  }
		System.out.println("Player1's position is : "+position1);
		System.out.println("Number of times Dicerolls to win is: "+diceRoll1);
		System.out.println("Player2's position is : "+position2);
		System.out.println("Number of times Dicerolls to win is: "+diceRoll2);
		if (position1==100) {
			System.out.println("Congratulations!! Player1 Won");
		}else {
			System.out.println("Congratulations!! Player2 Won");
		}
		}
	}



