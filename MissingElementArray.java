package week1.day2;
import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,7,6,8,9};
		
		Arrays.sort(arr1);

		
		for (int i = arr1[0]; i < arr1.length; i++) {
			
			if( i != arr1[i-1])
			{
				System.out.println(i);
				break;
			}
			
			
			

	}

}

}