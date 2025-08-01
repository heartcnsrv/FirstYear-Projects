/*
 *Author: (Conserva, Heart Bhea J.)
 * Programming Date: September-22-2023
 * Activity Name and Number: Prelim Exercise Number 9

 Analysis:
   Input: 10 pairs of grades and units
   Processes:
   Read the grades and units
   Compute the sum of the products of grades and units
   Compute the total of the units
   Compute the average : (sum of products of grades and units)/total_units
   Show the average
   Give an appropriate message
   Output: Average, Message
 Algorithm:
   1. Let grade represent a grade for a subject
   2. Let units represent number of units for a subject
   3. Let totalGrade = 0 where totalGrade represents the sum of the products of grades and
      corresponding units
   4. Let totalUnits = 0 where totalUnits represents the total number of units
   5. Let average represent the average grade of the student
   6. Read the first grade
   7. Read the number of units for the first grade
   8. Add the product of first grade and the corresponding units to totalGrade
   9. Add the units for the first grade to totalUnits
   10. Repeat steps 6, 7, 8 and 9 for the 2nd to the 10th grade
   11. Compute the average where average = totalGrades/totalUnits
   12. Display the average
   13. If (average <= 85) print “Congratulations! You belong to the dean's list:
   14. If (average > 85) print “Sorry! You did not make it to the dean's list. Do better next term:
*/

package exercises.prelims;

import java.lang.*;
import java.util.*;

public class GradeAverage1 {
    public static void main(String[] args) {
        Scanner hbd = new Scanner(System.in);

        int grade = 50;
        int units = 0;
        int totalGrade = 0;
        int totalUnits = 0;
        double average = 0.0;

        //1st subject
        System.out.print("Enter the Grade of the Student for the 1st Subject: ");
        grade = hbd.nextInt();

        System.out.print("Enter the Number of Units for the 1st Subject: ");
        units = hbd.nextInt();

        // computations for 1st grade
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;

        //2nd subject
        System.out.print("Enter the Grade of the Student for the 2nd Subject: ");
        grade = hbd.nextInt();

        System.out.print("Enter the Number of Units for the 2nd Subject: ");
        units = hbd.nextInt();

        // computations for 2nd grade
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;

        //3rd subject
        System.out.print("Enter the Grade of the Student for the 3rd Subject: ");
        grade = hbd.nextInt();

        System.out.print("Enter the Number of Units for the 3rd Subject: ");
        units = hbd.nextInt();

        // computations for 3rd grade
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;

        //4th subject
        System.out.print("Enter the Grade of the Student for the 4th Subject: ");
        grade = hbd.nextInt();

        System.out.print("Enter the Number of Units for the 4th Subject: ");
        units = hbd.nextInt();

        // computations for 4th grade
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;

        //5th subject
        System.out.print("Enter the Grade of the Student for the 5th Subject: ");
        grade = hbd.nextInt();

        System.out.print("Enter the Number of Units for the 5th Subject: ");
        units = hbd.nextInt();

        // computations for 5th grade
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;

        //6th subject
        System.out.print("Enter the Grade of the Student for the 6th Subject: ");
        grade = hbd.nextInt();

        System.out.print("Enter the Number of Units for the 6th Subject: ");
        units = hbd.nextInt();

        // computations for 6th grade
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;

        //7th subject
        System.out.print("Enter the Grade of the Student for the 7th Subject: ");
        grade = hbd.nextInt();

        System.out.print("Enter the Number of Units for the 7th Subject: ");
        units = hbd.nextInt();

        // computations for 7th grade
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;

        //8th subject
        System.out.print("Enter the Grade of the Student for the 8th Subject: ");
        grade = hbd.nextInt();

        System.out.print("Enter the Number of Units for the 8th Subject: ");
        units = hbd.nextInt();

        // computations for 8th grade
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;

        //9th subject
        System.out.print("Enter the Grade of the Student for the 9th Subject: ");
        grade = hbd.nextInt();

        System.out.print("Enter the Number of Units for the 9th Subject: ");
        units = hbd.nextInt();

        // computations for 9th grade
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;

        //10th subject
        System.out.print("Enter the Grade of the Student for the 10th Subject: ");
        grade = hbd.nextInt();

        System.out.print("Enter the Number of Units for the 10th Subject: ");
        units = hbd.nextInt();

        // computations for 10th grade
        totalGrade = totalGrade + grade * units;
        totalUnits = totalUnits + units;


        //computing the average
        average = totalGrade / totalUnits;
       if (average >= 85){
           System.out.println("Your average Grade: "+ average);
           System.out.println("Congratulations! You belong to the dean's list: ");
       }else if (average <=85){
           System.out.println("Your average Grade: "+ average);
           System.out.println("Sorry! You did not make it to the dean's list. Do better next term: ");
       }
    }
}
