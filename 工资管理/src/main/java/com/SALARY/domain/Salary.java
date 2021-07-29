package com.SALARY.domain;

import java.util.Objects;

public class Salary {
    private int id;
    private int month;
    private int salary;

    public Salary() {
    }

    public Salary(int id, int month, int salary) {
        this.id = id;
        this.month = month;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
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
        return id == salary1.id && month == salary1.month && salary == salary1.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, month, salary);
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", month=" + month +
                ", salary=" + salary +
                '}';
    }

    @Override
    public Object clone() {
        Salary sa = null;
        try{
            sa = (Salary) super.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sa;
    }


}
