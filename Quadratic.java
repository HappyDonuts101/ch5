import java.util.Scanner;



public class Quadratic {
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);


		System.out.println("Input an integer a:");
						int a = in.nextInt();

		System.out.println("Input an integer b:");
				int b = in.nextInt();

		System.out.println("Input an integer c:");
		
	
		int c = in.nextInt();
		
		double discriminant = Math.sqrt(Math.pow(b,2) - 4*a*c);
		
		
		
		

		if(discriminant<0) {
			System.out.println("Try again! NO solution");
			return;
			
		} else if(discriminant==0) {
		double zero = -b/ (2*a);
		 System.out.print("The solution is " + zero);
			
		} else {
			double b2 =-b;
			double solution = (b2 + discriminant) / (2*a);
			double solution2 = (b2-discriminant) / (2*a);
			System.out.println("The solutions is " + solution + " the second solution is " + solution2);
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
