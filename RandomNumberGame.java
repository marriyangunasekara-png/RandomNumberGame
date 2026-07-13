import java.util.Scanner;
public class RandomNumberGame{
	public static void main(String[]args){
		
		Scanner in=new Scanner(System.in);
		int random=(int)(Math.random()*101);
		
		
		System.out.println("enter any number between 0 and 100");
		
		int maxAttempts=10;
		
			for(int i=1; i<=maxAttempts; i++)
	    {
			int num=in.nextInt();
			
			if(num>=0 && num<=100)
			{
				if(random==num)
				{
					System.out.println("You won the game!");
					return;
				}else if(num>random)
				{
					System.out.println("Guess a lower number");
				}else if(num<random)
				{
					System.out.println("Guess a higher number");
				}
				
			}else
			{
				System.out.println("Invalid input");
		    }
			
			
		}
			System.out.println("Your attempts are over. The random number was: "+random);
			
			in.close();
	}
		
		
}
