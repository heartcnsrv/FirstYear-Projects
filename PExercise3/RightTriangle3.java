/*
  *Author: (Conserva, Heart Bhea J.)
  * Programming Date: September-5-2023
  * Activity Name and Number: Prelim Exercise Number 3

   -----------------------------------------------------------------
   Problem:
   Write a program that will show the hypotenuse of a Right Triangle.
   Analysis:
   Input: Hypotenuse of a Right Triangle
   Processes: Compute the hypotenuse of the Right Triangle
   Display the data associated with the Right Triangle
   Output: Hypotenuse

   ------------------------------------------------------------------
   Algorithm:
   1. Assign the hypotenuse of the Right Triangle
   2. Compute the hypotenuse: hypotenuse = square root of ((base * base) + (height * height))
   3. Show the given hypotenuse of a Right Triangle
   4. Show the computed hypotenuse of the Right Triangle
    -------------------------------------------------------------------
*/

package exercises.prelims;

import java.lang.*;

public class RightTriangle2 {
    public static void main(String[] args) {

        int base, height, hypotenuse;
        base = 21;
        height = 30;
        hypotenuse = (int) (Math.sqrt(Math.pow(base, 2)) + (Math.pow(height, 2)));

        System.out.println( );
        System.out.println( );
        System.out.println(" ********************************************************");
        System.out.println(" * Given base of a Right Triangle =          " + base + "                *");
        System.out.println(" * Computed height of a Right Triangle = " + height + "    *");
        System.out.println(" * Computed hypotenuse of a Right Triangle = " + hypotenuse + "    *");
        System.out.println(" ********************************************************");


    }
}
