package Assignment;

public class NonStaticMethod {
	
	void Addition() {
		int a=50;
		int b= 30;
		int c= a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		NonStaticMethod N1= new NonStaticMethod();
		N1.Addition();
	}

}
