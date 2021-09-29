package dev.patika.patika0401.mappers;

import dev.patika.patika0401.dto.WalletDTO;
import dev.patika.patika0401.model.Wallet;
import dev.patika.patika0401.service.WalletService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class WalletMapper {

    @Autowired
    protected WalletService walletService;

    @Mapping(target = "customer", expression = "java(walletService.findCustomerById(walletDTO.getCustomerId()))")
    @Mapping(target = "createDate", expression = "java(java.time.LocalDate.now())")
    public abstract Wallet mapFromWalletDTOtoWallet(WalletDTO walletDTO);
    public abstract WalletDTO mapFromWallettoWalletDTO(Wallet wallet);

}
