package com.blackjacktrainer.blackjacktrainerbackend.User.BusinessLayer;

import com.blackjacktrainer.blackjacktrainerbackend.User.PresentationLayer.ClientResponseDTO;

public interface ClientService {
    ClientResponseDTO getClientById(String id);
}
