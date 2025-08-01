package prelim;

public class Employee
{
    private String firstName = "";
    private String midName = "";
    private String lastName = "";
    private int experience;
    private double salary;
    
    /**
     * Constructs an employee named Heart Jarapa Conserva, has 10 years of experience,
     *  and has a salary of 100000.00 pesos.
     */
    public Employee() {
        firstName = "Heart";
        midName = "Jarapa";
        lastName = "Conserva";
        experience = 10;
        salary = 100000.00; }
    
    /**
     * Constructs an employee that has a first name of fn, middle name mn, last name ln, 
     * experience exp, and basic salary as sal.
     */
    public Employee(String fn, String mn, String ln, int exp, double sal) {
        firstName = fn;
        midName = mn;
        lastName = ln;
        experience = exp;
        salary = sal; }
    
    /**
     * Returns the first name of the employee
     */
    public String getFirstName() {
        return firstName;  }
    /**
     * Sets the first name of the employee to fName
     */
    public void setFirstName(String fName) {
        firstName = fName; }
    
    
    /**
     * Returns the last name of the employee
     */
    public String getLastName() {
        return lastName; }
    /**
     * Sets the last name of the employee to lName
     */
    public void setLastName(String lName) {
        lastName = lName; }
    
    
    /**
     * Returns the middle name of the employee
     */
    public String getMidName() {
        return midName; }
    /**
     * Sets the middle name of the employee to mName
     */
    public void setMidName(String mName) {
        midName = mName; }
    
    
    /**
     * Returns the experience of the employee
     */
    public int getExperience() {
        return experience;  }
    /**
     * Sets the experience of the employee to exp
     */
    public void setExperience(int exp) {
        experience = exp; }
    
    
    /**
     * Returns the salary of the employee
     */
    public double getSalary() {
        return salary; }
    /**
     * Sets the basic salary of the employee to sal
     */
    public void setSalary(double sal) {
    	salary = sal; }
    
 
    /**
     * Returns a string showing the name, experience, and salary of the employee
     */
    public String toString() {
        return (firstName + " " + midName + " " + lastName + "," + experience +
                "," + salary); }
    
    
    /**
     * Returns true if the employee is the same as employee, other else it returns false.
     **/
    public boolean equals(Object a) {
        if (this == a) {
            return true; // Same classes, so they are equal
        }
        
        if (a == null || getClass() != a.getClass()) {
            return false; // Different classes or null, not equal
        }
        
        Employee other = (Employee) a; // Cast to Employee type

        // Compare first names (case-insensitive)
        boolean sameFirstName = firstName.equalsIgnoreCase(other.firstName);
        

        // Compare last names (case-insensitive)
        boolean sameLastName = lastName.equalsIgnoreCase(other.lastName);

        return sameFirstName && sameLastName;
    }}