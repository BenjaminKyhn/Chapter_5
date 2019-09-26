public class Exercise_5_11 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
        int count = 0;
        for (int number = 100; number <= 200; number++){
            if (number % 3 == 0 ^ number % 4 == 0){
                count++;
                if (count % NUMBERS_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
            }
        }
    }
}
