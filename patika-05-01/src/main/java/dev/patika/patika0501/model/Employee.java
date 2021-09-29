package dev.patika.patika0501.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Employee {
    @Id
    private String id;
    private String fullName;
    private int age;
    private double salary;
    private List<Course> courses = new ArrayList<>();
    private Gender gender;
    @Indexed(unique = true)
    private long ssid;

    public enum Gender{
        MALE, FEMALE;
    }

    public Employee(String fullName, int age, double salary, List<Course> courses, Gender gender, long ssid) {
        this.fullName = fullName;
        this.age = age;
        this.salary = salary;
        this.courses = courses;
        this.gender = gender;
        this.ssid = ssid;
    }
}
