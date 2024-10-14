package bankaccount.com.backend_bankaccount.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class BankAccount {
    @Id
    private String accountRIB;
    private double balance;
    private String openingDate;

    @ManyToOne
    private AccountType accountType;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "sourceAccount", cascade = CascadeType.ALL)
    private List<Transaction> outgoingTransactions;

    @OneToMany(mappedBy = "destinationAccount", cascade = CascadeType.ALL)
    private List<Transaction> incomingTransactions;

    @OneToMany(mappedBy = "bankAccount", cascade = CascadeType.ALL)
    private List<Bill> billList;

}
