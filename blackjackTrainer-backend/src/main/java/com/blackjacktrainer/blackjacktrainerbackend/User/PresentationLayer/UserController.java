package com.blackjacktrainer.blackjacktrainerbackend.User.PresentationLayer;

import com.blackjacktrainer.blackjacktrainerbackend.User.BusinessLayer.ClientService;
import com.blackjacktrainer.blackjacktrainerbackend.User.DataLayer.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
//@CrossOrigin(origins = "http://localhost:3000",allowCredentials = "false", allowedHeaders = {"xsrf-token", "content-type"})
@RequestMapping("users")
public class UserController {

    private ClientService clientService;

    public UserController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients/{clientId}")
    public ResponseEntity<ClientResponseDTO> getClientById(@PathVariable String clientId) {
        log.info("Received request to get client by ID: {}", clientId);
        ClientResponseDTO clientResponseDTO = clientService.getClientById(clientId);
        if (clientResponseDTO == null) {
            log.warn("Client with ID: {} not found", clientId);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(clientResponseDTO);
    }
    @DeleteMapping("/clients/{clientId}")
    public ResponseEntity<Void> deleteAppointment(@PathVariable String clientId) {
        clientService.deleteClientById(clientId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/data")
    public String getData() {
        return "This is a GET request response";
    }
}