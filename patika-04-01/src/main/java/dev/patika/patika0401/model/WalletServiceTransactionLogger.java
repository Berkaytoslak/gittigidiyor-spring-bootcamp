package dev.patika.patika0401.model;

import dev.patika.patika0401.model.enumeration.Currency;
import dev.patika.patika0401.model.enumeration.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class WalletServiceTransactionLogger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private double balanceBefore;
    private double balanceAfter;
    private double transactionAmount;
    @Enumerated(EnumType.STRING)
    private Currency transactionCurrency;
    private LocalDate transactionDateTime;
    private String clientIpAdress;
    private String clientUrl;
    private String sessionActivityId;
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
}
