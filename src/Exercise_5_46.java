import java.util.Scanner;

public class Exercise_5_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.next();

        int count = 1;
        while (count <= s.length()){
            System.out.print(s.charAt(s.length()-count));
            count++;
        }
    }
}