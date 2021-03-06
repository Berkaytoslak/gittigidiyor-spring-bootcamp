package dev.patika.patika0401.service;

import dev.patika.patika0401.dto.CustomerDTO;
import dev.patika.patika0401.exceptions.BadRequestException;
import dev.patika.patika0401.mappers.CustomerMapper;
import dev.patika.patika0401.model.Customer;
import dev.patika.patika0401.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @Mock
    CustomerRepository mockCustomerRepository;

    @Mock
    CustomerMapper mockCustomerMapper;

    @InjectMocks
    CustomerService customerService;


    @Test
    void saveCustomer() {
        // given
        Customer customer = new Customer();
        when(mockCustomerRepository.selectExistsSsid(anyLong())).thenReturn(Boolean.FALSE);
        when(mockCustomerMapper.mapFromCustomerDTOtoCustomer(any())).thenReturn(customer);
        when(mockCustomerRepository.save(any())).thenReturn(customer);

        // when
        CustomerDTO dto = new CustomerDTO();
        Customer actual = this.customerService.saveCustomer(dto).get();

        // then
        assertAll(
                () -> assertNotNull(actual),
                () -> assertEquals(customer, actual),
                () -> assertEquals(customer.getSsid(), actual.getSsid())
        );
    }

    @Test
    void saveCustomer2() {
        // given
        Customer customer = new Customer();
        when(mockCustomerRepository.selectExistsSsid(anyLong())).thenReturn(Boolean.TRUE);

        // when
        CustomerDTO dto = new CustomerDTO();
        Executable executable =  () -> this.customerService.saveCustomer(dto).get();

        // then
        assertThrows(BadRequestException.class, executable);
    }
}