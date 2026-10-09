import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;

        System.out.println("Input an integer a");
        if (!in.hasNextInt()) {
            System.out.println("Error: " + in.next() + " is not an integer.");
            return;
        }
        a = in.nextInt();

        System.out.println("Input an integer b");
        if (!in.hasNextInt()) {
            System.out.println("Error: " + in.next() + " is not an integer.");
            return;
        }
        b = in.nextInt();

        System.out.println("Input an integer c");
        if (!in.hasNextInt()) {
            System.out.println("Error: " + in.next() + " is not an integer.");
            return;
        }
        c = in.nextInt();

        if (a == 0) {
            System.out.println("Error: a cannot be 0 (that would divide by zero).");
            return;
        }

        int disc = b * b - 4 * a * c;

        if (disc < 0) {
            System.out.println("No solution.");
        } else if (disc == 0) {
            double x = -b / (2.0 * a);
            System.out.println("One solution: " + x);
        } else {
            double root = Math.sqrt(disc);
            double x1 = (-b + root) / (2.0 * a);
            double x2 = (-b - root) / (2.0 * a);
            System.out.println("Two solutions: " + x1 + " and " + x2);
        }
    }
}
	
	
	
	
	
	
	
}
