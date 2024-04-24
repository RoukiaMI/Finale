package com.qcmplus.projet.Service;

import com.qcmplus.projet.Entity.QcmEntity;
import com.qcmplus.projet.Entity.QuestionsEntity;
import com.qcmplus.projet.Repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionsService {

    @Autowired
    private QuestionsRepository repo;

    /**
     * Renvoie la liste des qcm dispo dans la table
     **/
    public List<QuestionsEntity> getAllQcm(){
        ArrayList<QuestionsEntity> questions= new ArrayList<>();
        questions = (ArrayList<QuestionsEntity>) repo.findAll();
        return questions;
    }
}
