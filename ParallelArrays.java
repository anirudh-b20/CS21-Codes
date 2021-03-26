import java.util.Scanner;

public class ParallelArrays{
	public static void main(String[]args){
		Scanner reader = new Scanner(System.in);
		//Program 1
		System.out.println("~~Program 1~~");
		int[] num = {23, 451, 1, 1111, 1313};
		String[] street = {"Chamberlain Ave", "Avenue Q", "K St", "Pitt Ave", "Elm St"};
		char[] apt = {'O', 'B', 'P', 'O', 'Z'};
		String[] zip = {"08852", "10101", "23456", "19146", "08628"};
		
		for(int i=0; i<num.length; i++){
			if(apt[i]=='O')
				System.out.println(num[i]+" "+street[i]+" "+zip[i]);
			else
				System.out.println(num[i]+" "+street[i]+" Apt "+apt[i]+" "+zip[i]);
		
		}
		System.out.println();
		
		//Program 2
		System.out.println("~~Program 2~~");
		String[] last = new String[6];
		char[] first = new char[6];
		String[] id = new String[6];
		int[] initgrade = new int[6];
		int[] finalgrade = new int[6];
		
		for(int i=0; i<6; i++){
			System.out.print("Last Name: ");
			last[i] = reader.nextLine();
			
			System.out.print("First Initial: ");
			first[i] = reader.next().charAt(0);
			reader.nextLine();
						
			System.out.print("Student ID: ");			
			id[i] = reader.nextLine();		
			
			System.out.print("Points Earned: ");
			initgrade[i] = reader.nextInt();
			reader.nextLine();
			
			System.out.print("Points Possible: ");
			finalgrade[i] = reader.nextInt();
			reader.nextLine();
			System.out.println();
		}
		for(int i=0; i<6; i++){
			System.out.println(last[i]+"  "+first[i]+"  "+id[i]+"  "+initgrade[1]+"  "+finalgrade[i]+"  "+((initgrade[1]/inalgrade[i])*100)+"%");
		}		
	}
}