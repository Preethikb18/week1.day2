package week1.day2;


public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
					// assign 0 to count
		System.out.println("Duplicate elements in given array");
		
		for (int i=0; i<arr.length; i++)
		{
			for ( int j = i+1; j<arr.length ; j++)
			{
				if( arr[i] == arr[j])
				{
				 
					System.out.println(arr[j]);
				}
			}
				
		}
			

	}

}
