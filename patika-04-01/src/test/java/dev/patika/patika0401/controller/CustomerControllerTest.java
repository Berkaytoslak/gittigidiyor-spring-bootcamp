package dev.patika.patika0401.controller;

import dev.patika.patika0401.dto.CustomerDTO;
import dev.patika.patika0401.model.Customer;
import dev.patika.patika0401.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CustomerControllerTest {

    @Mock
    CustomerService mockCustomerService;

    @InjectMocks
    CustomerController customerController;

    @Test
    void saveCustomer() {
        // given
        Customer customer = new Customer();
        customer.setSsid(11111L);
        Optional<Customer> expected = Optional.of(customer);
        when(mockCustomerService.saveCustomer(any())).thenReturn(expected);

        // when
        CustomerDTO dto = new CustomerDTO();
        Customer actual = this.customerController.saveCustomer(dto).getBody();

        // then
        assertAll(
                () -> assertNotNull(actual),
                () -> assertEquals(expected.get(), actual),
                () -> assertEquals(customer.getSsid(), actual.getSsid())
        );
    }


    @Test
    void saveCustomer2() {
        // given
        when(mockCustomerService.saveCustomer(any())).thenReturn(Optional.empty());

        // when
        CustomerDTO dto = new CustomerDTO();
        ResponseEntity<Customer> actual = this.customerController.saveCustomer(dto);

        // then
        assertEquals(HttpStatus.BAD_REQUEST, actual.getStatusCode());
    }
}