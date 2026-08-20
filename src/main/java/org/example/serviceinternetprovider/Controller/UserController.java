package org.example.serviceinternetprovider.Controller;

import org.example.serviceinternetprovider.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody User user) {

        System.out.println("Получен новый пользователь: " + user);

        return ResponseEntity.ok().build();
    }
}

