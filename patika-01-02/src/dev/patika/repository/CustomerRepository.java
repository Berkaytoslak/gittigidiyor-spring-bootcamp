package dev.patika.repository;

import dev.patika.models.Customer;
import dev.patika.models.Vehicle;

import java.util.List;

public interface CustomerRepository {
    void deleteCustomerFromDatabase(long ssid);
    List<Vehicle> findVehiclesOfCustomer(long ssid);


}
