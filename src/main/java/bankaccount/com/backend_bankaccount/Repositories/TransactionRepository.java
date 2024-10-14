package bankaccount.com.backend_bankaccount.Repositories;

import bankaccount.com.backend_bankaccount.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
