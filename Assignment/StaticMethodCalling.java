package Assignment;

public class StaticMethodCalling {
	
	static void Method1() {
		System.out.println("Method 1");
	}
	
	static void Method2(int a,int b) {
		System.out.println("Method 2");
	}
	

	public static void main(String[] args) {
		
		Method1();
		Method2(5,6);
	}

}
