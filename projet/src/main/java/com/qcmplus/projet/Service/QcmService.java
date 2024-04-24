package com.qcmplus.projet.Service;

import com.qcmplus.projet.Entity.QcmEntity;
import com.qcmplus.projet.Entity.UserEntity;
import com.qcmplus.projet.Repository.QcmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QcmService {

    @Autowired
    private QcmRepository qcmRepository;

    /**
     * Renvoie un questionnaire si ça existe
     **/
    public QcmEntity checkIfQcmExists(long id) {
        QcmEntity finalObject= new QcmEntity();
        Optional<QcmEntity> user = qcmRepository.findById(id);
        if (user.isPresent()) {
            finalObject.setId(user.get().getId());
            finalObject.setIntitule(user.get().getIntitule());
            finalObject.setNiveau(user.get().getNiveau());
            finalObject.setNbQuestions(user.get().getNbQuestions());
            finalObject.setQuestions(user.get().getQuestions());// true si l'utilisateur existe, sinon false
        }
        return finalObject;
    }

    /**
     * Renvoie la liste des qcm dispo dans la table
     **/
    public List<QcmEntity> getAllQcm(){
        ArrayList<QcmEntity> qcms= new ArrayList<>();
        qcms = (ArrayList<QcmEntity>) qcmRepository.findAll();
        return qcms;
    }
}
