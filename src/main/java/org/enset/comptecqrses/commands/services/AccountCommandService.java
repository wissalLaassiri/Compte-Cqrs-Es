package org.enset.comptecqrses.commands.services;

import com.enset.cqrseventsourcingapp.commands.dto.CreateAccountRequestDTO;
import com.enset.cqrseventsourcingapp.commands.dto.CreditAccountRequestDTO;
import com.enset.cqrseventsourcingapp.commands.dto.DebitAccountRequestDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {
    CompletableFuture<String> createAccount(CreateAccountRequestDTO accountRequestDTO);
    CompletableFuture<String> debitAccount(DebitAccountRequestDTO debitAccountRequestDTO);
    CompletableFuture<String> creditAccount(CreditAccountRequestDTO creditAccountRequestDTO);
}
