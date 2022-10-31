package src.main.java.com.example.nested;

import src.main.java.com.example.Greeting;

public class Child {
    public static void main(String args[]) {
        Greeting.sayHi();
        System.out.println("Call the Greeting say()");
    }
}
