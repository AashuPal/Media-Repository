package in.aashu.restapi;

import in.aashu.entity.Customer;
import in.aashu.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerApi {
    @Autowired
    private CustomerRepository customerRepository;

@GetMapping(
        value = "/customer",
        produces = { "application/json", "application/xml" } // Specify the media types you want to support
)
    public List<Customer> getCustomer(){
    List<Customer> customerList = customerRepository.findAll();
        if (customerList.isEmpty()) {
            return null; // or throw an exception
        }

        return customerList;
    }

    @PostMapping(
            value = "/customer",
            consumes = { "application/json", "application/xml-dtd" }, // Specify the media types you want to support
            produces = { "application/json", "application/xml-dtd" } // Specify the media types you want to support
    )
    public ResponseEntity<String> addCustomer(@RequestBody List<Customer> customers) {
        // Here you would typically save the customer to a database
        customerRepository.saveAll(customers);



        return new ResponseEntity<>("Customers added successfully", HttpStatus.CREATED);
    }
}
