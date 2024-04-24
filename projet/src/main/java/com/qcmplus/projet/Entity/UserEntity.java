package com.qcmplus.projet.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
public class UserEntity {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Getter @Setter(AccessLevel.PROTECTED) private String username;
    @Getter @Setter(AccessLevel.PROTECTED) private String password;
    /**
     * role equal stagiaire or admin
     * */
    @Getter @Setter(AccessLevel.PROTECTED) private String role;
    
    public UserEntity() {
        this.username = "";
        this.password = "";
        this.role = "";
    }
    
    public UserEntity(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    // autres attributs...
    
  
    // Getters et setters
    // Constructeurs
}


