package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator objCal = new Calculator();
		int ans1 = objCal.add(3, 5, 6);
		int ans2 =objCal.sub(20, 7);
		double ans3 = objCal.mul(225d , 15d);
		float ans4= objCal.divide(20.5f,2.5f);
		
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
		

	}

}
