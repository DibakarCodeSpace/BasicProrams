package Assignment;

public class FibonacciSeries {
	static int n1=0,n2=1,n3,i,count=18;
	
	

	public static void main(String[] args) {
		System.out.print(n1+","+n2);
		for (int i=0;i<count;++i) {
			
			n3=n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
		    
		}
		
	}

}
