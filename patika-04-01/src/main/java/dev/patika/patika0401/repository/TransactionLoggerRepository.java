package dev.patika.patika0401.repository;

import dev.patika.patika0401.model.WalletServiceTransactionLogger;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TransactionLoggerRepository extends PagingAndSortingRepository<WalletServiceTransactionLogger, Long> {
    @Query("SELECT w FROM WalletServiceTransactionLogger w WHERE w.transactionDateTime= ?1")
    Page<List<WalletServiceTransactionLogger>> findAllTransactionByTransactionDate(LocalDate transactionDate, Pageable pageable);
}
