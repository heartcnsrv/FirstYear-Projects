/*
  *Author: (Conserva, Heart Bhea J.)
  * Programming Date: September-8-2023
  * Activity Name and Number: Prelim Exercise Number 4

   -----------------------------------------------------------------
   Problem:
   Write a program that will show the hypotenuse of a Right Triangle.
   Analysis:
   Input: Hypotenuse of a Right Triangle
   Processes: Compute the hypotenuse of the Right Triangle
   Display the result data
   Output: hypotenuse

   ------------------------------------------------------------------
   Algorithm:
   1. Assign the hypotenuse of the Right Triangle
   2. Compute the hypotenuse: hypotenuse = square root of ((base * base) + (height * height))
   3. Show the hypotenuse of a Right Triangle
   4. Show the computed hypotenuse of the Right Triangle
    -------------------------------------------------------------------
*/

package exercises.prelims;

import java.lang.*;
import java.util.Scanner;

public class RightTriangle3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double base, height, hypotenuse;

        System.out.print ("Enter Value for Base: ");
        base = sc.nextDouble();

        System.out.print ("Enter Value for Height: ");
        height = sc.nextDouble();

        hypotenuse = Math.sqrt((base * base) + (height * height));
        System.out.print ("The hypotenuse is " + hypotenuse );

    }
}
