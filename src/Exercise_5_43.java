public class Exercise_5_43 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 7; i++) {
            for (int j = i+1; j <= 7; j++) {
                System.out.println(i + "  " + j);
                count++;
            }

        }
        System.out.println("\nNumber of cominations: " + count);
    }
}
