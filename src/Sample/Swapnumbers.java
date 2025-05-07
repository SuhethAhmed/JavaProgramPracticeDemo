package Sample;

public class Swapnumbers {

	public static void main(String[] args) {
		
		int a,b,temp;
		
		a=20;
		 b=30;
		 
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
		
		//without taking any third variable or temporary variable
	
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
