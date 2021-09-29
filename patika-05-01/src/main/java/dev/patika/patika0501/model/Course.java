package dev.patika.patika0501.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Course {

    private String courseName;
    private LocalDate courseFinishDate;

}
