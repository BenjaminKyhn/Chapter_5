public class Listing_5_12 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 200){
            number++;
            sum += number;
            if (sum >= 100)
                break;
        }

        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
