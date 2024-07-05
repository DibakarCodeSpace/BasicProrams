package Assignment;

public class If_Else_If 
{


	public static void main(String[] args) 
	{
		int age=78;
		
		
		if (age>=10 && age<18) 
		{
			System.out.println("adolescent");
		}
		
			else if (age>=40 && age <50) 
			{
				System.out.println("quadragenarian");
			}
		
			else if (age>=50 && age <60) {
				System.out.println("quinquagenarian");
			} 
			else if(age>=60 && age <70) {
				System.out.println("sexagenarian");
			}
			
			else if(age>=70 && age<80) {
				System.out.println("septuagenarian");
			}
			else {
				if(age<10) {
					System.out.println("Child");
				}
				else {
					System.out.println("golden ager");
				}
			}

	}

}
