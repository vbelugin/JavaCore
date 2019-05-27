package org.globallogic.tasks;

public class Employee {
    private static int numberOfEmployees = 0;
    private String firstName;
    private String lastName;
    private String telephone;

    public Employee(String firstName, String lastName, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        numberOfEmployees++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephone() {
        return telephone;
    }

}
