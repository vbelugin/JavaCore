package org.globallogic.company;

public class Employee {
    private String name;
    private long salary;
    private String phone;

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, long salary, String phone) {
        this.name = name;
        this.salary = salary;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}