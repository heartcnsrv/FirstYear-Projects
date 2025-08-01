package Prelims;
import java.util.*;
import java.lang.*;

public class HeartWaterBillAnnualSummary {
    public static void main(String[] args){

        int[] presentReading= new int[12];
        int[] startReading= new int[12];

        Scanner scanner = new Scanner(System.in);

        String consumer; // to hold name of consumer
        char cType; // to hold type of consumer
        int[] nCMUsed = new int[12]; /* to hold number of cubic meters of water used for 12 months */
        int minCMResidential=12; /*to hold cut-off for minimum Bill for residential consumers */
        double minBillResidential=180.00; // minimum bill for <= 12 Cubic Meters used
        float rateResidential =30.00F; //cost of 1 Cubic Meter above the min. consumption
        int minCMCommercial=30; /* to hold cut-off for minimum Bill for commercial consumers*/
        double minBillCommercial=600.00; // minimum bill for <= 20Cubic Meters used
        float rateCommercial =50.00F; /*cost of 1 Cubic Meter above the min. consumption for commercial consumers*/
        double[] amountDue= new double[12]; // to hold the amount paid for 12 months
        showIntroduction();

        System.out.print("Enter the name of the water consumer: ");
        consumer = scanner.nextLine();
        cType = readTypeOfConsumer();

        startReading[0] = readStartReading();
        for (int index=0; index < nCMUsed.length; index++){
            presentReading[index] = readEndOfMonthReading(startReading[index], (index+1));

            if (index < (nCMUsed.length - 1))
                startReading[index+1] = presentReading[index];
            nCMUsed[index] = presentReading[index] - startReading[index];
            amountDue[index] = computeAmountDue(nCMUsed[index], cType, minCMResidential, minBillResidential, minCMCommercial, minBillCommercial, rateResidential, rateCommercial);
        }
        showSummary(consumer, cType, startReading, presentReading, nCMUsed, amountDue);
        System.exit(0);
    } // end of main method

    /**
     Computes and returns the average of the elements an array of floating point numbers
     */
    public static double computeAverage(double[] values){
        double total=0; // to hold the total of all elements
        double average; // to hold the average
        for (double element : values) // add the elements
            total = total + element;
        //compute the average

        average = total/values.length ; // total divided by number of elements
        return average;
    }

    /**
     Computes and returns the average of the elements an array of integers
     */
    public static double computeAverage(int[] values){

        double total=0; // to hold the total of all elements
        double average; // to hold the average

        for (int element : values) // add the elements
            total = total + element;
        //compute the average
        average = (double) total/values.length ; //total divided by number of elements

        return average;
    }

    /**
     * The following method finds and returns the index of the element with the lowest value
     * from an array of positive integers.
     * The Linear Search algorithm is applied.*/
    public static int findLowest(int[] values){
        int result=values[0]; // let lowest be the first element

        for (int element : values ) // find out if an element after the first is lower
            if (element < result)
                result = element; // then set the lowest index to the index of lower element

        return result;
    }

    /**
     *Finds and returns the index of the element with the highest value from an array of
     integers*/
    public static int findHighest(int[] values){
        int result=values[0]; // let highest be the first element

        for (int element : values ) // find out if an element after the first is higher
            if (element > result)
                result = element; //then set the highest index to the index of higher element

        return result;
    }

