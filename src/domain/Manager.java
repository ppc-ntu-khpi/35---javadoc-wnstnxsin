package domain;
/**
 * public class "manager" for desc of manager
 * @author User
 */
public class Manager extends Employee {
    /**
     * Constructor 1
     * @param employees
     * @param name
     * @param jobTitle
     * @param level
     * @param dept 
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Constructor 2
     * @param employees 
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Constructor 3
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }
    private Employee[] employees;

    /**
     * Method for getting list of employees
     * @return s
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Method for setting list of employees
     * @param employees one position in employee's list
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Method for getting employees list
     * @return employees
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
