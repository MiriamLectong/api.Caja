package ec.edu.espam.api.Caja.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity(name = "movement")
public class Movement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Date")
    @NotNull(message = "Date is required")
    private LocalDate date;

    @Column(name = "Type")
    @NotNull(message = "Type is required")
    @Enumerated(EnumType.STRING)
    private TypeMovement type;

    @Column(name = "Amount")
    @NotNull(message = "Amount is required")
    private BigDecimal amount;

    @Column(name = "Balance")
    @NotNull(message = "Balance is required")
    private BigDecimal balance;

    public enum TypeMovement {
        DEBIT, CREDIT;
    }
}
