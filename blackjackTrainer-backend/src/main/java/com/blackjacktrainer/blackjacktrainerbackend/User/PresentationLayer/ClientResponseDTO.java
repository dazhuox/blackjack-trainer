package com.blackjacktrainer.blackjacktrainerbackend.User.PresentationLayer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientResponseDTO {

    private String clientId;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
