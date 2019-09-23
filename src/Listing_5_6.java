import java.util.Scanner;

public class Listing_5_6 {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        //Keep reading until the data input is 0
        do {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();

            sum += data;
        } while (data !=0);

        System.out.println("The sum is " + sum);
    }
}
