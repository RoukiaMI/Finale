package com.qcmplus.projet.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "qcm")
public class QcmEntity {
    @Id
    @Column(name = "idqcm")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter(AccessLevel.PUBLIC) private Long id;

    @Getter @Setter(AccessLevel.PUBLIC) private String intitule;
    @Getter @Setter(AccessLevel.PUBLIC) private String niveau;
    @Column(name="nbQuestions")
    @Getter @Setter(AccessLevel.PUBLIC) private int nbQuestions;

    @OneToMany(mappedBy = "qcm")
    @Getter @Setter
    private List<QuestionsEntity> questions;


}
