public class Exercise_5_50 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%1d%1s%1d%1s%-2d%1s", i, "*", j, "=", i*j, " ");

            }
            System.out.println();

        }
    }
}
