import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Decricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBreno = new Dev();
        devBreno.setNome("Breno");
        devBreno.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Breno" + devBreno.getConteudosinscritos());
        devBreno.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Breno" + devBreno.getConteudosinscritos());
        System.out.println("Conteudos Inscritos Breno" + devBreno.getConteudosconcluidos());

        System.out.println("---------------------");

        Dev devMarissa = new Dev();
        devMarissa.setNome("Marissa");
        devMarissa.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devMarissa.getConteudosinscritos());
        devMarissa.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Marissa" + devMarissa.getConteudosinscritos());
        System.out.println("Conteudos Concluidos Marissa" + devMarissa.getConteudosconcluidos());


    }
}
