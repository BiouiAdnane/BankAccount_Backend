package bankaccount.com.backend_bankaccount.Repositories;

import bankaccount.com.backend_bankaccount.Entities.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTypeRepository extends JpaRepository<AccountType,Long> {
}
