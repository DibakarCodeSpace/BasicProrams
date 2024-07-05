package Assignment;

public class Method_Overloading_With_Constructor_Overloading {
	
	void m1(){
		System.out.println("m1 with No Param");
	}
	
	void m1(int a){
		System.out.println("m1 with one Int Param");
	}
	
	void m1(int b,char a){
		System.out.println("m1 with one Int Param");
	}
	
	static void m2() {
		System.out.println("Static Method m2 with No Param");
	}
	
	static void m2(boolean b) {
		System.out.println("Static Method m2 with No Param");
	}
	
	Method_Overloading_With_Constructor_Overloading(){
		System.out.println("No param Constructor");
	}
	
	Method_Overloading_With_Constructor_Overloading(int a,int b){
		System.out.println("No param Constructor");
	}
	Method_Overloading_With_Constructor_Overloading(int a,int b, int c){
		System.out.println("No param Constructor");
	}
	public static void main(String[] args) {
		
		Method_Overloading_With_Constructor_Overloading O1= new Method_Overloading_With_Constructor_Overloading();
		
		O1.m1();
		O1.m1(5);
		O1.m1(7,'u');
		m2();
		m2(true);
		
		Method_Overloading_With_Constructor_Overloading O = new Method_Overloading_With_Constructor_Overloading();
		Method_Overloading_With_Constructor_Overloading O3= new Method_Overloading_With_Constructor_Overloading(6,7,8);
		
		new Method_Overloading_With_Constructor_Overloading(6,7);
	}
}
