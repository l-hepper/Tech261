package com.sparta.lh;

public class DevOpsTrainee extends Trainee {
    public DevOpsTrainee(String name, int age, String email, String phone, String experience, String certifications, String projects) {
        super(name, age, email, phone, experience, certifications, projects);
    }

    @Override
    public String toString() {
        return "DevOpsTrainee {" + super.toString() + "}";
    }
}
