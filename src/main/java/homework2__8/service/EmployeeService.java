package homework2__8.service;

import homework2__8.model.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeService {
    Employee add(String firstName, String lastNme, Integer department, Double salary);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    List<Employee> findAll();
}
