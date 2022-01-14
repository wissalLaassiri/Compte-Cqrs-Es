package org.enset.comptecqrses.mappers;

import com.enset.cqrseventsourcingapp.queries.dto.AccountOperationResponseDTO;
import com.enset.cqrseventsourcingapp.queries.dto.BankAccountResponseDTO;
import com.enset.cqrseventsourcingapp.queries.entities.AccountOperation;
import com.enset.cqrseventsourcingapp.queries.entities.BankAccount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {
    BankAccountResponseDTO bankAccountToBankAccountDTO(BankAccount bankAccount);
    AccountOperationResponseDTO accountOperationToAccountOperationDTO(AccountOperation accountOperation);
}
