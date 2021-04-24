package com.company;


public class Student {
    private Integer id;
    private String name;
    private double averageGrade;
    private Integer age;
    private String gender;

    public Student(){}

    public Student(Integer id, String name, double averageGrade, Integer age, String gender) {
        this.id = id;
        this.name = name;
        this.averageGrade = averageGrade;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setFullName(String name) {
        this.name = name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
