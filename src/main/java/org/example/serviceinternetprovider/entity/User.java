package org.example.serviceinternetprovider.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    private int age;
    private double balance;

    public User(String login, String password, int age, double balance) {
        this.login = login;
        this.password = password;
        this.age = age;
        this.balance = balance;
    }



}
