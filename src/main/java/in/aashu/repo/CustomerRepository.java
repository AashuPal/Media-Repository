package in.aashu.repo;

import in.aashu.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // Custom query methods can be defined here if needed
    // For example:
    // List<Customer> findByName(String name);
}
