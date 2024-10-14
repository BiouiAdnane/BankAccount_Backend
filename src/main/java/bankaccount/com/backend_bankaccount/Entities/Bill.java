package bankaccount.com.backend_bankaccount.Entities;

import bankaccount.com.backend_bankaccount.Enums.BillType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String billName;
    private double amount;
    private String description;
    private LocalDateTime dueDate;
    private BillType billType;

    @ManyToOne
    private BankAccount bankAccount;

}