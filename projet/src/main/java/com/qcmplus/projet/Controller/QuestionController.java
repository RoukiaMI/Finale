package com.qcmplus.projet.Controller;


import com.qcmplus.projet.Entity.QuestionsEntity;
import com.qcmplus.projet.Service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
@RequestMapping("/api/v0")
public class QuestionController {

    @Autowired
    private QuestionsService service;

    @GetMapping("/questions/get")
    @ResponseStatus(value = HttpStatus.OK)
    public ArrayList<QuestionsEntity> getAllQcm() {
        return (ArrayList<QuestionsEntity>) service.getAllQcm();
    }
}
