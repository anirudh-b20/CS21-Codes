//Anirudh Brahmarouthu - 3A - 4/20/20
import java.util.Scanner;

public class ParallelArraysDay2{
	public static void main(String[]args){
		Scanner reader = new Scanner(System.in);
		String[] show = {"Game of Thrones", "Breaking Bad", "The Walking Dead", "Supernatural", "FRIENDS", "Doctor Who", "Black Mirror", "The Simpsons", "The Big Bang Theory", "How I Met Your Mother"};
		int[] seasons = {8, 5, 10, 15, 10, 12, 5, 31, 12, 9};
		int[] episodes = {73, 62, 144, 319, 236, 156, 22, 676, 281, 208};
		int[] wins = {313, 138, 69, 22, 71, 113, 23, 173, 67, 25};
		int[] nominations = {505, 217, 195, 85, 211, 195, 75, 309, 236, 90};
		double[] rating = {8.8, 9.0, 8.1, 8.5, 8.5, 7.7, 7.9, 7.2, 7.9, 8.2};
		int[] start = {2011, 2008, 2010, 2005, 1994, 2005, 2011, 1989, 2007, 2005};
		int[] end = {2019, 2013, 2020, 2020, 2004, 2020, 2020, 2020, 2019, 2014};
		int x=12;
		int num=123;

		System.out.println("The following shows have been stored in the array: ");
		System.out.print("[");
		for(int i=0; i<show.length; i++){
			if(i!=9)
				System.out.print(show[i]+", ");
			else
				System.out.println(show[i]+"]\n");
		}
		
		System.out.println("The following stats are available for selection: ");
		System.out.println("[Seasons, Episodes, Wins, Nominations, Rating, Start Year, End Year]\nType \"quit\" to end the program.\n");
		
		do{
			System.out.print("Which show's stats would you like to research? ");
			String showstat = reader.nextLine();
			
			if(showstat.equals("quit"))
				x=4;
			
			if(x!=4){
				System.out.print("Which stat would you like? ");
				String stat = reader.nextLine();
				
				for(int i=0; i<show.length; i++){
					if(showstat.equals(show[i]))
						num=i;
				}
				if(stat.equals("Seasons"))
					System.out.println("\n"+show[num]+" has aired "+seasons[num]+" seasons.\n");
				if(stat.equals("Episodes"))
					System.out.println("\n"+show[num]+" has aired "+episodes[num]+" episodes.\n");
				if(stat.equals("Wins"))
					System.out.println("\n"+show[num]+" has won "+wins[num]+" awards.\n");
				if(stat.equals("Nominations"))
					System.out.println("\n"+show[num]+" has been nominated for "+nominations[num]+" awards.\n");
				if(stat.equals("Rating"))
					System.out.println("\n"+show[num]+" has an average rating of "+rating[num]+".\n");
				if(stat.equals("Start Year"))
					System.out.println("\n"+show[num]+" started airing in "+start[num]+".\n");
				if(stat.equals("End Year"))
					System.out.println("\n"+show[num]+" ended airing in "+end[num]+".\n");
			}
			
		
		}while(x!=4);
		
		

		
	}
}