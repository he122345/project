package com.SALARY.domain;

import java.util.Objects;

public class Show {
    private int id;
    private String name;
    private String photo;
    private int age;
    private String phone;
    private int month;
    private int days;
    private int salary;
    private String overtime_type;
    private int overtime_days;
    private int subsidy;
    private String kind;
    private String level;
    private String department;
    private int basic_salary;

    public Show() {
    }

    public Show(int id, String name, String photo, int age, String phone, int month, int days, int salary, String overtime_type, int overtime_days, int subsidy, String kind, String level, String department, int basic_salary) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.age = age;
        this.phone = phone;
        this.month = month;
        this.days = days;
        this.salary = salary;
        this.overtime_type = overtime_type;
        this.overtime_days = overtime_days;
        this.subsidy = subsidy;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getOvertime_type() {
        return overtime_type;
    }

    public void setOvertime_type(String overtime_type) {
        this.overtime_type = overtime_type;
    }

    public int getOvertime_days() {
        return overtime_days;
    }

    public void setOvertime_days(int overtime_days) {
        this.overtime_days = overtime_days;
    }

    public int getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(int subsidy) {
        this.subsidy = subsidy;
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
        Show show = (Show) o;
        return id == show.id && age == show.age && month == show.month && days == show.days && salary == show.salary && overtime_days == show.overtime_days && subsidy == show.subsidy && basic_salary == show.basic_salary && Objects.equals(name, show.name) && Objects.equals(photo, show.photo) && Objects.equals(phone, show.phone) && Objects.equals(overtime_type, show.overtime_type) && Objects.equals(kind, show.kind) && Objects.equals(level, show.level) && Objects.equals(department, show.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, photo, age, phone, month, days, salary, overtime_type, overtime_days, subsidy, kind, level, department, basic_salary);
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", month=" + month +
                ", days=" + days +
                ", salary=" + salary +
                ", overtime_type='" + overtime_type + '\'' +
                ", overtime_days=" + overtime_days +
                ", subsidy=" + subsidy +
                ", kind='" + kind + '\'' +
                ", level='" + level + '\'' +
                ", department='" + department + '\'' +
                ", basic_salary=" + basic_salary +
                '}';
    }
}
