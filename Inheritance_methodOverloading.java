class Developer {
    void work() {
        System.out.println("Developer is working!");
    }
    void project() {
        System.out.println("Developer is working on a project!");
    }    
}

class JavaDeveloper extends Developer {
    void project() {
        System.out.println("Developer is working on a Java project!");
    }    
}

class PythonDeveloper extends Developer {
    void project() {
        System.out.println("Developer is working on a Python project!");
    }    
}

class Inheritance_methodOverloading {
    public static void main(String[] args) {
        System.out.println("Working of Method-Overloding during inheritance");
        Developer dev = new Developer();
        dev.work();
        dev.project();
        
        dev = new JavaDeveloper(); // upcasting to child class JavaDeveloper
        dev.project();
        dev = new PythonDeveloper(); // upcasting to child class PythonDeveloper
        dev.project();
        System.out.println();
        
        //  Another way of achieving same result
            devMethods(new JavaDeveloper()); // using anaonymous class (means directly giving new class without reference)
            devMethods(new Developer());
            devMethods(new PythonDeveloper());
    }
    
    static void devMethods(Developer dev) {
        dev.work();
        dev.project();
    }
}
