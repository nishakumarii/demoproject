package mypackage;

public class MyClass {
    public void displayMessage() {
        System.out.println("Hello from MyClass!");
    }
}
import mypackage.MyClass;

public class MainProgram {
    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass myObject = new MyClass();

        // Calling a method from MyClass
        myObject.displayMessage();
    }
}

