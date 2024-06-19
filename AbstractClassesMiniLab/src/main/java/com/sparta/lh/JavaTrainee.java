package com.sparta.lh;

public class JavaTrainee extends Trainee {

    private String github;

    public JavaTrainee(String name, int age, String email, String phone, String experience, String certifications, String projects, String github) {
        super(name, age, email, phone, experience, certifications, projects);
        this.github = github;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Override
    public String toString() {
        return "JavaTrainee {" + super.toString() + " " +
                "github='" + github + '\'' +
                '}';
    }
}
