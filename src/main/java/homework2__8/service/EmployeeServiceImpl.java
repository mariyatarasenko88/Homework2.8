package homework2__8.service;

import homework2__8.exeption.EmployeeAlreadyAddedException;
import homework2__8.exeption.EmployeeNotFoundException;
import homework2__8.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Map<String, Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new HashMap<>();
    }
    @Override
    public Employee add(String firstName, String lastNme, Integer department, Double salary) {
        Employee employee = new Employee(firstName, lastNme, department, salary);
        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException("Такой сотрудник уже есть в базе");
        }
        employees.put(employee.getFullName(), employee);
        return employee;
    }
    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employees.remove(employee.getFullName());
        return employee;
    }
    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            return employee;
        }
        throw new EmployeeNotFoundException("Сотрудник с такими данными не найден");
    }
    @Override
    public List<Employee> findAll() {
        return new ArrayList<Employee>(employees.values());
    }

}
