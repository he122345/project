package com.SALARY.domain;

import java.util.Objects;

public class Type {
    private int id;
    private String type;
    private String level;
    private String department;
    private int basic_salary;

    public Type() {
    }

    public Type(int id, String type, String level, String department, int basic_salary) {
        this.id = id;
        this.type = type;
        this.level = level;
        this.department = department;
        this.basic_salary = basic_salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getBasic_salary() {
        return basic_salary;
    }

    public void setBasic_salary(int basic_salary) {
        this.basic_salary = basic_salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type1 = (Type) o;
        return id == type1.id && basic_salary == type1.basic_salary && type.equals(type1.type) && level.equals(type1.level) && department.equals(type1.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, level, department, basic_salary);
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", level='" + level + '\'' +
                ", department='" + department + '\'' +
                ", basic_salary=" + basic_salary +
                '}';
    }
}
