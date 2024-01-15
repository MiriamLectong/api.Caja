package ec.edu.espam.api.Caja.domain;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@MappedSuperclass
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "DNI")
    @NotEmpty(message = "DNI is required")
    private String dni;

    @Column(name = "Name")
    @NotEmpty(message = "Name is required")
    private String name;

    @Column(name = "Gender")
    @NotEmpty(message = "Gender is required")
    private String gender;

    @Column(name = "Address")
    @NotEmpty(message = "Address is required")
    private String address;

    @Column(name = "Phone")
    @NotEmpty(message = "Phone number is required")
    private String phone;

    @Column(name = "Age")
    @NotNull(message = "Age is required")
    private Integer age;
}
