package com.deloitte.joshi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.joshi.models.Transaction;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    // TODO Limit to recent transactions and implement separate endpoint to view old transactions
    List<Transaction> findBySourceAccountIdOrderByInitiationDate(long id);
}
