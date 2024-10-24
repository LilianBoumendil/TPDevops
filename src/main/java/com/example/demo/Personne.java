package com.example.demo;

public  class Personne {

    private String nom;
    private String email;
    private String date;


    /**
     * constructeur par defaut
     */

    public Personne() {
        super();
        this.nom = "Boumendil";
        this.email = "boumendil@gmail.com";
        this.date = "2020-03-30";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}