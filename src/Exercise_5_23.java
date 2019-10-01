public class Exercise_5_23 {
    public static void main(String[] args) {
        double sumLeftToRight = 0;
        for (double i = 1; i <= 10000; i++) {
            sumLeftToRight += 1/i;
        }

        double sumRightToLeft = 0;
        for (double j = 10000; j >= 1; j--) {
            sumRightToLeft += 1/j;
        }
        System.out.println(sumLeftToRight);
        System.out.println(sumRightToLeft);

        System.out.printf("%s%.30f", "The difference is ", (sumRightToLeft - sumLeftToRight));
    }
}
