package Assignment;

public class DefaultValueOfVariable {
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static String S1;
	static boolean b1;
	
	
	byte b5;
	short s5;
	int i5;
	long l5;
	float f5;
	double d5;
	char c5;
	String S55;
	boolean b55;

	public static void main(String[] args) {
		
		System.out.println("Static byte: "+b);
		System.out.println("Static short: "+s);
		System.out.println("Static int: "+i);
		System.out.println("Static long: "+l);
		System.out.println("Static float: "+f);
		System.out.println("Static double: "+d);
		System.out.println("Static char: "+c);
		System.out.println("Static String: "+S1);
		System.out.println("Static boolean: "+b1);
		
		DefaultValueOfVariable v1= new DefaultValueOfVariable();
		
		System.out.println("Non Static byte: "+v1.b5);
		System.out.println("Non Static short: "+v1.s5);
		System.out.println("Non Static int: "+v1.i5);
		System.out.println("Non Static long: "+v1.l5);
		System.out.println("Non Static float: "+v1.f5);
		System.out.println("Non Static double: "+v1.d5);
		System.out.println("Non Static char: "+v1.c5);
		System.out.println("Non Static String: "+v1.S55);
		System.out.println("Non Static boolean: "+ v1.b55);
		
		
	}

}
