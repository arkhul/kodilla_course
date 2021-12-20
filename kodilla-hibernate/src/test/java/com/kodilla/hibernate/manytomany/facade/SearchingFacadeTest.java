package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class SearchingFacadeTest {

    @Autowired
    private SearchingFacade searchingFacade;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    @Test
    void searchingEmployeeTest() {
        searchingFacade.searchEmployees(employeeDao, "%it%");
    }

    @Test
    void searchingCompanyTest() {
        searchingFacade.searchCompanies(companyDao, "%Ma%");
    }
}
