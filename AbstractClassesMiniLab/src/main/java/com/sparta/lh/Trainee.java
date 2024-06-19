package com.sparta.lh;

public abstract class Trainee implements Trainable {
    private String name;
    private int age;
    private String email;
    private String phone;

    private String experience;
    private String certifications;
    private String projects;

    public Trainee(String name, int age, String email, String phone, String experience, String certifications, String projects) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;

        this.experience = experience;
        this.certifications = certifications;
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    @Override
    public void train() {
        System.out.println(this.name + " is training.");
    }

    @Override
    public void study() {
        System.out.println(this.name + " is studying.");
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", experience='" + experience + '\'' +
                ", certifications='" + certifications + '\'' +
                ", projects='" + projects + '\'';
    }
}
