package homework2__8.model;

public class Employee {
    private String firstName;
    private String lastName;
    private String fullName;
    private Integer department;
    private Double salary;

    public Employee(String firstName, String lastName, Integer department, Double salary) {
        this(firstName, lastName);
        this.department = department;
        this.salary = salary;
    }
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }
    public String getFullName() {
        return firstName + lastName;
    }

    public Integer getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }
}
