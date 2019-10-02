import java.util.Scanner;

public class Exercise_5_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();

        int count = 1;
        while (count < s.length()) {
            if (s.charAt(count) != ' ') {
                System.out.print(s.charAt(count));
            }
            count = count + 2;

        }
    }
}