package com.blackjacktrainer.blackjacktrainerbackend.User.DataMapperLayer;

import com.blackjacktrainer.blackjacktrainerbackend.User.DataLayer.Client;
import com.blackjacktrainer.blackjacktrainerbackend.User.PresentationLayer.ClientRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface ClientRequestMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "clientId", ignore = true)
    @Mapping(source = "username", target = "username")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "phoneNumber", target = "phoneNumber")

    Client requestModelToEntity(ClientRequestDTO clientRequestDTO);
}
