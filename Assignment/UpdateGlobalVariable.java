package Assignment;

public class UpdateGlobalVariable {
	static int a=50;
	static boolean b= true;
	int d=300;
	String S= "Grotech";
	
	public static void main(String[] args) {
		a=100;
		b=false;
		
		
		System.out.println(a);
		System.out.println(b);
		
		UpdateGlobalVariable v1= new UpdateGlobalVariable();
		
		v1.d=800;
		v1.S="Grotech Minds";
		System.out.println(v1.d);
		System.out.println(v1.S);
	}

}


