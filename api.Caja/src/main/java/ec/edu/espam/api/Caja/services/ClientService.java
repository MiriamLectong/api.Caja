package ec.edu.espam.api.Caja.services;

import ec.edu.espam.api.Caja.domain.Client;
import ec.edu.espam.api.Caja.domain.dto.ClientDto;

import java.util.List;
public interface ClientService {
    List<Client> getAll();

    Client save(Client client);
}
