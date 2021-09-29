package dev.patika.patika0601.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @SequenceGenerator(sequenceName = "employee_sequence", name = "employee_sequence", allocationSize = 1, initialValue = 51)
    @GeneratedValue(generator = "employee_sequence",strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotBlank
    @Column(nullable = false)
    private String name;
    @NotBlank
    @Email
    @Column(nullable = false)
    private String email;
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    public Employee(@NotBlank String name, @NotBlank @Email String email, @NotNull Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}
