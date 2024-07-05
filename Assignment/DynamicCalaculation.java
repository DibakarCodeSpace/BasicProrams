package Assignment;

import java.util.Scanner;

public class DynamicCalaculation {
  static int a,b,c;
  
  static void Addition() {
	  c=a+b;
	  System.out.println("Addition Of A snd B Is"+c);
  }
	 
  static void Substraction() {
	  c=a-b;
	  System.out.println("Substraction of a and b Is"+c);
  }
  
  static void Multiplication() {
	  c=a*b;
	  System.out.println("Multiplication of a and b is"+c);
  }
  
  static void Division() {
	  c=a/b;
	  System.out.println("Division Of A and b is"+c);
  }
	
  static void Modulus() {
	  c=a%b;
	  System.out.println("Modulus of and b is: "+c);
  }
	
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Value Of A And B");
		a=Sc.nextInt();
		b=Sc.nextInt();
		Addition();
		Substraction();
		Multiplication();
		Division();
		
	}

}
