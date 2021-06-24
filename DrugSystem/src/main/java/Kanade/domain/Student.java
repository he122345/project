package Kanade.domain;

public class Student {
    int student_id;
    String s_name;
    String s_sex;
    int s_age;
    String s_number;

    public Student() {
    }

    public Student(int student_id, String s_name, String s_sex, int s_age, String s_number) {
        this.student_id = student_id;
        this.s_name = s_name;
        this.s_sex = s_sex;
        this.s_age = s_age;
        this.s_number = s_number;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public int getS_age() {
        return s_age;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }

    public String getS_number() {
        return s_number;
    }

    public void setS_number(String s_number) {
        this.s_number = s_number;
    }

    @Override
    public String toString() {
        return "student{" +
                "student_id=" + student_id +
                ", s_name='" + s_name + '\'' +
                ", s_sex='" + s_sex + '\'' +
                ", s_age=" + s_age +
                ", s_number=" + s_number +
                '}';
    }
}
