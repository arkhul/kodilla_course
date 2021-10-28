package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemEmbellishment;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("This is an example text."));
//
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
//        System.out.println();
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        System.out.println("Beautifier with lambdas");
//        poemBeautifier.beautify("Konrad", (text) -> ("ABC" + text));
//        poemBeautifier.beautify("Konrad", (text) -> (text + "ABC"));
//        poemBeautifier.beautify("Konrad", (text) -> (text.toUpperCase()));
//        poemBeautifier.beautify("koNRaD", (text) -> (text.toLowerCase()));
//        poemBeautifier.beautify("Ala ma kota", (text) -> (text.replace("Ala", "Ola")));
//
//        System.out.println();
//        System.out.println("Beautifier with method references");
//        poemBeautifier.beautify("Konrad", PoemEmbellishment::ABCBeforeText);
//        poemBeautifier.beautify("Konrad", PoemEmbellishment::ABCAfterText);
//        poemBeautifier.beautify("Konrad", PoemEmbellishment::textToUpperCase);
//        poemBeautifier.beautify("koNRaD", PoemEmbellishment::textToLowerCase);
//        poemBeautifier.beautify("Ala ma kota", PoemEmbellishment::replaceText);

//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);
    }
}
