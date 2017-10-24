package example.codeclan.com.employeestartpoint;

/**
 * Created by user on 28/08/2017.
 */

public class Employee {
    private int id;
    private String name;
    private String socialSecurityNumber;
    private double salary;

    public Employee() {
        id = 0;
        name = null;
        socialSecurityNumber = null;
        salary = 0;

    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount) {
       salary += amount;
    }


    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
