package Assignment;

public class Logial_Operator {

	public static void main(String[] args) {
		if(true&&true) {
			System.out.println(true);
		}
		
		if(true||false) {
			System.out.println(true);
		}
		
		if(!(false&&true)) {
			System.out.println(true);
		}
		if(!(false||false)) {
			System.out.println(true);
		}

	}

}
