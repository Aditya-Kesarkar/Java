class Parent {
  void display() {
    System.out.println("Parent!");  
  }
}
class Child extends Parent {
  void display() {
    System.out.println("Child!");  
  }
}
// GO THROUGH ALL CONCEPTS MENTIONED/USED HERE !!! IMPORTANT

public class Inheritance_Method_Overiding_UpCasting {
  public static void main(String[] args) {
    System.out.println("Method to show upcasting! through inheritance, resulting in Polymormhism, due to method-overriding!");
    Parent p = new Parent();
    Child ch = new Child();
    
    p.display();
    ch.display();
    
    p = ch;
    ch.display();
    
    Parent p1 = new Child();
    p1.display();
}
}
