package mycarsdata;

public class methodoverload2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=45,b=65;
		
		int result = minfunction(a,b);
		double c=6.79;
		double  d=7.98;
		double result2 = minfunction(c,d);
		
		System.out.print("the min value is "+result);
		System.out.print("the min value is "+result2);
		

	}

	private static double minfunction(double n1, double n2) {
		// TODO Auto-generated method stub
		double min;
		if(n1>n2)
			min = n2;
		else
			min = n1;
		
		return min;
	}

	private static int minfunction(int n1, int n2) {
		// TODO Auto-generated method stub
		
		int min;
		
		if(n1>n2)
			min = n2;
		else
			min =n1;
		
		return min ;
	}

}
