package com.qcmplus.projet.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "questions")
public class QuestionsEntity {
    @Id
    @Column(name="idquestions")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter(AccessLevel.PUBLIC) private Long id;

    @Getter @Setter(AccessLevel.PUBLIC) private String questions;

    @OneToMany(mappedBy = "question")
    @Getter @Setter
    private List<ResponsesEntity> reponses;

    @ManyToOne
    @JoinColumn(name = "idqcm")
    private QcmEntity qcm;
}
