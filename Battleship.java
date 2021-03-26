//Anirudh Brahmarouthu - 3A - 3/27/20
import java.util.Scanner;

public class Battleship{
	public static void main(String[]args){
		Scanner reader = new Scanner(System.in);
		System.out.println("\t\t\tWELCOME TO");
		System.out.println(" ____       _______ _______ _      ______  _____ _    _ _____ _____  ");
		System.out.println("|  _ \\   /\\|__   __|__   __| |    |  ____|/ ____| |  | |_   _|  __ \\");
		System.out.println("| |_) | /  \\  | |     | |  | |    | |__  | (___ | |__| | | | | |__) |");
		System.out.println("|  _ < / /\\ \\ | |     | |  | |    |  __|  \\___ \\|  __  | | | |  ___/");
		System.out.println("| |_) / ____ \\| |     | |  | |____| |____ ____) | |  | |_| |_| |");
		System.out.println("|____/_/    \\_\\_|     |_|  |______|______|_____/|_|  |_|_____|_|");
		System.out.println("\n\t\t    __|__ |___| |\\");
		System.out.println("\t\t    |o__| |___| | \\");
		System.out.println("\t\t    |___| |___| |o \\");
		System.out.println("\t\t   _|___| |___| |__o\\");
		System.out.println("\t\t  /...\\_____|___|____\\_/\n\t\t  \\   o * o * * o o  /");
		System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		char[][] board = new char[7][7];
		for(int r=0; r<board.length; r++){
			for(int c=0; c<board[r].length; c++){
				board[r][c]='~';
				System.out.print(board[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		char ship=board[3][1];
		int count = 0;
		
		do{
			System.out.print("Enter a row: ");
			int row=reader.nextInt();
			System.out.print("Enter a column: ");
			int col=reader.nextInt();
			
			if((row>7)||(col>7)||(col<1)||(row<1)){
				System.out.println("Invalid Guess. Try Again");
				for(int r=0; r<board.length; r++){
					for(int c=0; c<board[r].length; c++){
						System.out.print(board[r][c]+" ");
					}
					System.out.println();
				}
				System.out.println();
			}
			else{ 
				if(board[row-1][col-1]=='x'){
					System.out.println("Spot Already Guessed. Try Again");
					for(int r=0; r<board.length; r++){
						for(int c=0; c<board[r].length; c++){
							System.out.print(board[r][c]+" ");
						}
						System.out.println();
					}
					System.out.println();
				}
				else{
					if(((row-1)==3)&&((col-1)==1)){
						board[row-1][col-1]='B';
						for(int r=0; r<board.length; r++){
							for(int c=0; c<board[r].length; c++){
								System.out.print(board[r][c]+" ");
								}
							System.out.println();
						}
						ship='B';
						System.out.println();
						System.out.println("   _____ ____  _   _  _____ _____         _______ _    _ _            _______ _____ ____  _   _  _____   _   _   _ ");
						System.out.println("  / ____/ __ \\| \\ | |/ ____|  __ \\     /\\|__   __| |  | | |        /\\|__   __|_   _/ __ \\| \\ | |/ ____| | | | | | |");
						System.out.println(" | |   | |  | |  \\| | |  __| |__) |   /  \\  | |  | |  | | |       /  \\  | |    | || |  | |  \\| | (___   | | | | | |");
						System.out.println(" | |   | |  | | . ` | | |_ |  _  /   / /\\ \\ | |  | |  | | |      / /\\ \\ | |    | || |  | | . ` |\\___ \\  | | | | | |");
						System.out.println(" | |___| |__| | |\\  | |__| | | \\ \\  / ____ \\| |  | |__| | |____ / ____ \\| |   _| || |__| | |\\  |____) | |_| |_| |_|");
						System.out.println("  \\_____\\____/|_| \\_|\\_____|_|  \\_\\/_/    \\_\\_|   \\____/|______/_/    \\_\\_|  |_____\\____/|_| \\_|_____/  (_) (_) (_)");
						System.out.println("\t\t\t __     ______  _    _     __          ______  _   _   _   _   _ ");
						System.out.println("\t\t\t \\ \\   / / __ \\| |  | |    \\ \\        / / __ \\| \\ | | | | | | | |");
						System.out.println("\t\t\t  \\ \\_/ / |  | | |  | |     \\ \\  /\\  / / |  | |  \\| | | | | | | |");
						System.out.println("\t\t\t   \\   /| |  | | |  | |      \\ \\/  \\/ /| |  | | . ` | | | | | | |");
						System.out.println("\t\t\t    | | | |__| | |__| |       \\  /\\  / | |__| | |\\  | |_| |_| |_|");
						System.out.println("\t\t\t    |_|  \\____/ \\____/         \\/  \\/   \\____/|_| \\_| (_) (_) (_)");
						
						
					}	
					else{
						board[row-1][col-1]='x';
						for(int r=0; r<board.length; r++){
							for(int c=0; c<board[r].length; c++){
								System.out.print(board[r][c]+" ");
							}
							System.out.println();
						}
						System.out.println();
						count++;
					}
				}	
			}
			if(count==7)
				ship='B';
		}while(ship=='~');
		if((count==7)&&(ship!='B'));
			System.out.println("Sorry. You Lost.");
		
		/*Dear Ms. Burdge, 
		I made each valid guess count towards the 7 guesses the user has.
		If the user inputs a coordinate that they already guessed, or is not on the board, it
		does not count as a guess.
		*/
		
		
		
		
		
		
		
		
		
	}
}