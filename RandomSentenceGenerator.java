public class RandomSentenceGenerator{
	public static void main(String[]args){
		String quote = ("IDENTITY THEFT IS NOT A JOKE JIM MILLIONS OF FAMILIES SUFFER EVERY YEAR");
		String[] count = quote.split(" ");
		
		System.out.print("Quote: ");
		for(int i=0; i<count.length; i++)
			System.out.print(count[i]+" ");
		System.out.println("\n\nWord Count: "+count.length+"\n\nUnsorted Array:");
		for(int i=0; i<count.length; i++){
			if(((i+1)%5)==0)
				System.out.print(count[i]+"\n");
			else{
				int wordlength = count[i].length();
				if(wordlength>=8)
					System.out.print(count[i]+"\t");
				else
					System.out.print(count[i]+"\t\t");
			}
		}
			
		int min = 0;	
		for(int i=0; i<count.length-1; i++){
			min = i;
			for(int j=i+1; j<count.length; j++){
				if((count[min].compareTo(count[j]))>0){
					min = j;					
				}
			}
			String temp = count[i];
			count[i] = count[min];
			count[min] = temp;
		}
		System.out.println();
		
		System.out.println("\n\nSorted Array: ");
		for(int i=0; i<count.length; i++){
			if(((i+1)%5)==0)
				System.out.print(count[i]+"\n");
			else{
				int wordlength = count[i].length();
				if(wordlength>=8)
					System.out.print(count[i]+"\t");
				else
					System.out.print(count[i]+"\t\t");
			}
		}
		System.out.println();

		int[] parallel = new int[13];	
		for(int j=1; j<6; j++){
			int x=0;
			for(int i=0; i<count.length; i++){
				parallel[i] = 0;
			}
			System.out.println("\n\nRandom Sentence "+j+":");
			do{
				int num = (int)(Math.random()*12);
				if(parallel[num]==0){
					System.out.print(count[num]+" ");
					parallel[num]=1;
					x++;
				}
			}while(x!=12);
		}	
		System.out.println("\n");
	}
}