package dev.patika.patika0601.repository;

import dev.patika.patika0601.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT " +
            "  CASE " +
            "   WHEN " +
            "       COUNT(e)>0 " +
            "   THEN " +
            "       TRUE " +
            "   ELSE " +
            "       FALSE " +
            "   END " +
            "FROM Employee e " +
            "WHERE e.email = ?1")
    boolean existsByEmail(String email);

    @Query("SELECT " +
            "  CASE " +
            "   WHEN " +
            "       COUNT(e)>0 " +
            "   THEN " +
            "       TRUE " +
            "   ELSE " +
            "       FALSE " +
            "   END " +
            "FROM Employee e " +
            "WHERE e.id = ?1")
    boolean existsById(Long id);

}
