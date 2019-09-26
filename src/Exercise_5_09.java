import java.util.Scanner;

public class Exercise_5_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students ");
        int numberOfStudents = input.nextInt();

        int score = 0;
        int lowestScore = 0;
        int secondLowestScore = 0;
        String name = "";
        String lowestScoreName = "";
        String secondLowestScoreName = "";


        //The program will run as long as each student has not been assigned a score
        for (int count = 0; count < numberOfStudents; count++){
            System.out.println("Enter the name of a student: ");
            name = input.next();
            System.out.println("Enter the score of a student: ");
            score = input.nextInt();

            //The first score is always the lowest score
            if (count == 0){
                lowestScore = score;
                lowestScoreName = name;
            }

            //If the second score is greater than lowest score it becomes second lowest score
            if (count == 1 && score > lowestScore){
                secondLowestScore = score;
                secondLowestScoreName = name;
            }

            //If the score entered is a new low, change lowest and second lowest score
            if (score < lowestScore){
                secondLowestScore = lowestScore;
                secondLowestScoreName = lowestScoreName;
                lowestScore = score;
                lowestScoreName = name;
            }

            //If the score entered is between lowest and second lowest score, change second lowest score
            if (score > lowestScore && score < secondLowestScore){
                secondLowestScore = score;
                secondLowestScoreName = name;
            }

        }
        //Print out the highest score and name
        System.out.println("The student with the lowest score is " + lowestScoreName + " with a score of " + lowestScore);
        System.out.println("The student with the second lowest score is " + secondLowestScoreName + " with a score of " + secondLowestScore);
    }
}
