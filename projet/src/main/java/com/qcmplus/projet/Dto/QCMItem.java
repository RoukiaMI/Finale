package com.qcmplus.projet.Dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class QCMItem {

    @Getter @Setter(AccessLevel.PUBLIC) private Long id;
    @Getter @Setter(AccessLevel.PUBLIC) private String intitule;
    @Getter @Setter(AccessLevel.PUBLIC) private String niveau;
    @Getter @Setter(AccessLevel.PUBLIC) private int nbQuestions;
}
