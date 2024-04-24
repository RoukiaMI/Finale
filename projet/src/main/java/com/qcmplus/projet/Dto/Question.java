package com.qcmplus.projet.Dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Objet representant une question et ses réponses
 * */
public class Question {
    /**
     * Une question
     * */
    private String question;

    /**
     * Listes de réponses
     * */
    private List<String> reponses;
    /**
     * indexe de la vraie reponse dans la liste des réponses
     * */
    private int indexOfGR;

    public Question(String question, List<String> reponses, int index){

        this.question= question;
        this.reponses= reponses;
        this .indexOfGR= index;
    }

    public Question(){

        this.question= "";
        this.reponses= new ArrayList<>();
        this .indexOfGR= 0;
    }

    public void copyFrom(Question item){
        this.question= item.question;
        this.reponses= item.reponses;
        this .indexOfGR= item.indexOfGR;
    }

/************************************************ Getter & Setter ****************************************************/

    public String getQuestion() {
        return question;
    }

    public List<String> getReponses() {
        return reponses;
    }

    public int getIndexOfGR() {
        return indexOfGR;
    }


    public void setQuestion(String question) {
        this.question = question;
    }

    public void setReponses(List<String> reponses) {
        this.reponses = reponses;
    }

    public void setIndexOfGR(int indexOfGR) {
        this.indexOfGR = indexOfGR;
    }
}
