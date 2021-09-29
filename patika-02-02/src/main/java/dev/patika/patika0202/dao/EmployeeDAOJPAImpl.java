package dev.patika.patika0202.dao;

import dev.patika.patika0202.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO<Employee> {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOJPAImpl.class);
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        return entityManager.createQuery("FROM Employee e", Employee.class).getResultList();
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Employee employee = this.findById(id);

        if(employee == null){
            logger.error("There is no employee with id : " + id);
        }

        entityManager.remove(employee);
    }

    @Override
    @Transactional
    public Employee update(Employee employee) {
        return entityManager.merge(employee);
    }
}
