package com.blackjacktrainer.blackjacktrainerbackend.User.DataMapperLayer;

import com.blackjacktrainer.blackjacktrainerbackend.User.DataLayer.Client;
import com.blackjacktrainer.blackjacktrainerbackend.User.PresentationLayer.ClientResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientResponseMapper {
    @Mapping(source = "clientId", target = "clientId")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "phoneNumber", target = "phoneNumber")

    ClientResponseDTO entityToResponseModel(Client client);

//    List<ClientResponseDTO> entityListToResponseModelList(List<Client> clients);
}
