package Kanade.domain;

public class Doctor {
    int doctor_id;
    String d_name;
    String d_sex;
    int d_age;
    String d_keshi;
    String d_number;

    public Doctor() {
    }

    public Doctor(int doctor_id, String d_name, String d_sex, int d_age, String d_keshi, String d_number) {
        this.doctor_id = doctor_id;
        this.d_name = d_name;
        this.d_sex = d_sex;
        this.d_age = d_age;
        this.d_keshi = d_keshi;
        this.d_number = d_number;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_sex() {
        return d_sex;
    }

    public void setD_sex(String d_sex) {
        this.d_sex = d_sex;
    }

    public int getD_age() {
        return d_age;
    }

    public void setD_age(int d_age) {
        this.d_age = d_age;
    }

    public String getD_keshi() {
        return d_keshi;
    }

    public void setD_keshi(String d_keshi) {
        this.d_keshi = d_keshi;
    }

    public String getD_number() {
        return d_number;
    }

    public void setD_number(String d_number) {
        this.d_number = d_number;
    }

    @Override
    public String toString() {
        return "doctor{" +
                "doctor_id=" + doctor_id +
                ", d_name='" + d_name + '\'' +
                ", d_sex='" + d_sex + '\'' +
                ", d_age=" + d_age +
                ", d_keshi='" + d_keshi + '\'' +
                ", d_number=" + d_number +
                '}';
    }
}
