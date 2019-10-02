public class Exercise_5_17{
    public static void main(String[] args) {
        int number = 7;
        for (int i = number; i >= 1; i--) {
            //System.out.println(i);
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}