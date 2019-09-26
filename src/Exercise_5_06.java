public class Exercise_5_06 {
    public static void main(String[] args) {
        System.out.printf("%-11s%11s%11s%-11s%11s\n", "Ping", "Square meter", "     |     ", "Square meter", "Ping");
        int ping = 10;
        int squareMeter = 30;
        while (ping <= 80){
            System.out.printf("%-11d%12.3f%11s%-11d%12.3f\n", ping, ping*3.305, "", squareMeter, squareMeter/3.305);
            ping = ping+5;
            squareMeter = squareMeter+5;
        }
    }
}
