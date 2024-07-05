package Assignment;

public class Nested_If {

	public static void main(String[] args) {
		String collageName="NIT";
		String Branch="Mechanical";
		int RollNumber=101;
		
		if(collageName=="NIT") {
			System.out.println("You are allowed for Exam");
			
			
			if(Branch=="Mechaniacal") {
				System.out.print("Go to Building No 1");
				
				
				if(RollNumber<=50) {
					System.out.println(" and your Room Number is 1");
				}
				else {
					System.out.println(" and your Room Number is 2");
				}
			}
			
			else {
				System.out.print("Go to Building Number 2");
				
				
				if(RollNumber<=50) {
					System.out.println(" and your Room Number is 1");
				}
				else {
					System.out.println(" and your Room Number is 2");
				}
			}
			
		}
		else{
			System.out.println("You are not allowed for Exam");
		}
		
		
	}

}
