import java.util.Scanner;

public class Exercise_5_21 {
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);

        //User inputs loan amount
        System.out.println("Enter loan amount: ");
        double loanAmount = input.nextInt();

        //User inputs number of years
        System.out.println("Enter number of years: ");
        int years = input.nextInt();

        //Interest rate always starts at 5%
        double interestRate = 5.0;

        //Print table header
        System.out.printf("%-20s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        //Print table body
        while (interestRate <= 10.0){
            System.out.printf("%-20.3f%-20.2f%-20.2f\n", interestRate, loanAmount * interestRate/1200 / (1 - 1 / Math.pow(1 + interestRate/1200, years * 12)), loanAmount * interestRate/1200 / (1 - 1 / Math.pow(1 + interestRate/1200, years * 12))*12*years);
            interestRate = interestRate+0.25;
        }
    }
}


