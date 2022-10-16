package com.deloitte.joshi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.joshi.models.Account;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findBySortCodeAndAccountNumber(String sortCode, String accountNumber);
    Optional<Account> findByAccountNumber(String accountNumber);
}
