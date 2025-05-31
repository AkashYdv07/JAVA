// Object Oriented programming
// Object - properties and behaviouror methods
// Class - It is format or a blueprint for an object and who create the object in java is JVM
// Class file is compiled to give byte code and that byte code goes to JVM for object 
// action will be done with the help of method 
// JVM - here we actually execute the code 
// we have a machine and to make java independent we went for a virtual layer on top of it .
// jdk acts a upper layer on jre and jre acts upon jvm 
// if you dont want to return anything - void datatype
// pass the value of numbers when you are calling the method in main() - parameters in function
// for primitives just passing by value
// objects and stuff - passing value of the reference 
// IF you make a change to the object via this ref variables , same obj will be changed
// Shadowing is the concept in java of using two variable with the same name within the same scope that overlap 
// lower level will shadow the value defined in upper level 
// varibale args internally store elements in the form of array 
// ( ...v ) ---> this is how we write it in function call 
// Function overloading means different function with same name 
// they exist if parameter are different or their return type is different .
// this happens during compile time which function to run 
// to compile the java code we want jdk which will convert the java code into yte code to run on java virtual machine .
// We execute the code on jvm to make the java independent we use a virtual layer on top of it .
// now in our code we must have use some other libraries so that all combine give it java runtime environment (JRE).
// main method is the start of execution
// void means not expecting anything in return 
// JVM CONSIST OF STACK(LIFO) MEMORY AND HEAP MEMORY 
// in stack we store data while heap is expandable memory
// every method have its own stack(key value pair)
// all the object and instance variable are created in heap memory while local variable are stored inside stack
// there is a link between stack and heaap memory
// when i create two object of same class both will have same structure i.e blueprint will be same but will diff values
// 
// 

package Oops_main;
class Calculator
{
    int a; //  instance variable while r ,num1 and num2 become local variable
    // actions /behaviour are defined by methods
    public int add(int num1 , int num2)
    {
        System.out.println("in add ");
        int r = num1 + num2;
        return r;
    }
}

public class Object {
    public static void main(String args[])
    {
        int num1 = 4;
        int num2 = 5;
        // int result = num1+num2;

        Calculator calc = new Calculator();  // create the object 
        int result = calc.add(num1 , num2);
        System.out.println(result);
    }
}
