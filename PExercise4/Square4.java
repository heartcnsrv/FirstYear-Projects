/*
  *Author: (Conserva, Heart Bhea J.)
  * Programming Date: September-8-2023
  * Activity Name and Number: Prelim Exercise Number 4

   -----------------------------------------------------------------
   Problem:
   Write a program that will show the area of a Square.
   Analysis:
   Input: Area of a Square
   Processes: Compute the area of the Square
   Display the result data
   Output: Area

   ------------------------------------------------------------------
   Algorithm:
   1. Assign the area of the Square
   2. Compute the area: area = (diagonal * diagonal) / 2)
   3. Show the area of a Square
   4. Show the computed area of the Square
    -------------------------------------------------------------------
*/

package exercises.prelims;

import java.lang.*;
import java.util.Scanner;

public class Square3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double diagonal, area;

        System.out.print("Enter measurement of a side of the square: ");
        diagonal = sc.nextDouble();

        area = ((diagonal * diagonal) / 2);
        System.out.print ("The area is " + area );

    }
}
