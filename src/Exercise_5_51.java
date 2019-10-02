import java.util.Scanner;

public class Exercise_5_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String s1 = input.nextLine();
        String s1IgnoreCase = s1.toLowerCase();
        System.out.println("Enter the second string: ");
        String s2 = input.nextLine();
        String s2IgnoreCase = s2.toLowerCase();

        String prefix = "";
        int count = 0;

        while (s1IgnoreCase.charAt(count) == s2IgnoreCase.charAt(count)){
                prefix = prefix + s1IgnoreCase.charAt(count);
                count++;
        }

        if (prefix.length() > 0)
        System.out.println("The common prefix is " + prefix);
        else
            System.out.println("The two strings have no common prefix");
    }
}
