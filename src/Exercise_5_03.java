public class Exercise_5_03 {
    public static void main(String[] args) {
        System.out.printf("%-15s%15s\n", "Celcius", "Fahrenheit");
        int celsius = 0;
        while (celsius <= 100){
            System.out.printf("%-15d%15.1f\n", celsius, celsius*9/5.0 + 32);
            celsius = celsius+2;
        }
    }
}
