
import java.util.*;

	public class SnakeAndLadder 
	{	
		public static final int No_Play=1;
		public static final int Ladder=2;
		public static final int Snake=3;
		public static void main(String[] args) 
		{
			System.out.println("Welcome to SnakeAndLadder Game");

			int position=0;
			System.out.println("Player start position : "+position);
                        Random random = new Random();

			int dice = 0;
			while (true)
			{
	    		dice = random.nextInt(7);
	    		if(dice !=0) break;
			}
			System.out.println("NUmber of dice: "+dice);
			//options

			Random op = new Random();
		        int option = 0;
			while (true)
			{
	    		option = op.nextInt(4);
	    		if(option !=0) break;
			}
			System.out.println("*****OPTIONS*****\nOption 1 : No Play\nOption 2 : Ladder \nOption 3 : Snake \n");
			System.out.println("Options : "+option);

			switch (option) {
				case No_Play:
					System.out.println("Player stays in the same position : "+position);
					break;

				case Ladder:
					position += dice;
					System.out.println("Player moves ahead by : "+position);
					break;

				case Snake:
					position -= dice;
					System.out.println("Player moves behind by : "+position);
					break;				

				default: 
					System.out.println("Enter correct value");

			}
		}
	} 

		
	
