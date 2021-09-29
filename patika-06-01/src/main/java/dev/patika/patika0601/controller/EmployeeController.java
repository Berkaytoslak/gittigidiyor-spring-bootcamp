package dev.patika.patika0601.controller;

import dev.patika.patika0601.model.Employee;
import dev.patika.patika0601.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employees")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return service.getAllEmployees();
    }

    @PostMapping
    public void addEmployee(@Valid @RequestBody Employee employee){
        service.addEmployee(employee);
    }

    @DeleteMapping(path = "{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") Long employeeId){
        service.deleteEmployee(employeeId);
    }

}
