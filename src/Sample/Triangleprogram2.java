package Sample;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Triangleprogram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		import javax.swing.JOptionPane;

		Scanner sc=new Scanner(System.in);	
		int a,b,c;
		
		System.out.println("Enter the first side of triangle");
		a=sc.nextInt();
		
		System.out.println("Enter the second side of triangle");
		b=sc.nextInt();
		
		System.out.println("Enter the third side of triangle");
		c=sc.nextInt();
		
		if(a==b && b==c)
		{
			System.out.println("Equilateral Triangle");
		}
		
		else if(a==b || b==c ||c==a)
		{
			System.out.println("Isoceles Triangle");
		}
		
		else {
			System.out.println("Scalene Triangle");
		}
       	}
}

