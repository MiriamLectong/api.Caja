package ec.edu.espam.api.Caja.repository;

import ec.edu.espam.api.Caja.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
