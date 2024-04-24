package com.qcmplus.projet.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qcmplus.projet.Entity.UserEntity;
import com.qcmplus.projet.Repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity checkIfUserExists(String username,String password) {
        Optional<UserEntity> user = userRepository.findByUsername(username);
        UserEntity sendedUser=new UserEntity();
        if(user.isPresent()){
            if(user.get().getPassword().equals(password)){
                sendedUser=user.get();
            }
        }
        return sendedUser; // true si l'utilisateur existe, sinon false
    }
}
