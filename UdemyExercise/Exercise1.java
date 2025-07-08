package UdemyExercise;


// TODO: Create an class called Employee

class Employee{
    private String name;
    private double salary;
    
    public Employee(){
        this.name = "";
        this.salary = 0.0;
    }

    public Employee(String name , double salary){
        this.name = name;
        this.salary = salary;
    }
    
    public String getName(){
        return name;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public String getDetails(){
        return "Name: " + getName() + ", Salary: " + getSalary();
    }
}
// TODO: Create a class Manager that:
// - Extends Employee

class Manager extends Employee{
    private String department;
    
    public Manager(){
        super();
        this.department = "";
    }
    public String getDepartment(){
        return department;
    }
    public String getDetails(){
        
        return super.getDetails() + ", Department: " + getDepartment();
    }
}
public class Exercise1 {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        Employee employee = new Employee();
        employee.getDetails();

        // TODO: Print their details using getDetails()
        Manager manager = new Manager();
        System.out.println(manager.getDetails());
    }
}


