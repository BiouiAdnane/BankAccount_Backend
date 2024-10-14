package bankaccount.com.backend_bankaccount.Repositories;

import bankaccount.com.backend_bankaccount.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
