public class Exercise_5_40 {
    public static void main(String[] args) {
        System.out.println("Tossing coin 2.000.000 times...");

        int headsCount = 0;
        for (int i = 1; i <= 2000000 ; i++) {
            int coinFlip = (int)(Math.random()*2);
            if (coinFlip == 0)
                headsCount++;
        }
        System.out.println("\nNumber of heads: " + headsCount);
        System.out.println("Number of tails: " + (2000000 - headsCount));
    }
}
