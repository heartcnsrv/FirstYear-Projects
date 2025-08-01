package Conserva_EmployeeSalaryInheritance;

class Developer extends Employee {
	    private String programmingLanguage;
	    
	    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
	        super(name, address, salary, jobTitle);
	        this.programmingLanguage = programmingLanguage;
	    }
	    
	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }
	    
	    @Override
	    public double calculateBonus() {
	        // Custom implementation for bonus calculation for developers
	        return getSalary() * 0.10;
	    }
	    
	    @Override
	    public String generatePerformanceReport() {
	        // Custom implementation for performance report for developers
	        return "Performance report for Developer " + getName() + ": Good";
	    }
	    
	    public void writeCode() {
	        // Custom method for writing code
	        System.out.println("Developer " + getName() + " is writing code in " + programmingLanguage);
	    }
	}

