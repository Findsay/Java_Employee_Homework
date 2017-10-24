package example.codeclan.com.employeestartpoint;



import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import static org.junit.Assert.*;

/**
 * Created by sandy on 13/10/2017.
 */

public class EmployeeTest {
    Employee employee;
    Manager manager;
    Engineer engineer;
    Admin admin;

    @Before
    public void before() {
        employee = new Employee();
        manager = new Manager();
        engineer = new Engineer();
        admin = new Admin();

    }

    @Test
    public void newEmployeeIdIsZero() {
        assertEquals(0, employee.getId());
        assertEquals(0, manager.getId());
        assertEquals(0, engineer.getId());
        assertEquals(0, admin.getId());


    }

    @Test
    public void newEmployeeNameIsNull() {
        assertNull(employee.getName());
        assertNull(manager.getName());
        assertNull(engineer.getName());
        assertNull(admin.getName());
    }

    @Test
    public void newEmployeeSSnIsNull() {
        assertNull(employee.getSocialSecurityNumber());
        assertNull(manager.getSocialSecurityNumber());
        assertNull(engineer.getSocialSecurityNumber());
        assertNull(admin.getSocialSecurityNumber());
    }

    @Test
    public void newEmployeeSalaryIsNull() {
        assertEquals(0, employee.getSalary(), 0.01);
        assertEquals(0, manager.getSalary(), 0.01);
        assertEquals(0, engineer.getSalary(), 0.01);
        assertEquals(0, admin.getSalary(), 0.01);
    }


    @Test
    public void canSetEmployeeName() {
        employee.setName("Wilma");
        assertEquals("Wilma", employee.getName());
        manager.setName("Fiona");
        assertEquals("Fiona", manager.getName());
        engineer.setName("Adam");
        assertEquals("Adam", engineer.getName());
        admin.setName("Tom");
        assertEquals("Tom", admin.getName());

    }

    @Test
    public void canRaiseSalary() {
        employee.raiseSalary(1000.0);
        assertEquals(1000.0, employee.getSalary(), 0.1);
        manager.raiseSalary(2000.0);
        assertEquals(2000.0, manager.getSalary(), 0.1);
        engineer.raiseSalary(3000.0);
        assertEquals(3000.0, engineer.getSalary(), 0.1);
        admin.raiseSalary(4000.0);
        assertEquals(4000.0, admin.getSalary(), 0.1);
    }

}
