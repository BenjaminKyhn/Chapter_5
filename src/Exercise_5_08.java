import java.util.Scanner;

public class Exercise_5_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students ");
        int numberOfStudents = input.nextInt();

        int highestScore = 0;
        int score = 0;
        String highestScoreName = "";
        String name = "";

        //The program will run as long as each student has not been assigned a score
        for (int count = 1; count <= numberOfStudents; count++){
            System.out.println("Enter the name of a student: ");
            name = input.next();
            System.out.println("Enter the score of a student: ");
            score = input.nextInt();

            //If a new high score is entered, store the score and name in two new variables
            if (score > highestScore){
                highestScore = score;
                highestScoreName = name;
            }


        }
        //Print out the highest score and name
        System.out.println("name is " + highestScoreName + " and score is " + highestScore);
    }
}
