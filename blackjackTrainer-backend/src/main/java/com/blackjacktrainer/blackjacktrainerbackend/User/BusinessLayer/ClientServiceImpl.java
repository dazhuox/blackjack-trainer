package com.blackjacktrainer.blackjacktrainerbackend.User.BusinessLayer;

import com.blackjacktrainer.blackjacktrainerbackend.User.DataLayer.Client;
import com.blackjacktrainer.blackjacktrainerbackend.User.DataLayer.ClientRepository;
import com.blackjacktrainer.blackjacktrainerbackend.User.DataMapperLayer.ClientRequestMapper;
import com.blackjacktrainer.blackjacktrainerbackend.User.DataMapperLayer.ClientResponseMapper;
import com.blackjacktrainer.blackjacktrainerbackend.User.PresentationLayer.ClientRequestDTO;
import com.blackjacktrainer.blackjacktrainerbackend.User.PresentationLayer.ClientResponseDTO;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientResponseMapper clientResponseMapper;
    private final ClientRequestMapper clientRequestMapper;

    public ClientServiceImpl(ClientRepository clientRepository, ClientResponseMapper clientResponseMapper, ClientRequestMapper clientRequestMapper) {
        this.clientRepository = clientRepository;
        this.clientResponseMapper = clientResponseMapper;
        this.clientRequestMapper = clientRequestMapper;
    }


    @Override
    public ClientResponseDTO getClientById(String id) {
        log.info("Fetching client with ID: {}", id);
        Client client = clientRepository.findClientByClientId(id);
        if (client == null) {
            log.warn("Client with ID: {} not found", id);
            return null;
        }
        return clientResponseMapper.entityToResponseModel(client);
    }

    @Transactional
    @Override
    public void deleteClientById(String id) {
        clientRepository.deleteByClientId(id);
    }
}
