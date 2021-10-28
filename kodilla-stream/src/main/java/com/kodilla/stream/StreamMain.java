package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemEmbellishment;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.reference.FunctionalCalculator;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear() <= 2001)
                .filter(posts -> posts.getPostsQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forum -> forum));
        System.out.println("The result map has " + theResultMapOfForumUsers.size() + " element(s)");
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
//        System.out.println();
//        theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);

//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);
//
//        theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);

//        People.getList().stream()
//                //.map(s -> s.toUpperCase())
//                .map(String::toUpperCase)
//                //.forEach(System.out::println);
//                .filter(s -> s.length() > 11)
//                .forEach(s -> System.out.println(s));
//        System.out.println();
//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);

//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);

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
