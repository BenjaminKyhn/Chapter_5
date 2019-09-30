import java.util.Scanner;

public class Exercise_5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        System.out.println("Enter number of lines: ");
        int numberOfLines = input.nextInt();
         */

        // Pyramid
        System.out.println("\nPattern B");
        for (int rows = 7; rows <= 7 && rows > 0; rows--){
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }
}
