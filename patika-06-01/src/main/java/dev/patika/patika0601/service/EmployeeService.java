package dev.patika.patika0601.service;

import dev.patika.patika0601.exceptions.EmployeeExistException;
import dev.patika.patika0601.model.Employee;
import dev.patika.patika0601.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeRepository repository;

    public List<Employee> getAllEmployees(){
        return repository.findAll();
    }

    public void addEmployee(Employee employee) {
        boolean isExists = repository.existsByEmail(employee.getEmail());
        if(isExists){
            throw new EmployeeExistException("Employee with email: " + employee.getEmail() + " is already exists!");
        }
        repository.save(employee);
    }

    public void deleteEmployee(Long employeeId) {
        boolean isExists = repository.existsById(employeeId);
        if(isExists){
            repository.deleteById(employeeId);
        }
        else{
            throw new EmployeeExistException("Employee with id: " + employeeId + " is not exists!");
        }

    }
}
