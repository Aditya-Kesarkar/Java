class Employee {
    int id;
    String name;
    String designation;
    
    {  // instance block , provides default values to default constructor!
        id = 101;
        name = "Aditya";
        designation = "Software Engineer";
    }
    
    public Employee() {
        System.out.println("Inside default Constructor!"); 
    }
    
    // parameterized Constructor
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        System.out.println("Inside parameterized Constructor!"); 
    }
    
    // copy constructor -> takes object as input & copies all its parameters!
    public Employee(Employee e) {
        this.id = e.id;
        this.name = e.name;
        this.designation = e.designation;
        System.out.println("Inside copy Constructor!"); 
    }
    
    public void employeeInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

class Copy_constructors {
    public static void main(String[] args) {
        System.out.println("Program for displaying default, parameterized & copy Constructor!\n");
        
        Employee emp1 = new Employee(100, "Abhishek", "Network Security Analyst");
        emp1.employeeInfo();
        seperator();
        
        Employee emp2 = new Employee(emp1);
        emp2.employeeInfo();
        seperator();
        
        Employee emp3 = new Employee();
        emp3.employeeInfo();
        seperator();
    }
    
    public static void seperator() {
        System.out.println();
    }
}