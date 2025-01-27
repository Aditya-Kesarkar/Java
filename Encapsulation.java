import java.util.Scanner;

class Book {
    private int pageNo;

    // constructors are called speciallized setters, since they perform same function 
    public void setData(int x) {
        if (x > 0) {
            pageNo = x;
        } else {
            System.out.println("Ivalid Page Number!");
        }
    }
    

// one getter can return only one value 
// (else should be done like, example; return "URL:" + url + ", website: " + web;) 
// but same is not true for setter! 
    public int getData() {
        return pageNo;
    }
}

class Encapsulation {
    public static void main(String[] args) {
        System.out.println("Encapsulation and how data is accessed using getters and setters,
         to maintain security and controlled access!");
        
        Scanner sc = new Scanner(System.in);
        Book bk = new Book();
        System.out.println("Enter Page Number!");
        int pg = sc.nextInt();
        bk.setData(pg);
        System.out.println(bk.getData());
    }
}