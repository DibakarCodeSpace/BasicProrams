package Assignment;

public class ConstructorCalling {
	
	ConstructorCalling(){
		System.out.println("No Param Constructor");
	}
	ConstructorCalling(int a, int b){
		System.out.println("2 Param Constructor");
	}
	
	public static void main(String[] args) {
		
		ConstructorCalling C1 =new ConstructorCalling();
		new ConstructorCalling(4,7);
	}

}
