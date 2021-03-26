public class SelectionSortDay1{
	public static void main(String[]args){
		int[] array = {7, -2, 8, 4, -2, 9, 15, 10};
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+"\t");
		int min;
		
		for(int i = 0; i<array.length-1; i++){
			min = i;
			for(int j=i+1;j<array.length; i++){
				if(array[j]<array[min])
					min = j;	
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		
	
	}
}