import java.util.Scanner;

class Class_Object {
int id;
String name;
float salary;

void work() {
    System.out.println("The Employeee is working!");
}

void attendMeeting() {
    System.out.println("The Employeee is attending a Meeting!");
}

}

class Class_Object {
    public static void main(String[] args) {
        System.out.println("Program for class and object clearity");
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Enter the id, name, salary for a new employee!");
        emp.id = sc.nextInt();
        emp.name = sc.next();
        emp.salary = sc.nextFloat();
        emp.work();
        System.out.println("The employee's details are \n" + "Id: " + emp.id + "\nName: " + emp.name + "\nSalary:"  + emp.salary);
        emp.attendMeeting();
    }
}