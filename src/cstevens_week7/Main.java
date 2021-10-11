package cstevens_week7;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 7 Assignment
 * @Date: Jun 30, 2021
 * @Description: Single Dimensional Arrays
 */
//Imports
import java.util.Scanner;
import static java.lang.Math.*;

//Begin Class Main
public class Main {

    //Begin Main Method
    public static void main(String[] args) {

        // declarations
        String again;           //used to run again
        int cntr = 0;           //counter
        int numGrades;          //number of grades input

        // create an object of the Scanner
        Scanner sc = new Scanner(System.in);

        // begin DO WHILE loop to re-run the program
        do {

            // begin DO WHILE to force number in range 1 to 99
            do {
                // request user input for number of grades (size of array)
                System.out.print("\nPlease enter a number of grades between"
                        + " 1 and 99: ");
                numGrades = sc.nextInt();
                sc.nextLine();
                
                if (numGrades < 1 || numGrades > 99){
                System.out.print("\nInvalid entry. Try again.\n");
                }
            } while (numGrades < 1 || numGrades > 99); 
                
                    

            // array-creation expression for yourGrades[]
            double[] yourGrades = new double[numGrades];

            // pass to method randomGrade to populate array with Random grades
            System.out.print("\nThe letter grades for each score are:");
            randomGrade(yourGrades, cntr);

            // call method assignGrade to display numeric & letter grades
            // grades should be numbered starting with 1
            assignGrade(yourGrades);

            // call method lowGrade to output lowest grade from the array
            System.out.printf("\n\nThe lowest grade was: %.2f",
                    lowGrade(yourGrades));

            // call method highGrade to output highest grade from the array
            System.out.printf("\nThe highest grade was: %.2f",
                    highGrade(yourGrades));

            // call method to output average grade from the array
            System.out.printf("\nThe average is: %.2f", avgGrade(yourGrades));

            // request input to continue program
            System.out.print("\n\nRun program again? (Y for Yes, N to exit): ");
            again = sc.nextLine();

        } while (again.equalsIgnoreCase("Y"));

        System.out.print("\nThank you. Goodbye!\n\n");

    } //End Main Method

    /**
     * Method @randomGrade: Populate array with Random grades
     *
     * @param array
     * @param i
     * @return array with Random grades
     */
    private static double[] randomGrade(double[] array, int i) {
        for (i = 0; i < array.length; i++) {
            array[i] = (random() * (1 - .55) + .55) * 100;
        }
        return array;
    } //End method randomGrade

    /**
     * Method @assignGrade: Display each grade in the array, assign a grade
     * number starting at 1, and assign a corresponding letter grade
     *
     * @param array
     */
    private static void assignGrade(double[] array) {
        String letter;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 59.5) {
                letter = "F";
            } else if (array[i] >= 60 && array[i] < 62.5) {
                letter = "D-";
            } else if (array[i] >= 62.5 && array[i] < 66.5) {
                letter = "D";
            } else if (array[i] >= 66.5 && array[i] < 69.5) {
                letter = "D+";
            } else if (array[i] >= 69.5 && array[i] < 72.5) {
                letter = "C-";
            } else if (array[i] >= 72.5 && array[i] < 76.5) {
                letter = "C";
            } else if (array[i] >= 76.5 && array[i] < 79.5) {
                letter = "C+";
            } else if (array[i] >= 79.5 && array[i] < 82.5) {
                letter = "B-";
            } else if (array[i] >= 82.5 && array[i] < 86.5) {
                letter = "B";
            } else if (array[i] >= 86.5 && array[i] < 89.5) {
                letter = "B+";
            } else if (array[i] >= 89.5 && array[i] < 92.5) {
                letter = "A-";
            } else {
                letter = "A";
            }
            System.out.printf("\nGrade %d: %.2f is a %s",
                    i + 1, array[i], letter);
        }
    } //End method assignGrade

    /**
     * Method @lowGrade: Find lowest grade in the array
     *
     * @param array
     * @return lowest grade
     */
    private static double lowGrade(double[] array) {
        double minGrade = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minGrade) {
                minGrade = array[i];
            }
        }
        return minGrade;
    } //End method lowGrade

    /**
     * Method @highGrade: Find highest grade in the array
     *
     * @param array
     * @return highest grade
     */
    private static double highGrade(double[] array) {
        double maxGrade = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxGrade) {
                maxGrade = array[i];
            }
        }
        return maxGrade;
    } //End method highGrade   

    /**
     * Method @avgGrade: Determine average of grades in array
     *
     * @param array
     * @return average of grades
     */
    private static double avgGrade(double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        return total / array.length;
    } //End method avgGrade

} //End Class Main
