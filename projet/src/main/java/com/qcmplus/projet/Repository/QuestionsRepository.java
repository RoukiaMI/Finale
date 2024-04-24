package com.qcmplus.projet.Repository;

import com.qcmplus.projet.Entity.QcmEntity;
import com.qcmplus.projet.Entity.QuestionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionsRepository extends JpaRepository<QuestionsEntity, Long> {



    @Override
    List<QuestionsEntity> findAll();
}
