package ec.edu.espam.api.Caja.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Number")
    @NotEmpty(message = "Number is required")
    private String number;

    @Column(name = "type")
    @NotNull(message = "Type account is required")
    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(name = "Initial_Balance")
    @NotNull(message = "Initial balance is required")
    private BigDecimal initialBalance;

    @Column(name = "Amount")
    @NotNull(message = "Amount is required")
    private BigDecimal amount;

    @Column(name = "State")
    @NotNull(message = "State is required")
    private Boolean state;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @OneToMany(mappedBy = "account")
    private List<Movement> movements;*/

    public enum Type {
        SAVING, CURRENT
    }
}
