package in.aashu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
@Entity
@XmlRootElement

@Data
public class Customer {
    @Id
    private Integer id;
    private String name;
    private String email;
    private String gender;
}
