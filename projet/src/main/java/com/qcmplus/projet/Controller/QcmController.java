package com.qcmplus.projet.Controller;

import com.qcmplus.projet.Dto.QCMItem;
import com.qcmplus.projet.Entity.QcmEntity;
import com.qcmplus.projet.Service.QcmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v0")
public class QcmController {

    @Autowired
    private QcmService service;

    @GetMapping("/qcms/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public QcmEntity checkUserExists(@PathVariable long id) {
        return service.checkIfQcmExists(id);
    }

    @GetMapping("/qcms")
    @ResponseStatus(value = HttpStatus.OK)
    public ArrayList<QCMItem> getAllQcm() {
        ArrayList<QCMItem> qcmItems= new ArrayList<>();
        for (QcmEntity qcm:
                service.getAllQcm()) {
            QCMItem qcmItem= new QCMItem(qcm.getId(),qcm.getIntitule(),qcm.getNiveau(),qcm.getNbQuestions());

            qcmItems.add(qcmItem);
        }

        return qcmItems;
    }
}
