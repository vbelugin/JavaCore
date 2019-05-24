package org.globallogic.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Company {
    private final long minSalary = 100;
    private String name;
    private String address;
    private String phone;

    private List<Employee> employees = new ArrayList<>();
    private Employee[] employeeArr = new Employee[0];

    public Company(String name, String address, String phone, List<Employee> employees) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.employees = employees;
    }

    public Company(String name, String address, String phone, Employee[] employees) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.employeeArr = employees;
    }


    public Company(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee[] getEmployeeArr() {
        return employeeArr;
    }

    public long getMinSalary() {
        return minSalary;
    }

    public void hireEmployee(Employee employee) {
        if (employee.getSalary() > minSalary) {
            employees.add(employee);
        } else {
            System.out.println(String.format("Employee %s has too low salary", employee.getName()));
        }
    }

    public void printMaxSalaryEmployeeName() {
        Employee emp = employees.stream().max(Comparator.comparingLong(Employee::getSalary)).orElse(new Employee("Invalid", 0));
        System.out.println(emp.getName());
    }

    public void fireEmployee(String name) {
        employees.removeIf(employee -> employee.getName().equals(name));
    }

    public void fireEmployeeArr(String name) {
        Employee[] tmp = new Employee[employeeArr.length];
        for (int i = 0, j = 0; i < employeeArr.length; i++) {
            if (!employeeArr[i].getName().equals(name)) {
                tmp[j++] = employeeArr[i];
            }
        }
        employeeArr = Arrays.copyOf(tmp, employeeArr.length - 1);
    }

    public long salaryExpenses() {
        return employees.stream().mapToLong(Employee::getSalary).sum();
    }

    public void salaryAvg() {
        System.out.println(employees.stream().mapToLong(Employee::getSalary).average());
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }
}