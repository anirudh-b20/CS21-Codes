import java.util.Scanner;

public class boardwalk{
	public static void main(String[]args){
	
		double tax = 1.07;
		
		System.out.println("Welcome to The Boardwalk Diner!\n");
		System.out.println("~~Food~~\t\t\t~~Drink~~");
		System.out.println("French Fries - $5.00\t\tSoda - $2.25");
		System.out.println("Ice Cream - $3.75\t\tLemonade - $3.50\n");
		
		System.out.print("Would you like a drink (y or n)? ");
		Scanner reader = new Scanner(System.in);
		String choice1 = reader.nextLine();
		
		if(choice1.equals("y")){
			System.out.print("Whould you like (s)oda or (l)emonade? ");
			String choice2 = reader.nextLine();
			
			if(choice2.equals("s")){
			System.out.print("Would you like food (y or n)? ");
			String choice3 = reader.nextLine();
				if(choice3.equals("n")){
					System.out.println("Your order is one soda.\nThe price is $"+(2.25*tax));
				}
				else{
					System.out.print("Would you like (f)ries or (i)ce cream? ");
					String choice4 = reader.nextLine();
						if(choice4.equals("f")){
							System.out.println("Your order is one soda and one french fry.\nThe price is $"+((2.25+5.00)*tax));
						}
						else{
							System.out.println("Your order is one soda and one ice cream.\nThe price is $"+((2.25+3.75)*tax));
						}
					
				}
			}
			else{
			System.out.print("Would you like food (y or n)? ");
			String choice3 = reader.nextLine();
				if(choice3.equals("n")){
					System.out.println("Your order is one lemonade.\nThe price is $"+(3.50*tax));
				}
				else{
					System.out.print("Would you like (f)ries or (i)ce cream? ");
					String choice4 = reader.nextLine();
						if(choice4.equals("f")){
							System.out.println("Your order is one lemonade and one french fry.\nThe price is $"+((3.50+5.00)*tax));
						}
						else{
							System.out.println("Your order is one lemonade and one ice cream.\nThe price is $"+((3.50+3.75)*tax));
						}
					
				}
			}
		}
		else{
			System.out.print("Would you like (f)ries or (i)ce cream? ");
			String choice2 = reader.nextLine();
			
			if(choice2.equals("f")){
			System.out.print("Would you like a drink (y or n)? ");
			String choice3 = reader.nextLine();
				if(choice3.equals("n")){
					System.out.println("Your order is one french fry.\nThe price is $"+(5.00*tax));
				}
				else{
					System.out.print("Would you like (s)oda or (l)lemonade? ");
					String choice4 = reader.nextLine();
						if(choice4.equals("s")){
							System.out.println("Your order is one french fry and one soda.\nThe price is $"+((5.00+2.25)*tax));
						}
						else{
							System.out.println("Your order is one french fry and one lemonade.\nThe price is $"+((5.00+3.50)*tax));
						}
					
				}
			}
			else{
			System.out.print("Would you like a drink (y or n)? ");
			String choice3 = reader.nextLine();
				if(choice3.equals("n")){
					System.out.println("Your order is one ice cream.\nThe price is $"+(3.75*tax));
				}
				else{
					System.out.print("Would you like (s)oda or (l)lemonade? ");
					String choice4 = reader.nextLine();
						if(choice4.equals("s")){
							System.out.println("Your order is one ice cream and one soda.\nThe price is $"+((3.75+2.25)*tax));
						}
						else{
							System.out.println("Your order is one ice cream and one lemonade.\nThe price is $"+((3.75+3.50)*tax));
						}
					
				}
			}
		}
	}
}