package com.blackjacktrainer.blackjacktrainerbackend.User.DataLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findClientByClientId(String clientId);
}
