public class Exercise_5_04 {
    public static void main(String[] args) {
        System.out.printf("%-12s%-12s\n", "Inches", "Centimeter");
        int centimeters = 1;
        while (centimeters <= 10){
            System.out.printf("%-12d%-12.2f\n", centimeters, centimeters*2.54);
            centimeters++;
        }
    }
}
