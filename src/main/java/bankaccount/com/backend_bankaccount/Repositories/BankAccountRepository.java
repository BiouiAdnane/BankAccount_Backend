package bankaccount.com.backend_bankaccount.Repositories;

import bankaccount.com.backend_bankaccount.Entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
