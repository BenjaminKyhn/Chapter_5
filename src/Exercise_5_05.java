public class Exercise_5_05 {
    public static void main(String[] args) {
        System.out.printf("%-11s%11s%11s%-11s%11s\n", "Celcius", "Fahrenheit", "     |     ", "Fahrenheit", "Celsius");
        int celsius = 0;
        int fahrenheit = 20;
        while (celsius <= 100){
            System.out.printf("%-11d%11.3f%11s%-11d%11.3f\n", celsius, celsius*9/5.0 + 32, "", fahrenheit, (fahrenheit - 32)*5.0/9);
            celsius = celsius+2;
            fahrenheit = fahrenheit+5;
        }
    }
}
