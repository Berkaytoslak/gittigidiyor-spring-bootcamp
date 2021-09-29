package dev.patika.patika0601.service;

import dev.patika.patika0601.model.Employee;
import dev.patika.patika0601.model.Gender;
import dev.patika.patika0601.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockingDetails;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    EmployeeRepository repository;

    @InjectMocks
    EmployeeService service;

    @Test
    void getAllEmployees() {
        // given
        Mockito.when(repository.findAll()).thenReturn(Collections.singletonList(
                new Employee("Koray", "k@g.com", Gender.MALE)
        ));

        // when
        List<Employee> expected = service.getAllEmployees();

        // then
        assertEquals(expected.get(0).getGender(), Gender.MALE);
    }
}