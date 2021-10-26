package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Modu³ 6. Wprowadzenie to testowania oprogramowania");

        System.out.println("Test - pierwszy test jednostkowy:");
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieœæ kolejny test ->
        System.out.println("Test - drugi test jednostkowy:");
        Calculator calculator = new Calculator();
        int addResult = calculator.add(5, 3);
        int substractResult = calculator.substract(10, 6);

        if (addResult == 8 && substractResult == 4) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }

        //...
    }
}
