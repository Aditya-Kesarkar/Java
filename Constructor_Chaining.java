class Student {
    int roll;
    String name;
    double marks;

    // 3-parameter constructor
    public Student(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        System.out.println("Inside a 3-parameter constructor!");
    }

    // 2-parameter constructor
    public Student(int roll, String name) {
        // Calls the 3-parameter constructor, defaulting marks to 75.55
        this(roll, name, 75.55); 
        System.out.println("Inside a 2-parameter constructor!");
    }

    // No-argument constructor
    public Student() {
        // Calls the 3-parameter constructor with default values
        this(101, "Ayush", 85.60); 
        System.out.println("Inside a no-parameter constructor!");
    }

    // Method to display student details
    void info() {
        System.out.println("Student's Roll No: " + roll);
        System.out.println("Student Name: " + name);
        System.out.println("Marks acquired: " + marks);
        System.out.println("--------------------------");
    }
}

class Constructor_Chaining {
    public static void main(String[] args) {
        System.out.println("Program for constructor chaining!");

        // Creating objects with different constructors
        Student st = new Student(4, "Roshan", 99); // Calls 3-parameter constructor
        Student st1 = new Student(25, "Vikram");  // Calls 2-parameter constructor
        Student st2 = new Student();             // Calls no-parameter constructor

        // Displaying student details
        st.info();
        st1.info();
        st2.info();
    }
}
