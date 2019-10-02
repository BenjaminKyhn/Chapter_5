import java.util.Scanner;

public class Exercise_5_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        String sIgnore = s.toLowerCase();

        int numberOfVowels = 0;
        for (int i = 0; i < s.length() ; i++) {
            if (sIgnore.charAt(i) == 'a'
                    || sIgnore.charAt(i) == 'e'
                    || sIgnore.charAt(i) == 'i'
                    || sIgnore.charAt(i) == 'o'
                    || sIgnore.charAt(i) == 'u'
                    || sIgnore.charAt(i) == 'æ'
                    || sIgnore.charAt(i) == 'ø'
                    || sIgnore.charAt(i) == 'å')
                numberOfVowels++;
        }

        System.out.println(numberOfVowels);
    }
}