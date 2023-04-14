package homework2__8.service;

import homework2__8.model.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee getEmployeeWithMaxSalary(Integer departmentId);

    Employee getEmployeeWithMinSalary(Integer departmentId);

    List<Employee> getAllEmployeeByDepartment(Integer departmentId);

    Map<Integer, List<Employee>> getAllEmployeeGroupByDepartment();
}
