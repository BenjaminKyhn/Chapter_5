import java.util.Scanner;

public class Listing_5_9 {
    /**Main method*/
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter two integers
        System.out.println("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int n2 = input.nextInt();

        //Make gcd the minimum of n1 and n2
        int gcd;
        if (n1 > n2)
            gcd = n2;
        else gcd = n1;

        //Test each number lower than the minimum until the greatest common divisor is found
        while (n1 % gcd != 0 && n2 % gcd != 0){
            gcd--;
        }

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);

    }
}
