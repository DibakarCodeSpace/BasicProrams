package Assignment;

import java.util.Scanner;

public class Circumference {
	
	static void circumferenceOfCircle() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the radious of circle");
		float r=Sc.nextFloat();
		double a= 2*Math.PI*r;
		System.out.println("circumference Of Circle is: "+a);
	}

	public static void main(String[] args) {
		circumferenceOfCircle();
	}

}
