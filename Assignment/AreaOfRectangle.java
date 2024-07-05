package Assignment;

import java.util.Scanner;

public class AreaOfRectangle {
	
	static void Rectangle() {
		float a,b,c;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle ");
		a=Sc.nextFloat();
		System.out.println("Enter the Width of Rectangle ");
		b=Sc.nextFloat();
		c=a*b;
		System.out.println("Area of Rectangle is: "+c);
	}

	public static void main(String[] args) {
		Rectangle();
	}

}
