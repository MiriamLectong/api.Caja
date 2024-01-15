package ec.edu.espam.api.Caja.services.Impl;

import ec.edu.espam.api.Caja.domain.Account;
import ec.edu.espam.api.Caja.repository.AccountRepository;
import ec.edu.espam.api.Caja.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account update(Long id, Account account) {
        Account existAccount = accountRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Not found account with the id: " + id));

        existAccount.setNumber(account.getNumber());
        existAccount.setType(account.getType());
        existAccount.setInitialBalance(account.getInitialBalance());
        existAccount.setAmount(account.getAmount());
        existAccount.setState(account.getState());

        return accountRepository.save(existAccount);
    }
}
