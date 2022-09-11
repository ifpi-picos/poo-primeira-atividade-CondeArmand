package br.edu.ifpi.dominio;

import javax.swing.*;
import java.util.Date;

public class Curso {

    private String nomeCurso;
    private int cargaHoraria;
    private String modalidade;
    private String nivel;

    private String professorResponsavel;
    private Date dataDeInicio;
    private Date dataDeFim;
    private Boolean gratuito;



    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public Date getDataDeInicio() {
        return dataDeInicio;
    }

    public Date getDataDeFim() {
        return dataDeFim;
    }

    public Boolean getGratuito() {
        return gratuito;
    }

    public void setGratuito(Boolean gratuito) {
        this.gratuito = gratuito;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataDeInicio = dataInicio;
    }
    public void setDataDeFim(Date dataDeFim) {
        this.dataDeFim = dataDeFim;
    }

    public void getcursoStatus() {
        JOptionPane.showMessageDialog(null,
        "Status do curso" + "\n" +
        getNomeCurso() + "\n" +
        getModalidade() + "\n" +
        getNivel() + "\n" +
        getCargaHoraria() + "\n" +
        getProfessorResponsavel() + "\n" +
        getDataDeInicio() + "\n" +
        getDataDeFim() + "\n" +
        getGratuito());
    }
}
