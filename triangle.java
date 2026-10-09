import java.util.Scanner;


public class triangle {
	
	public static void main (String[]args) {
		
		Scanner in = new Scanner(System.in);


		System.out.println("Input an integer a:");
        if(!in.hasNextInt()) {

        System.out.println("Error: " + in.next() + " is not an integer.");            return;
        }
		int a = in.nextInt();

		System.out.println("Input an integer b:");
        if(!in.hasNextInt()) {

         System.out.println("Error: " + in.next() + " is not an integer.");
            return;
        }
		int b = in.nextInt();

		System.out.println("Input an integer c:");
        if(!in.hasNextInt()) {

            System.out.println("Error: " + in.next() + " is not an integer.");
            return;
        }
		
	
		int c = in.nextInt();
		
		if(c<=0 || b<=0 || a<=0) {
			System.out.print("Error, negative values");
			return;
			
		}
		
		else if(a>b+c  || b>a+c || c>a+b) {
		System.out.println("Not possible to form triangle  ");	
		return;
		} else {
	   System.out.print("You can make a triangle");
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
