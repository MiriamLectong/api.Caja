package ec.edu.espam.api.Caja.services;

import ec.edu.espam.api.Caja.domain.Account;

import java.util.List;
public interface AccountService {
    List<Account> getAll();

    Account save(Account account);
    Account update(Long id, Account account);
}
