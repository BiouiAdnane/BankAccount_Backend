package bankaccount.com.backend_bankaccount.Entities;

import bankaccount.com.backend_bankaccount.Enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    private LocalDateTime transactionDate;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @ManyToOne
    @JoinColumn(name = "source_account_rib")
    private BankAccount sourceAccount;


    @ManyToOne
    @JoinColumn(name = "destination_account_rib")
    private BankAccount destinationAccount;
}