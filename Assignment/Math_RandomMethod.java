package Assignment;

public class Math_RandomMethod {

	public static void main(String[] args) {
		System.out.println("Area Of circle: "+ Math.PI*Math.random()*Math.random());
		
		for (int i =1;i<6;i++) {
			System.out.println("Area Of circle"+i+":"+ Math.PI*Math.random()*Math.random());
		}

	}

}
