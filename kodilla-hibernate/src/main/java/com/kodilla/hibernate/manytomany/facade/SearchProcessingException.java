package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessingException extends Exception {

    public static String ERR_EMP_NOT_FOUND = "Employee is not found";
    public static String ERR_COMP_NOT_FOUND = "Company is not found";

    public SearchProcessingException(String message) {
        super(message);
    }
}
