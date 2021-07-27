package com.SALARY.domain;

import java.util.Objects;

public class Type {
    private int id;
    private String kind;
    private String level;
    private String department;
    private int basic_salary;

    public Type() {
    }

    public Type(int id, String kind, String level, String department, int basic_salary) {
        this.id = id;
        this.kind = kind;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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
        Type type = (Type) o;
        return id == type.id && basic_salary == type.basic_salary && Objects.equals(kind, type.kind) && Objects.equals(level, type.level) && Objects.equals(department, type.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, kind, level, department, basic_salary);
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", kind='" + kind + '\'' +
                ", level='" + level + '\'' +
                ", department='" + department + '\'' +
                ", basic_salary=" + basic_salary +
                '}';
    }
}
