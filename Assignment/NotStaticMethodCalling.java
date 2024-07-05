package Assignment;

public class NotStaticMethodCalling {
	
	void M1() {
		System.out.println("M1");
	}
	
	void M2(int x,char c) {
		System.out.println("M2");
	}
	public static void main(String[] args) {
		
		NotStaticMethodCalling N1= new NotStaticMethodCalling();
		N1.M1();
		N1.M2(4,'d');
			
		
	}

}
