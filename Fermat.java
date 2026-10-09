import java.util.Scanner;


public class Fermat {

    public static void main(String[]args) {
        int a, b, c, n;

        Scanner in = new Scanner(System.in);
        System.out.println("Input an integer a that is greater than  2");
        a = in.nextInt();
        System.out.println("Input another integer b");
        b=in.nextInt();
        System.out.println("Input another integer c");
        c=in.nextInt();
        System.out.println("Input any integer n");
        n=in.nextInt();

        if(Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n) && n>2) {

            System.out.println("Holy smokes, Fermat was wrong!");
        } else {

           System.out.println("No, that doesn't work.");
        }





    }

    


}