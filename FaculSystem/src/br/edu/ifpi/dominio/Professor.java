package br.edu.ifpi.dominio;

public class Professor {
    String nomeProfessor;
    String emailProfessor;
    String formacao;

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }


    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }


    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
