package ec.edu.espam.api.Caja.services.Impl;

import ec.edu.espam.api.Caja.domain.Account;
import ec.edu.espam.api.Caja.domain.Client;
import ec.edu.espam.api.Caja.services.ClientService;
import ec.edu.espam.api.Caja.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }
}
