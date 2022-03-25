package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 58,sum=0;
		while(num>0)
		{
			int dig = num%10; //58%10 =8
			sum = sum+dig;    // 0+8=8
			num =num/10;      //58/10 =5
			
		}
		
		System.out.println("Sum of digits " +  sum);
		

	}

}
