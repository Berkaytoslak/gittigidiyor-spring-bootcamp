package dev.patika.patika0501.controller;

import dev.patika.patika0501.model.Employee;
import dev.patika.patika0501.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    @GetMapping
    public List<Employee> findAllEmployees(){
        return service.getAllEmployees();
    }


}
