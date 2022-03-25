package week1.day2;
import java.util.Arrays;

public class FindLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,2,11,4,6,7};
		
		Arrays.sort(arr);
	for(int i=0; i<arr.length;i++)
	
		
	{
		
		System.out.println(arr[i]);
	}

		System.out.println("Second largest array element is " + arr[arr.length-2]);
	}
	
}

