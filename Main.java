class Student
{
    int rollNo;
    int age;
    String name;
    
    void Eat()
    {
        System.out.println("Eating");
    }
    
    void Study()
    {
    System.out.println("Studying");
    }
}

class Main
{
    public static void main(String[] args)
    {
        Student s1= new Student();
        Student s2= new Student();
        
        s1.rollNo=1;
        s1.age=21;
        s1.name= "abc";
        s1.Eat();
        s1.Study();
        System.out.println(s1.rollNo);
        System.out.println(s1.age);
        System.out.println(s1.name);
        
        s2.rollNo=2;
        s2.age=21;
        s2.name= "xyz";
        s2.Eat();
        s2.Study();
        System.out.println(s2.rollNo);
        System.out.println(s2.age);
        System.out.println(s2.name);
    }
}