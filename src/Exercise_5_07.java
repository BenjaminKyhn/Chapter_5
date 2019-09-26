public class Exercise_5_07 {
    public static void main(String[] args) {
        double totalCost = 0;
        double tuition = 10000;
        double tuitionTenthYear = 0;

        for (int year = 1; year <= 14; year++){
            tuition += (tuition * 0.06);

            if (year > 10)
                totalCost += tuition;

            if (year == 10)
                    tuitionTenthYear = tuition;

        }
        System.out.printf("In 10 years tuition will be $%.2f and the cost for 4 years of" +
                "tuition is $%.2f.", tuitionTenthYear, totalCost);
    }
}
