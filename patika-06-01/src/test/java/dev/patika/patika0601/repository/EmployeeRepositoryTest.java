package dev.patika.patika0601.repository;

import dev.patika.patika0601.model.Employee;
import dev.patika.patika0601.model.Gender;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository repository;

    @AfterEach
    public void tearDown(){
        repository.deleteAll();
    }

    @Test
    void shouldCheckWhenEmployeeEmailIsExists() {
        // given
        Employee employee = new Employee("Koray", "k@g.com", Gender.MALE);
        repository.save(employee);

        // when
        boolean expected = repository.existsByEmail(employee.getEmail());

        // then
        assertTrue(expected);
    }

    @Test
    void shouldCheckWhenEmployeeEmailIsNotExists() {
        // given
        Employee employee = new Employee("Koray", "k@g.com", Gender.MALE);
        //repository.save(employee);

        // when
        boolean expected = repository.existsByEmail(employee.getEmail());

        // then
        assertFalse(expected);
    }

    @Test
    void existsById() {
    }
}