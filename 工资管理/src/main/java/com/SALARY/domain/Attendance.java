package com.SALARY.domain;

import java.util.Objects;

public class Attendance {
    private int id;
    private int month;
    private int days;

    public Attendance() {
    }

    public Attendance(int id, int month, int days) {
        this.id = id;
        this.month = month;
        this.days = days;
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

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attendance that = (Attendance) o;
        return id == that.id && month == that.month && days == that.days;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, month, days);
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", month=" + month +
                ", days=" + days +
                '}';
    }
}
