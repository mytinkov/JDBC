package com.skypro;

import java.sql.*;
import java.util.List;

public class Application {


//    public static void main(String[] args) throws SQLException {
//        final String user = "postgres";
//        final String password = "1786232t";
//        final String url = "jdbc:postgresql://localhost:5432/skypro2";

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        Employee employee = new Employee("Vasy", "Vasya", "male", 30, 1);

        employeeDAO.create(employee);

        System.out.println(employeeDAO.readById(1));

        List<Employee> employees = employeeDAO.readAll();

        for (Employee entry : employees) {
            System.out.println(entry);
        }

        employee.setCity(2);
        employeeDAO.update(employee);

        employeeDAO.delete(employee);
    }
}
