import java.util.*;

	public class SnakeAndLadder 
	{	
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
			System.out.println(dice);


		}
	} 
