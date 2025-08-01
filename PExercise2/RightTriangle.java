/*
  *Author: (Conserva, Heart Bhea J.)
  * Programming Date: August-29-2023
  * Activity Name and Number: Prelim Exercise Number 2

   -----------------------------------------------------------------
   Input: Perimeter of a Right Triangle (area)
   Processes: Compute the base and height of the Right Triangle
              Compute the area of the Right Triangle
   Display results
   Output: perimeter, area
   ------------------------------------------------------------------
   Algorithm:
   1. Assign the perimeter of a Right Triangle
   2. Compute the perimeter : perimeter = base + height + hypotenuse
   3. Compute the area: area = (1/2) * base * height
   4. Show the perimeter of a Right Triangle
   5. Show the area of the Right Triangle
    -------------------------------------------------------------------
*/

package exercises.prelims;

import java.lang.*;

public class RightTriangle {
    public static void main(String[] args){

        int base = 21;
        int height = 30;
        int hypotenuse = 14;
        int perimeter = base + height + hypotenuse;
        double area = 0.5 * base * height;

        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" *     Base of a Right Triangle is         " + base + "             *");
        System.out.println(" *     Height of a Right Triangle is         " + height + "           *");
        System.out.println(" *     Hypotenuse of a Right Triangle is         " + hypotenuse + "       *");
        System.out.println(" *     Perimeter of a Right Triangle is         " + perimeter + "        *");
        System.out.println(" *     Area of a Right Triangle is           " + area + "        *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");

    }
}
