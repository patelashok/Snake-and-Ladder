
import java.util.*;

	public class SnakeAndLadder 
	{	
		public static final int No_Play=1;
		public static final int Ladder=2;
		public static final int Snake=3;
		public static final int Win_position=100;
		public static final int Position_check = 0;
		public static void main(String[] args) 
		{
			System.out.println("Welcome to SnakeAndLadder Game");

			int Numdiceroll=0;
			int position=0;
			System.out.println("Player start position : "+position);
                        Random newrandom = new Random();

			while(position < Win_position){
			Random random = new Random();
			
			int dice = 0;
			
			while (true)
			{
	    		dice = random.nextInt(7);
	    		if(dice !=0) break;
			}
			System.out.println("NUmber of dice: "+dice);

			//options
			while(position < Win_position){
			
			Random op = new Random();
		        Numdiceroll++;
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
					if((position + dice) > Win_position)
						position=Win_position;
					 
					else
						position+=dice;
					
					System.out.println("Player moves ahead by : "+position);
					break;

				case Snake:
					position -= dice;
					if ((position - dice) < Position_check){
	                		position = Position_check;
			}
					System.out.println("Player moves behind by : "+position);
					break;

				default:
					System.out.println("Enter correct value");
		   break;
			}
		}
			System.out.println("Number of times dice was rolled to win game: "+Numdiceroll);
			}
	}
	}
