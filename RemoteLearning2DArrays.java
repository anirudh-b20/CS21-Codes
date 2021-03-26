public class RemoteLearning2DArrays{
	public static void main(String[]args){
		//Program 1
		System.out.println("~~Program 1~~");
		int[][] table = new int[4][6];
		int sum=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int r=0; r<table.length; r++){
			for(int c=0; c<table[0].length; c++){
				table[r][c]=(int)(Math.random()*71)+7;
				System.out.print(table[r][c]+"\t");	
				sum+=table[r][c];
				
				if(table[r][c]>max)
					max=table[r][c];
				if(table[r][c]<min)
					min=table[r][c];
			}
			System.out.println();
		}
		System.out.println("Sum: "+sum+"\nMax: "+max+"\nMin: "+min);
		
		//Program 2
		System.out.println("\n\n~~Program 2~~");
		String[][] table2 = new String[3][3];
		int count=0;
		for(int r=0; r<table2.length; r++){
			String aster="*";
			for(int c=0; c<table2[0].length; c++){
				table2[r][c] = aster;
				System.out.print(table2[r][c]+"\t");
				aster+="*";
				count+=c+1;
			}
			System.out.println();
		}
		System.out.println("Number of Asterisks: "+count);
		
		//Program 3

		
		
		
		
		int[][] b={{13,15,17,19},
			   {23,25,27,29},
			   {33,35,37,39}};
		
		System.out.println(b[2][3]+" "+b[1][1]+" "+b[0][2]);
		System.out.println(b.length+" "+b[1].length);
				
		
		
		
	}
} 