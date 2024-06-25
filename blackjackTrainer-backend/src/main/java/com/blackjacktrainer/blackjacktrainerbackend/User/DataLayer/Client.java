package com.blackjacktrainer.blackjacktrainerbackend.User.DataLayer;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public String clientId;
    public String firstName;
    public String lastName;
    public String email;
    public String phoneNumber;
    public String address;
    public double height;
}
