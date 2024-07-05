package Assignment;
import java.util.Scanner;

public class SimpleInterest {
	double A;
	double p;
	float r;
	float t;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SimpleInterest si = new SimpleInterest();
		System.out.println("Enter The Principal amount");
		si.p= sc.nextDouble();
		System.out.println("Enter The Rate Of Interest");
		si.r=sc.nextFloat();
		System.out.println("Enter The duration");
		si.t=sc.nextFloat();
		
		si.A= (si.p*si.r*si.t)/100;
		System.out.println("The Interest Amount Is: "+si.A);
		double A1= si.A + si.p;
		System.out.println("The Total Amount need to pay Is: "+ A1);

	}

}
