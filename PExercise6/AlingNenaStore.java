/*Name: Conserva, Heart Bhea
 * Programming Date: September-12-2023
 * Activity Name and Number: Prelim Programming Exercise Number 6
 *
 * Problem: Create a program that will read the amount of money that will be
 *          computed and the output will be able to give a change.
 *
 * Analysis:
 *      Input: Amount of each Product
 *      Processes: Compute for the total purchased amount
 *                 Compute for the total discount
 *                 Compute for the amount to be paid by the customer
 *      Output: Sum total of number of change
 *
 * Algorithm:
 *      1. Enter the name of the product
 *      2. Compute for the total purchased amount              (quantity * unitPrice)
 *      3. Compute for the total discount                      (totalAmount * discount) / 100
 *      4. Compute for the amount to be paid by the customer   totalAmount - totalDiscount
 *      5. Sum total of number of change                       cashTendered - AmountToBePaid
 */

package exercises.prelims;

import java.lang.*;
import java.util.*;

public class AlingNenaStore {
    public static void main(String[] args) {
        Scanner hbd = new Scanner (System.in);

        String product;
        int quantity, discount;
        double cash_tendered;

        System.out.print("Product: ");
        product = hbd.nextLine();

        System.out.print("Quantity: ");
        quantity = hbd.nextInt();

        System.out.print("Discount: ");
        discount = hbd.nextInt();

        System.out.print("Cash Tendered: ");
        cash_tendered = hbd.nextDouble();

        double unit_price;

        switch (product.toLowerCase()) {
            case "eggs":
            unit_price = 5.00;
            break;

            case "milk":
                unit_price = 18.75;
                break;

            case "sardines":
                unit_price = 23.50;
                break;

            default:
                unit_price = 0.00;
                break;

        }

        double total_amount = quantity * unit_price;
        double discount_amount = (total_amount * discount) / 100;
        double amount_paid = total_amount - discount_amount;
        double change = cash_tendered - amount_paid;

        System.out.println("Total Purchased Amount: " + String.format("%.2f",total_amount));
        System.out.println("Total Discount: " + String.format("%.2f",discount_amount));
        System.out.println("Total Amount to be Paint: " + String.format("%.2f",amount_paid));
        System.out.println("Change: " + String.format("%.2f",change));

    }
}
