import java.util.Scanner;

public class Exercise_5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score = 0;
        while (score != -1){ //The program will only run as long as score is not -1
            System.out.println("Enter your score: ");
            score = input.nextInt();
            if (score >= 60 && score <= 100) //A score between 60 and 100 results in a pass
                System.out.println("You pass the exam");
            else if (score < 60 && score >= 0) //A score between 0 and 60 results in a fail
                System.out.println("You fail the exam");
            else if (score == -1) //If score is -1 the program terminates
                System.exit(0);

        }
    }
}
