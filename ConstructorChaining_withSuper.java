class Developer {
    String project;

    // 1-argument constructor
    public Developer(String project) {
        this.project = project;
        System.out.println("Inside Developer constructor with 1 parameter!");
    }

    // Method to display project details
    void info() {
        System.out.println("Project: " + project);
        System.out.println("--------------------------");
    }
}

class JavaDeveloper extends Developer {
    // 0-argument constructor
    public JavaDeveloper() {
        // Calls the 1-argument constructor of the superclass
        super("Project-A");
        System.out.println("Inside JavaDeveloper 0-parameter constructor!");
    }

    // 1-argument constructor
    public JavaDeveloper(String project) {
        // Calls the 1-argument constructor of the superclass
        super(project);
        System.out.println("Inside JavaDeveloper 1-parameter constructor!");
    }
}

public class ConstructorChaining_withSuper {
    public static void main(String[] args) {
        System.out.println("Program for constructor chaining with super!");

        // Creating objects with different constructors
        Developer dev = new Developer("Project-D");
        JavaDeveloper jDev1 = new JavaDeveloper();
        JavaDeveloper jDev2 = new JavaDeveloper("Project-C");

        // Displaying project details
        dev.info();
        jDev1.info();
        jDev2.info();
    }
}
