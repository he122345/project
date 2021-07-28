package com.SALARY.domain;

import java.util.Objects;

public class Message {
    private int id;
    private String name;
    private String photo;
    private int age;
    private String phone;

    public Message() {
    }

    public Message(int id, String name, String photo, int age, String phone) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.age = age;
        this.phone = phone;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Message message = (Message) o;
        return id == message.id && age == message.age && name.equals(message.name) && photo.equals(message.photo) && phone.equals(message.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, photo, age, phone);
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
