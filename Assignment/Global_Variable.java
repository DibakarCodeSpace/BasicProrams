package Assignment;

public class Global_Variable {
	
	static int a=50;
	static boolean b= true;
	int d=300;
	String S= "Grotech";

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		
		Global_Variable v1= new Global_Variable();
		System.out.println(v1.d);
		System.out.println(v1.S);
	}

}
