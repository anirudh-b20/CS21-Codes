import java.util.Scanner;

public class NumberGuesserWhileLoop{
	public static void main(String[]args){
		//Program 2A
		int ran=(int)(Math.random()*10)+1;
		int run=5;
		int points = 5;
		System.out.println("~~Welcome to the Random Guesser Game!~~");
		Scanner reader=new Scanner(System.in);
		do{
			System.out.print("Enter your guess: ");
			int guess = reader.nextInt();
			if(guess==ran){
				run=1;
			}
			if(guess!=ran){
				points--;
				System.out.println("Sorry, try again!");
			}
			run--;
		}while(run!=0);
		if(points==0)
			System.out.println("You lose. You have run out of tries. The number was "+ran);
		else
			System.out.println("Correct! The number was "+ran+" Your score is "+points);
		System.out.println();
		System.out.println();
		//Program 2B
		int ran1=(int)(Math.random()*100)+1;
		int run1=5;
		int points1 = 5;
		System.out.println("~~Welcome to the Random Guesser Game 2!~~");
		do{
			System.out.print("Enter your guess: ");
			int guess1 = reader.nextInt();
			if(guess1==ran1){
				run1=1;
			}
			if(guess1!=ran1){
				points1--;
				if(guess1>ran1)
					System.out.println("Sorry, you're too high!");
				else
					System.out.println("Sorry, you're too low!");
			}
			run1--;
		}while(run1!=0);
		if(points1==0)
			System.out.println("You lose. You have run out of tries. The number was "+ran1);
		else
			System.out.println("Correct! The number was "+ran1+" Your score is "+points1);
	}
}