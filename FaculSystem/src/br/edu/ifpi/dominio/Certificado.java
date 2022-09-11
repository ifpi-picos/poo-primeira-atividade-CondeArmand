package br.edu.ifpi.dominio;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Certificado {
    String nomeAluno;
    String nomeCurso;
    int cargaHoraria;
    String modalidade;
    String nivel;
    Date dataDeInicio;
    Date dataDeFim;


    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

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

    public Date getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(Date dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public Date getDataDeFim() {
        return dataDeFim;
    }

    public void setDataDeFim(Date dataDeFim) {
        this.dataDeFim = dataDeFim;
    }

    public void imprimirCertificado() {
        SimpleDateFormat fdt = new SimpleDateFormat("dd/MM/yyyy");
        JOptionPane.showMessageDialog(null,
         "Nome: " + getNomeAluno() +
        "\nbr.edu.ifpi.dominio.Curso: " + getNomeCurso() +
        "\nModalidade: " + getModalidade() +
        "\nNivel: " + getNivel() +
        "\nCarga Horaria: " + getCargaHoraria() + " Horas" +
        "\nData do inicio: " + fdt.format(getDataDeInicio()) +
        "\nData de conclusão: " + fdt.format(getDataDeFim()));
    }
}
