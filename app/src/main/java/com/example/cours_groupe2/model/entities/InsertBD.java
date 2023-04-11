package com.example.cours_groupe2.model.entities;

public class InsertBD extends BaseEntity{
    private Integer score;
    private String pseudo;

    public InsertBD(Integer score, String pseudo) {
        this.score = score;
        this.pseudo = pseudo;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
}
