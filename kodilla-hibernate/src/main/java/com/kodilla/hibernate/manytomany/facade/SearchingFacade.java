package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SearchingFacade {

    public static Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

    public void searchEmployees(EmployeeDao employeeDao, String arg) {
        LOGGER.info("Searching Employees' table for an employee whose 'lastname' contains: <" + arg + ">");
        List<Employee> employees = employeeDao.retrieveEmployeeLastnameThatIncludesCharacters(arg);
        if (!employees.isEmpty()) {
            LOGGER.info("Success. Empoloyees found:\n" + employees);
        } else {
            LOGGER.error(SearchProcessingException.ERR_EMP_NOT_FOUND);
        }
    }

    public void searchCompanies(CompanyDao companyDao, String arg) {
        LOGGER.info("Searching Companies' table for a company whose 'name' contains: <" + arg + ">");
        List<Company> companies = companyDao.retrieveCompanyNameThatIncludesCharacters(arg);
        if (!companies.isEmpty()) {
            LOGGER.info("Success. Companies found:\n" + companies);
        } else {
            LOGGER.error(SearchProcessingException.ERR_COMP_NOT_FOUND);
        }
    }





}
