// java is called as strongly typed language
// variable is used to store data so that we can do processing on it 
// everytime you change something alsways compile it first and then run it 
// To compile =  javac Hello.java
// To run = java Hello

// java is platform independent language means it will run on any machine irrespective of hardware because of jvm which itself is dependent
// Jvm will not accept our typed code directly if we want to work 
// jvm understand only byte code but we created java code so for that we have compiler called as javac 
// We have to give the first file and it should have main defined in it with particular signature
// Java is object oriented i.e everything should be there in class .
// We also need a runtime where we can run things and also some libraries 
// For that we need JAVA RUNTIME ENVIRONMENT (JRE) and JVM  - java virtual machine 
// JVM + LIBRARIES = JRE
// to run something on other system we only need jre and jvm which every system has 
// java is WORA = WRITE ONCE AND RUN ANYWHERE provided you have jre and jvm installed 
// Now in todays world we are solving real world problem using virtual world . 
// so we work with data as well as processing on it which is coming from user 


// int has as size of 4 bytes
// long  - 8 bytes
// short - 2 bytes
// byte = 1 byte   it range goes from - 2^7 to 2^7-1  i.e   -128  to 127

// when we do explicit conversion then it is known as casting 


class Hello{
    public static void main(String args[])
    {
        // int num = 3;
        // System.out.println(num);
        // System.out.println("Hello World");
        // System.out.println(5+6);

        // Datatypes - Primitive 
        // int num1 = 1;
        // byte by = 127;
        // short sh = 354;
        // long l = 42524l;

        // float val = 5.8f;
        // double d = 5.87 ;

        // char c = '8' ;    // literals

        // boolean b = true;

        // typecasting
        byte b = 127;
        int a =257;
        byte k = (byte)a;  // so basically its range -126 to 127 so it does modulus of the value by 256 
        System.out.println(k);


        int num =7;
        // int result = num1%num2;
        // num = num + 1;
        // num += 1;
        // num++;   // post increment
        // ++num;   // pre increment
        // num--;   

        int result = num++;   // fetch the value and then increment
        System.out.println(result);
    }
}

