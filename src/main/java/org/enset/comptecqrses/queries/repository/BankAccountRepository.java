package org.enset.comptecqrses.queries.repository;

import com.enset.cqrseventsourcingapp.queries.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
