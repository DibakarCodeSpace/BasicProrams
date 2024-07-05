package Assignment;

public class MathClassMethod {
	static int X=50;
	static int Y=60;

	public static void main(String[] args) {
		System.out.println(Math.max(X, Y));
		System.out.println(Math.min(X, Y));
		System.out.println(Math.nextAfter(X,Y));
		System.out.println(Math.nextDown(50.5f));
		System.out.println(Math.incrementExact(50));
		System.out.println(Math.decrementExact(50));
		System.out.println(Math.random());
		System.out.println(Math.addExact(X,Y));
		System.out.println(Math.multiplyExact(X,Y));
		System.out.println(Math.sqrt(50));
		System.out.println(Math.toIntExact(506575l));
		System.out.println(Math.round(54353644.7));
	}

}
