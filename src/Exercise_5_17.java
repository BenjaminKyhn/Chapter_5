import java.util.Scanner;

public class Exercise_5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of lines: ");
        int numberOfLines = input.nextInt();

        // Display pyramid
        for (int rows = 1; rows <= numberOfLines; rows++){
            System.out.print("memes");
            for (int i = numberOfLines; i <= numberOfLines && i > 0 ; i--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
