public class Exercise_5_15 {
    //Main method
    public static void main(String[] args) {
        //Display the table heading
        System.out.println("Table B.1 ASCII Character Set in the Decimal Index");

        final int NUMBER_OF_CHARACTERS = 10;
        int count = 0;

        //Display the number title
        System.out.print("    ");
        for (char ch = '0'; ch<='9'; ch++){
            System.out.print("   " + ch);
        }

        System.out.println("\n— — — — — — — — — — — — — — — —— — — — —");

        //Display table body
        for (int i = 1; i <= 12; i++){
            System.out.print(i + " | ");
            for (int j = 33; j<=126; j++){
                count++;
                //Display the product and align properly
                if (count % 10 == 0)
                    System.out.println((char)j);
                else
                    System.out.print((char)j + " ");
            }
            System.out.println();
        }
    }
}
