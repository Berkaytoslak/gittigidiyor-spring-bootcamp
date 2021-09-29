package dev.patika.patika0501.repository;

import dev.patika.patika0501.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Optional<Employee> findEmployeeBySsid(long ssid);

    @Query("{'fullName' : ?0 , 'age' : ?1}")
    List<Employee> findEmployeeByFullNameAndAge(String fullName, int age);
}
