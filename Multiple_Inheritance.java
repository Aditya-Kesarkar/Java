interface Processor {
    void processing();
    void processorSeries();

    // Default method with a generic processor description
    default void processorType() {
        System.out.println("Default Laptops use an energy-efficient processor (e.g., Intel i3, AMD Ryzen 3).");
    }
} 

interface OS {
    void handlingOperations();
} 

// acheiving multiple-Inheritance using Interfaces!
abstract class Laptop implements Processor, OS {
    // since the empty/incomplete/default "processorSeries" method is inherited as its,
    // This class is made into abstract(even single abstract method makes class abstract!);
    
    @Override
    public void processing() {
        System.out.println("Processor is processing some Data!");
    }
    @Override
    public void handlingOperations() {
        System.out.println("Laptop needs an OS to perform every task as it acts as an intermediator between Software & Hardware-components!");
    }
} 

class GamingLaptop extends Laptop {
    @Override
    public void handlingOperations() {
        System.out.println("Handling operations for a Gaming-Laptop!");
    }
    
    @Override
    public void processorSeries() {
        System.out.println("Gaming Laptop generally use high performance series like H or HX Series" );
    }
    @Override  
    public void processorType() {
        System.out.println("Gaming Laptop uses a high-performance processor (e.g., Intel i9, AMD Ryzen 9).");
        // need to define all undefined method from abstract to avoid errors(like make it abstract coz xyz-method undefined)
    }
}

class NormalLaptop extends Laptop {
    @Override
    public void handlingOperations() {
        System.out.println("Handling operations for a Normal-Laptop!");
    }
    @Override
    public void processorSeries() {
        System.out.println("Gaming Laptop generally use mid - range series like P-Series" );
    }
    @Override
    public void processorType() {
        System.out.println("Normal Laptop uses an energy-efficient processor (e.g., Intel i5, AMD Ryzen 5).");
    }
}

class ClassicLaptop extends Laptop {
    @Override
    public void handlingOperations() {
        System.out.println("Handling operations for a Classic Laptop!");
    }
    @Override
    public void processorSeries() {
        System.out.println("Gaming Laptop generally use high power efficient series like U-Series" );
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        accessMethods(new ClassicLaptop());
        accessMethods(new NormalLaptop());
        accessMethods(new GamingLaptop());
    }
    
    public static void accessMethods(Laptop lap) {
        lap.handlingOperations();
        lap.processing();
        lap.processorSeries();
        lap.processorType();
        System.out.println("-----------------------------------------------------");
    }
}

