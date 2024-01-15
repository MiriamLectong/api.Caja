package ec.edu.espam.api.Caja.repository;

import ec.edu.espam.api.Caja.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
