package com.SALARY.domain;

import java.util.Objects;

public class Salary {
    private int id;
    private int salary;

    public Salary() {
    }

    public Salary(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salary salary1 = (Salary) o;
        return id == salary1.id && salary == salary1.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, salary);
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }
}
