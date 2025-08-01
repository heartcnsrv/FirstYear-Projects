/*
  *Author: (Conserva, Heart Bhea J.)
  * Programming Date: September-8-2023
  * Activity Name and Number: Prelim Exercise Number 4

   -----------------------------------------------------------------
   Problem:
   Write a program that computes and shows the area and the circumference of a circle with
   a given radius. Let the radius be entered through the keyboard at program runtime.
   -----------------------------------------------------------------
   Analysis:
   Input: Radius of a circle (radius)
   Processes:
   Read the radius of the circle
   Compute the circumference of the circle
   Compute the area of the circle
   Display results
   Output: circumference, area
   ------------------------------------------------------------------
   Algorithm:
   1. Read/Accept the radius of the circle
   2. Compute the circumference: circumference = 2 * PI * radius
   3. Compute the area: area = PI * radius * radius
   4. Show the radius of the circle
   5. Show the circumference of the circle
   6. Show the area of the circle

    -------------------------------------------------------------------
*/

package exercises.prelims;

import java.lang.*;
import java.util.Scanner;

public class Circle3 {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        int radius;
        double circumference;
        double areaOfCircle;

        System.out.print("Type the value of radius then press the enter key: ");
        radius = Integer.parseInt(kbd.nextLine());

        circumference = 2 * Math.PI * radius;
        areaOfCircle = Math.PI * radius *radius;

        System.out.println();
        System.out.println();
        System.out.println(" ***********************************************************");
        System.out.println(" * Radius of circle is "        + radius +"                *");
        System.out.println(" * Circumference of circle is " + circumference + "        *");
        System.out.println(" * Area of circle is "          + areaOfCircle + "         *");
        System.out.println(" ***********************************************************");


    }
}
