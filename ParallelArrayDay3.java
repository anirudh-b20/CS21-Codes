//Anirudh Brahmarouthu - 3A - 4/22/20
import java.util.Scanner;

public class ParallelArrayDay3{
	public static void main(String[]args){
		Scanner reader = new Scanner(System.in);
		
		String[] name = {"Avengers: Endgame", "Avatar", "Titanic", "Star Wars: Episode VII - The Force Awakens", "Avengers: Infinity War"};
		int[] year = {2019, 2009, 1997, 2015, 2018};
		double[] rating = {8.4, 7.8, 7.8, 7.9, 8.5};
		double[] gross = {2.798, 2.790, 2.194, 2.068, 2.048};
		char[] rank = {'1', '2', '3', '4', '5'};
		
		System.out.println("These movies are the highest grossing films worldwide, ever:");
		System.out.println(name[0]+", "+name[1]+", "+name[2]+", "+name[3]+", "+name[4]);
		
		System.out.println("\nChoose which statistic you would like like to know about them: ");
		System.out.println("Gross Profits, Rank, Release Year, Rating\n");
		
		int x=12;
		int num=123;
		
		do{
			System.out.print("Which film would you like to learn about? ");
			String movchoice = reader.nextLine();
			
			if(movchoice.equalsIgnoreCase("quit"))
				x=4;
			
			if(x!=4){
				System.out.print("What would you like to learn about the movie? ");
				String statchoice = reader.nextLine();
				
				for(int i=0; i<name.length; i++){
					if(movchoice.equalsIgnoreCase(name[i]))
						num=i;
				}
	
				if(statchoice.equalsIgnoreCase("Gross Profits"))
					System.out.println("\n"+name[num]+" made $"+gross[num]+" billion USD worldwide.\n");
				if(statchoice.equalsIgnoreCase("Rank"))
					System.out.println("\n"+name[num]+" is the number "+rank[num]+" highest grossing film worldwide, ever.\n");
				if(statchoice.equalsIgnoreCase("Release Year"))
					System.out.println("\n"+name[num]+" was released in "+year[num]+".\n");
				if(statchoice.equalsIgnoreCase("Rating"))
					System.out.println("\n"+name[num]+" has an average rating of "+rating[num]+"/10.\n");		
			}
		}while(x!=4);
	}
}