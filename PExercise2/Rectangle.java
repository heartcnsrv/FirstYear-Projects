/*
  *Author: (Conserva, Heart Bhea J.)
  * Programming Date: August-29-2023
  * Activity Name and Number: Prelim Exercise Number 2

   -----------------------------------------------------------------
   Input: Perimeter of a Rectangle (area)
   Processes: Compute the Length and Width
              Compute the area of the Rectangle
   Display results
   Output: perimeter, area
   ------------------------------------------------------------------
   Algorithm:
   1. Assign the perimeter of a rectangle
   2. Compute the perimeter : perimeter = 2*length + 2*width
   3. Compute the area: area = length * width
   4. Show the perimeter of a rectangle
   5. Show the area of the rectangle
    -------------------------------------------------------------------
*/

package exercises.prelims;

import java.lang.*;

public class Rectangle {
    public static void main(String[] args){

        int length = 21;
        int width = 30;
        int perimeter = (2*length) + (2*width);
        int area = length * width;

        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *     Length of a rectangle is         " + length + "                *");
        System.out.println(" *     Width of a rectangle is         " + width + "                 *");
        System.out.println(" *     Perimeter of a rectangle is         " + perimeter + "            *");
        System.out.println(" *     Area of a rectangle is           " + area + "               *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");
    }
}
