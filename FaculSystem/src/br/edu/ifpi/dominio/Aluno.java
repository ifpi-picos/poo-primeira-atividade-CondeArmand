package br.edu.ifpi.dominio;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    String nomeAluno;
    String emailAluno;
    Date dataNascimento;
    float[] notas;
    Float media;



    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {

        this.dataNascimento = dataNascimento;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    public float getMedia() {
        float soma = 0;
        for (float nota : getNotas()) {
            soma = soma + nota;
        }
        return soma / notas.length;
    }

    public void setMedia(Float media) {
        this.media = media;
    }
    public void getAprovadoReprovado() {
        if (getMedia() >= 7) {
            JOptionPane.showMessageDialog(null, "O aluno está Aprovado");
        } else {
            JOptionPane.showMessageDialog(null, "O aluno está Reprovado");
        }
    }

    public void alunoStatus() {
        SimpleDateFormat fdt = new SimpleDateFormat("dd/MM/yyyy");
        JOptionPane.showMessageDialog(null,
        "Nome: " + getNomeAluno() +
        "\nEmail: " + getEmailAluno() +
        "\nData de nascimento: " + fdt.format(getDataNascimento()) +
        "\nMédia: " + getMedia());
    }
}
