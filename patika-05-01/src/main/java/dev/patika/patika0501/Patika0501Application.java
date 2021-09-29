package dev.patika.patika0501;

import dev.patika.patika0501.model.Course;
import dev.patika.patika0501.model.Employee;
import dev.patika.patika0501.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Slf4j
public class Patika0501Application {

    public static void main(String[] args) {
        SpringApplication.run(Patika0501Application.class, args);
    }

    @Bean
    CommandLineRunner runner(EmployeeRepository repository, MongoTemplate template) {
        return args -> {
            Employee employee1 = new Employee("Ali Veli",
                    28, 45454,
                    Arrays.asList(
                            new Course("Math", LocalDate.of(2020, 03, 03)),
                            new Course("DevOps", LocalDate.of(2018, 03, 03)),
                            new Course("Cyber Security", LocalDate.of(2019, 04, 9))
                    ),
                    Employee.Gender.MALE,
                    2222222222L);

            if(repository.findEmployeeBySsid(employee1.getSsid()).isPresent()){
                log.info("Employee with SSID " + employee1.getSsid()+ " is already exists!");
            } else {
                log.info("Employee saved :" + employee1);
                repository.insert(employee1);
            }

            if(repository.findEmployeeByFullNameAndAge("Koray Guney",37).size() > 0) {
                log.info("Employee found" );
            }

            /*
            Query query = new Query();
            query.addCriteria(Criteria.where("ssid").is(employee1.getSsid()));

            List<Employee> employees = template.find(query, Employee.class);
            for (Employee employee : employees) {
                log.info(String.valueOf(employee));
            }

            if(employees.isEmpty()){
                log.info("Employee saved :" + employee1);
                repository.insert(employee1);
            } else {
                log.info("Employee with SSID " + employee1.getSsid()+ " is already exists!");
            }
             */

        };
    }

}
