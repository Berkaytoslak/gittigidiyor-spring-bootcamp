package dev.patika.patika0304.controller;

import dev.patika.patika0304.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
@RequestMapping("/api")
public class EmployeeController {

    private List<Employee> employeeList;
    private AtomicInteger atomicInteger = new AtomicInteger(0);


    @PostConstruct
    private void loadData(){
        List<String> courses = new ArrayList<>();
        courses.add("A");
        courses.add("B");
        courses.add("C");
        employeeList = Arrays.asList(
                new Employee(atomicInteger.incrementAndGet(),"Ali Veli", 36, 4343.32, courses),
                new Employee(atomicInteger.incrementAndGet(),"Ayşe Kaya", 26, 4643.32, courses),
                new Employee(atomicInteger.incrementAndGet(),"Hasan Huseyin", 45, 6743.32, courses)
        );
    }

    @GetMapping("/employees")
    public String listOfEmployees(Model theModel){
        theModel.addAttribute("employees", employeeList);
        return "employees";
    }

}
