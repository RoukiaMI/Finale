package com.qcmplus.projet.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reponses")
public class ResponsesEntity {

    @Id
    @Column(name="idreponses")
    private Long id;

    @Getter @Setter
    private String reponses;

    @ManyToOne
    @JoinColumn(name = "idquestions")
    private QuestionsEntity question;
}
