// package Encapsulation_7;

class Human{
    private int age = 11;
    private String name = "Akash";

    //Code genrated by IDE
    public int getAge() {
        return age;
    }
    //The `this` keyword is a reference to the current object in a method or constructor.
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // public int getAge(){
    //     return age;
    // }
    // public void setAge(int a){
    //     age  = a;
    //     System.out.println("Age is set");
    // }
    // public String getName(){
    //     return name;
    // }
    // public void setName(String a){
    //     name  = a;
    //     System.out.println("Name is set");
    // }

    // constructor
    // Default constructor
    public Human(){
        age = 12;
        name = "John";
    }
    // parameterized constructor
    public Human(String name,int age){
        this.age = age;
        this.name = name;
    }

    
}

public class Demo{
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.name = "Akash"; // we cannot access as this is private
        // obj.age =  11;      // we cannot access
        // obj.setName("Akash");
        // obj.setAge(22);
        System.out.println(obj.getName()+" age is "+obj.getAge());
        
        Human obj1 = new Human("Akash",18);
        System.out.println(obj1.getName()+" age is "+obj1.getAge());
    }
}

