package com.qcmplus.projet.Repository;

import com.qcmplus.projet.Entity.QcmEntity;
import com.qcmplus.projet.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface QcmRepository  extends JpaRepository<QcmEntity, Long> {


    Optional<QcmEntity> findById(long id);

    @Override
    List<QcmEntity> findAll();
}
