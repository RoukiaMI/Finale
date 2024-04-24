package com.qcmplus.projet.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.qcmplus.projet.Entity.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);

    // Vous pouvez ajouter d'autres méthodes de recherche personnalisées si nécessaire
}