    //REQUIRED: Provide the algorithm
    public static void showSummary(String n, char t, int[] previous, int[] present, int[] c, double[] amount){
        System.out.println();
        System.out.println("Annual Water Bill Summary");
        System.out.println("Name of Consumer: " + n);
        System.out.print("Type of consumer: ");

        if (Character.toLowerCase(t) == 'r')
            System.out.println("Residential");

        if (Character.toLowerCase(t) == 'c')
            System.out.println("Commercial");

        System.out.println("Meter reading at the beginning of year = " + previous[0] + " cubic meters");
        System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "---------------", "--------------------");
        System.out.printf("%15s%15s%15s%20s%n", "Month", "End Reading", "Consumption", "AmountPaid");
        System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "---------------", "--------------------");

        for (int index=0; index < previous.length; index++){
            System.out.printf("%15s%15d%15d%20.2f%n", monthInWord(index+1),
                    present[index],c[index] , amount[index]);
        }
        System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "---------------", "--------------------");
        System.out.println("Average Monthly Reading = "+ computeAverage(c));
        System.out.println("Average Monthly Payment = "+ computeAverage(amount));
        System.out.println("Month with Lowest Water Consumption = "+ monthInWord((findLowest(c) + 1)));
        System.out.println("Month with Highest Water Consumption = "+ monthInWord((findHighest(c) + 1)));
        System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "---------------", "--------------------");

    }
    // REQUIRED: Provide the algorithm
    public static String monthInWord(int m){
        String r="";

        switch (m){
            case 1 : r = "January";
                break;
            case 2 : r = "February";
                break;
            case 3 : r = "March";
                break;
            case 4 : r = "April";
                break;
            case 5 : r = "May";
                break;
            case 6 : r = "June";
                break;
            case 7 : r = "July";
                break;
            case 8 : r = "August";
                break;
            case 9 : r = "September";
                break;
            case 10 : r = "October";
                break;
            case 11 : r = "November";
                break;
            case 12 : r = "December";
        } // end of switch
        return r;
    } // end of monthInWord method

    //REQUIRED: Provide the algorithm and the code
    public static void showIntroduction(){
        // REQUIRED: Provide the code
        System.out.println("This program computes the annual water bill for the consumer.");
        System.out.println("This program accepts the name and type of the consumer, and the meter readings for each month.");
        System.out.println("This program calculates the consumption and amount due for each month");
        System.out.println("This program displays the summary of the bill.");
        System.out.println("This program shows the average monthly reading and payment");
        System.out.println("This program shows the months with the lowest and highest water consumption.");
        System.out.println();

    }

    // REQUIRED: Provide the algorithm and provide missing statements to complete the code
    public static int readStartReading(){
        /* REQUIRED: Declare local variables */
        int reading = 0;
        boolean problemFlag;

        Scanner scanner = new Scanner(System.in);

        do {
            problemFlag = false;
            try {
                System.out.print("Enter the meter reading at the beginning of the year: ");
                // REQUIRED: Provide the input statement
                reading = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException x){
                problemFlag = true;
                System.out.println("You have to enter a number.");
            }
            if (reading < 0){
                System.out.println("The beginning meter reading cannot be negative.");

            }
        } while (reading < 0 || problemFlag);
        return reading;
    }

    // REQUIRED: Provide the algorithm and provide the missing statements to complete the code
    public static int readEndOfMonthReading(int start, int month){
        /*REQUIRED: Declare local variables */
        int reading= 0;
        boolean pFlag;

        Scanner scanner = new Scanner(System.in);

        do {
            try {
                pFlag = false;
                System.out.print("Enter the meter reading for month " + monthInWord(month) + ":");
                //REQUIRED: Provide the necessary input statement\
                reading = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException x){
                pFlag = true;
                System.out.println("You have to enter a number.");
            }
            if (reading < start){
                System.out.println("Invalid datum entry! The present reading must be greater than the previous reading.");
            }
        } while (reading < start || pFlag);
        return reading;
    }

    // REQUIRED: Provide the algorithm and provide the missing statements to complete the code
    public static char readTypeOfConsumer(){
        /*REQUIRED: Declare local variables */
        char t;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the type of the consumer< you may type r for residential or c for commercial>: ");
//REQUIRED: Provide needed statement(s)
            t = scanner.next().charAt(0);

            if (t != 'r' && t !='R' && t != 'c' && t != 'C'){
                System.out.println("The valid types are r for residential and c for commercial.");
            }

        } while (t != 'r' && t !='R' && t != 'c' && t != 'C');
        return t;
    }

    // REQUIRED: Provide the algorithm
    public static double computeAmountDue(int c, char t, int min1, double minB1, int min2, double minB2, float rate1, float rate2){
        double amount = 0;

        switch (t){
            case 'r':
            case 'R':
                if ( c <= min1 ) {
                    amount = minB1;
                }
                else {
                    amount = minB1 + (c-min1)*rate1;
                }
                break;

            case 'c':
            case 'C':
                if ( c <= min2 ) {
                    amount = minB2;
                }
                else {
                    amount = minB2 + (c-min2)*rate2;
                }
        }
        return amount;
    }
} // end of class

