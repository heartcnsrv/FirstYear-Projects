public class SetterandGetter {
    public static void main(String[] args) {
        final Employee myemployee = new Employee();

        myemployee.setId(1001);
        myemployee.setName("James");
        myemployee.setDesignation("Software Developer");
        myemployee.setCompany("ABC Corporation");

        System.out.println(myemployee);
    }
}
    class Employee {
        private int id;
        private String name;
        private String designation;
        private String company;

        //setter and getter for id
        public int getId() {
            return id;
        }
        public void setId(final int id) {
            this.id = id;
        }

        //setter and getter for name
        public String getName() {
            return name;
        }
        public void setName(String name) {
            if (name == null || name.length() <=0){ //validate the name
                throw new IllegalArgumentException();//see length - 0
            }
            this.name = name;
        }

        //setter and getter for designation
        public String getDesignation() {
            return designation;
        }
        public void setDesignation(String designation) {
            if (designation == null || designation.length() <=0){ //validate the name
                throw new IllegalArgumentException();//see length - 0
            }
            this.designation = designation;
        }

        //setter and getter for company
        public String getCompany() {
            return company;
        }
        public void setCompany(String company) {
            if (company == null || company.length() <=0){ //validate the name
                throw new IllegalArgumentException();//see length - 0
            }
            this.company = company;
        }

        //Print
        public String toString() {
            return "Employee: [id = " + getId() + ", name = " + getName() + ", designation = " + getDesignation() + ", company = " + getCompany() + "]";

        }
    }

