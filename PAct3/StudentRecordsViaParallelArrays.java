/**
 * Name of Student/Programmer: Conserva, Heart Bhea J.
 * CLASS CODE & Schedule: 9315B
 * Date: 02-01-24
 * Student Records Keeping Using Parallel Arrays
 * <p>
 * An ID number, a name, a course, a year level and others are
 * attributed to a student. Hence, eight arrays are
 * used: An array that stores ID numbers, an array that
 * stores names, an array that stores courses, an array
 * that stores year levels, etc. The eight arrays are treated
 * as parallel arrays such that the first elements of the
 * eight arrays are actual attributes (ID number, name, course,
 * year level, etc. ) of one student, the second elements are
 * actual attributes of another student, and so on.
 * <p>
 * <p>
 * REQUIRED:
 * Complete and show a sample run (sample output) of the following
 program.
 **/

import java.util.*;

public class StudentRecordsViaParallelArrays {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){

        String[] id; // Array that will store ID numbers
        String[] names; // Array that will store names
        String[] course;// Array that will store courses
        int[] yearLevel; // array that will store year levels
        int count; // variable that will store the number of students
        byte[] pGrade; // to store prelim grade
        byte[] mGrade; // to store midterm grade
        byte[] tFGrade; // to store tentative Final Grade
        byte[] fGrade ; // to store final grade

        // Read the number of students to be recorded from the keyboard
        System.out.print("How many student records will be created?");
        count = Integer.parseInt(keyboard.nextLine());

        // Instantiate the arrays such that each will have a length=size
        id = new String[count];
        names = new String[count];
        course = new String[count];
        yearLevel = new int[count];
        pGrade = new byte[count];
        mGrade = new byte[count];
        tFGrade = new byte[count];
        fGrade = new byte[count];

        //Invoke the method that will fill the arrays with elements
        populateArrays(id, names, course, yearLevel, pGrade, mGrade, tFGrade, fGrade);
        // Show the students following the order by which they were entered
        System.out.println("Original Order Data");
        showData(id,names,course,yearLevel, pGrade, mGrade, tFGrade, fGrade);
        // Invoke the method for displaying the array elements

        System.out.println("Sorted Data");
        sortDataBasedOnNames2(id, names, course, yearLevel, pGrade, mGrade, tFGrade, fGrade,count);// Invoke the method for
        // displaying the array elements
        // Show the students in sorted order
        showData(id,names,course,yearLevel, pGrade, mGrade, tFGrade, fGrade);

    }//end of main method

    /**
     *Put elements into arrays (parallel arrays) for ID numbers, names, course, year levels, prelim grade,
     * midterm grade, tentative final grade, and final grade
     **/
    public static void populateArrays(String[] id, String[] n, String[] c, int[] y, byte[] p, byte[] m, byte[] t, byte[] f) {
        for (int index = 0; index < n.length; index++) {
            System.out.print("Enter the id number of student " + (index + 1) + ":");
            id[index] = keyboard.nextLine();
            System.out.print("Enter the name of student " + (index + 1) + ":");
            n[index] = keyboard.nextLine();
            System.out.print("Enter the course of student " + (index + 1) + ":");
            c[index] = keyboard.nextLine();
            System.out.print("Enter the year level of student " + (index + 1) + ":");
            y[index] = Integer.parseInt(keyboard.nextLine());
            System.out.print("Enter the prelim grade of student " + (index + 1) + ":");
            p[index] = Byte.parseByte(keyboard.nextLine());
            System.out.print("Enter the midterm grade of student " + (index + 1) + ":");
            m[index] = Byte.parseByte(keyboard.nextLine());
            System.out.print("Enter the tentative final grade of student " + (index + 1) + ":");
            t[index] = Byte.parseByte(keyboard.nextLine());

            // compute the final grade of student as the average of prelim, midterm and tentative final grade
            f[index] = (byte) ((1.0 * p[index] + 1.0 * m[index] + 1.0 * t[index]) / 3.0 + 0.5);
        }
    }//end of populateArrays method

    /**
     Sort the elements of the eight arrays in parallel (i.e. When
     there is a need to swap elements of the array n,
     the corresponding elements in other arrays should also
     be swapped.) such that the elements of array n
     are lexicographically arranged. (SPECIFY the Apply a Sort Algorithm
     that you will follow*/
    public static void sortDataBasedOnNames2(String[] id, String[] n, String[] c, int[] yLevel, byte[] p, byte[] m, byte[] t, byte[] f, int control){

        for(int i = 0; i<control-1; i++){
            for (int j = i+1; j<n.length; j++){
                if(n[i].compareTo(n[j])>0){
                    String temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }

        System.out.printf("%-10s%-25s%-10s%-5s%-6s%-6s%-6s%-6s%n","id number","Name", "course", "year", "PG", "MG", "TFG", "FG");
        for (int i = 0; i <= control - 1; i++){
            System.out.printf("%-10s%-25s%-10s%-5d%-6d%-6d%-6d%-6d%n",id[i],n[i], c[i], yLevel[i],p[i],m[i],t[i],f[i]);
        }
    } // end of sortBasedOnNames method

    /**
     * Show the elements of the arrays on the screen.
     **/
    public static void showData(String[] id, String[] n, String[] c,
                                int[] y, byte[] p, byte[] m, byte[] t, byte[] f) {
        System.out.printf("%-10s%-25s%-10s%-5s%-6s%-6s%-6s%-6s%n", "id number", "Name", "course", "year", "PG", "MG", "TFG", "FG");
        for (int x = 0; x < n.length; x++)
            System.out.printf("%-10s%-25s%-10s%-5d%-6d%-6d%-6d%-6d%n",
                    id[x], n[x], c[x], y[x], p[x], m[x], t[x], f[x]);
    } // end of showData method
} // end of StudentRecordsViaParallelArrays class