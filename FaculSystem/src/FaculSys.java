import br.edu.ifpi.dominio.Aluno;
import br.edu.ifpi.dominio.Certificado;
import br.edu.ifpi.dominio.Curso;
import br.edu.ifpi.dominio.Professor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class FaculSys {
    public static void main(String[] args) throws ParseException {
        /*
        Abertura -> br.edu.ifpi.dominio.Aluno
         */
        Aluno aluno1 = new Aluno();
        aluno1.setNomeAluno("Gabriel Marcos");
        aluno1.setEmailAluno("GabrielAgitagem@gmail.com");

        SimpleDateFormat fdt = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNasc = fdt.parse("21/08/2004");
        aluno1.setDataNascimento(dataNasc);

        float[] notas = {8, 7, 9, 5};
        aluno1.setNotas(notas);
        aluno1.getMedia();
        aluno1.setMedia(aluno1.getMedia());

        aluno1.alunoStatus();
        aluno1.getAprovadoReprovado();
        /*
        Fechamento -> br.edu.ifpi.dominio.Aluno
         */

        ///////////////////////////////////////////////////

        /*
        Abertura → br.edu.ifpi.dominio.Professor
         */
        Professor pro1 = new Professor();
        pro1.setNomeProfessor("Pedrinho");
        pro1.setFormacao("Desenvolvimento Mobile");
        pro1.setEmailProfessor("pdrDev@gmail.com");
        /*
        Fechamento -> br.edu.ifpi.dominio.Professor
         */

        ///////////////////////////////////////////////////

        /*
        Abertura do br.edu.ifpi.dominio.Curso
         */
        Curso ads = new Curso();
        ads.setNomeCurso("ADS II");
        ads.setCargaHoraria(2500);
        ads.setModalidade("Presencial");
        ads.setNivel("Superior");
        ads.setGratuito(true);
        ads.setProfessorResponsavel(pro1.getNomeProfessor());

        /* Inserção de datas */
        Date dataInicio = fdt.parse("21/03/2022");
        Date dataFim = fdt.parse("06/02/2025");
        ads.setDataInicio(dataInicio);
        ads.setDataDeFim(dataFim);

        ads.getcursoStatus();
        /*
        Fechamento do br.edu.ifpi.dominio.Curso
         */

        ///////////////////////////////////////////////////

        /*
        Abertura -> br.edu.ifpi.dominio.Certificado
         */
        Certificado cer1 = new Certificado();
        // Atributos
        cer1.setNomeAluno(aluno1.getNomeAluno());
        cer1.setNomeCurso(ads.getNomeCurso());
        cer1.setCargaHoraria(ads.getCargaHoraria());
        cer1.setModalidade(ads.getModalidade());
        cer1.setNivel(ads.getNivel());
        cer1.setDataDeInicio(dataInicio);
        cer1.setDataDeFim(dataFim);

        // Métodos
        cer1.imprimirCertificado();

        /*
        Fechamento do br.edu.ifpi.dominio.Certificado
         */

    }
}
