package com.SALARY.domain;

import java.util.Objects;

public class Subsidy {
    private int id;
    private String overtime_type;
    private int overtime_days;
    private int subsidy;

    public Subsidy() {
    }

    public Subsidy(int id, String overtime_type, int overtime_days, int subsidy) {
        this.id = id;
        this.overtime_type = overtime_type;
        this.overtime_days = overtime_days;
        this.subsidy = subsidy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subsidy subsidy1 = (Subsidy) o;
        return id == subsidy1.id && overtime_days == subsidy1.overtime_days && subsidy == subsidy1.subsidy && Objects.equals(overtime_type, subsidy1.overtime_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, overtime_type, overtime_days, subsidy);
    }

    @Override
    public String toString() {
        return "Subsidy{" +
                "id=" + id +
                ", overtime_type='" + overtime_type + '\'' +
                ", overtime_days=" + overtime_days +
                ", subsidy=" + subsidy +
                '}';
    }
}
