/*
  *Author: (Conserva, Heart Bhea J.)
  * Programming Date: September-8-2023
  * Activity Name and Number: Prelim Exercise Number 4

   -----------------------------------------------------------------
   Problem:
   Write a program that will show the area of a Rectangle
   Analysis:
   Input: Area of a Rectangle
   Processes: Compute the area of the Rectangle
   Display the result data
   Output: Area

   ------------------------------------------------------------------
   Algorithm:
   1. Assign the area of the Rectangle
   2. Compute the area: area = (width) * (length)
   3. Show the area of a Rectangle
   4. Show the computed area of the Rectangle
    -------------------------------------------------------------------
*/

package exercises.prelims;

import java.lang.*;
import java.util.Scanner;

public class Rectangle3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double width, length, area;

        System.out.print ("Enter length of the Rectangle: ");
        width = sc.nextDouble();

        System.out.print ("Enter width of the Rectangle: ");
        length = sc.nextDouble();

        area = (width * length);
        System.out.print ("The area is " + area );
    }
}
