package bankaccount.com.backend_bankaccount.Repositories;

import bankaccount.com.backend_bankaccount.Entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Long> {
}
