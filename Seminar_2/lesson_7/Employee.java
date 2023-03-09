package Seminar_2.lesson_7;

import java.util.Objects;

public class Employee {
    String name;
    String surname;
    String department;
    double salary;

    public Employee(String name, String surname, String department, double salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee employee = (Employee) obj;
        return this.name.equals(employee.name) && this.surname.equals(employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.surname);
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + department + " " + salary;
    }
}