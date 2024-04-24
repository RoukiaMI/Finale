package com.qcmplus.projet.Controller;

import com.qcmplus.projet.Entity.ResponsesEntity;
import com.qcmplus.projet.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.qcmplus.projet.Service.UserService;

@RestController
@RequestMapping("/api/v0")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users/connect")
    public ResponseEntity<UserEntity> checkUserExists(@RequestBody UserEntity user) {
        if (userService.checkIfUserExists(user.getUsername(),user.getPassword()).getRole().equals("stagiaire")) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
