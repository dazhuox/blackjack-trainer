package com.blackjacktrainer.blackjacktrainerbackend.User.PresentationLayer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequestDTO {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public static String generateUUIDString(){
        return UUID.randomUUID().toString();
    }

}
