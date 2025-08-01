package prelim;

import java.util.Scanner;

public class EmployeeList {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
    	
        Employee[] list;
        int number;
        
        System.out.print("How many employees will be included in the listed? ");
        number = Integer.parseInt(scanner.nextLine());
        list = new Employee[number];
        
        System.out.println("Please provide the employee details :)");
        for (int i = 0; i < list.length; i++) {
            System.out.println("For employee " + (i + 1) + " :");
            list[i] = readEmployee(); }
        
        System.out.println();
        System.out.println("Unsorted Employee List");
        showEmployeeList(list);
        
        System.out.println();
        System.out.println("Sorted Employee List");
        sortEmployeeList(list);
        showEmployeeList(list);
        
        System.exit(0);}
    
    
    //show Employee List
    private static void showEmployeeList(Employee[] show) {
        for (int i = 0; i < show.length; i++) {
            System.out.println(show[i].toString()); }
    }
    
    
    //user input - read Employee
    private static Employee readEmployee() {
        System.out.print("Enter first Nname of the employee: ");
        String a = scanner.nextLine();
        
        System.out.print("Enter the middle name of the employee: ");
        String b = scanner.nextLine();
        
        System.out.print("Enter the last name of the employee: ");
        String c = scanner.nextLine();
        
        System.out.print("Enter how many experience does he/she have: ");
        int d = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Enter his/her salary (in peso): ");
        double e = Double.parseDouble(scanner.nextLine());
        
        Employee emp = new Employee(a, b, c, d, e);
        return emp; }
    
    
    //sorting
    private static void sortEmployeeList(Employee[] sort) {
        Employee temp;
        int minIndex = 0;
        for (int i = 0; i < sort.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < sort.length; j++) {
                if
                (sort[minIndex].getLastName().compareToIgnoreCase(sort[j].getLastName()) > 0)
                    minIndex = j;
            }
            if (minIndex != i) {
                temp = sort[i];
                sort[i] = sort[minIndex];
                sort[minIndex] = temp; }
        }
        
        
    } // end of sortList method
} // end of class