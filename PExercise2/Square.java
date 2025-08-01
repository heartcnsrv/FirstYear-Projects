/*
  *Author: (Conserva, Heart Bhea J.)
  * Programming Date: August-29-2023
  * Activity Name and Number: Prelim Exercise Number 2

   -----------------------------------------------------------------
   Input: Perimeter of a Square (area)
   Processes: Compute the four sides of a Square
              Compute the area of the Square
   Display results
   Output: perimeter, area
   ------------------------------------------------------------------
   Algorithm:
   1. Assign the perimeter of a Square
   2. Compute the perimeter : perimeter = 4*side
   3. Compute the area: area = side * side
   4. Show the perimeter of a Square
   5. Show the area of the Square
    -------------------------------------------------------------------
*/

package exercises.prelims;

import java.lang.*;

public class Square {
    public static void main(String[] args){

        int side = 21;
        int perimeter = 4 * side;
        int area = side * side;

        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *     Side of a Square is         " + side + "                     *");
        System.out.println(" *     Perimeter of a Square is         " + perimeter + "                *");
        System.out.println(" *     Area of a Square is           " + area + "                  *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");
    }
}
