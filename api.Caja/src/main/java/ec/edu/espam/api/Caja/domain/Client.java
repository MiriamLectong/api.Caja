package ec.edu.espam.api.Caja.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "client")
public class Client extends Person {
    @Column(name = "Password")
    @NotEmpty(message = "Password is required")
    @Size(min = 4, message = "Clave debe contener al menos 4 caracteres")
    private String password;

    @Column(name = "State")
    @NotNull(message = "State is required")
    private Boolean state;

}
