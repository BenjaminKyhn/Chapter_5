public class Exercise_5_18 {
    public static void main(String[] args) {
        // Pattern A
        System.out.println("Pattern A");
        for (int rows = 1; rows <= 6; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern B
        System.out.println("\nPattern B");
        for (int rows = 6; rows <= 6 && rows > 0; rows--){
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Display pattern C
        System.out.println("\nPattern C");
        for (int rows = 1; rows <= 6; rows++) {
            for (int s = 6 - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int col = rows; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Display pattern D
        System.out.println("\nPattern D");
        for (int rows = 0; rows < 6; rows++) {				// Print rows
            for (int s = 0; s < rows; s++) {				// Print space
                System.out.print("  ");
            }
            for (int col = 0; col < 6 - rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}