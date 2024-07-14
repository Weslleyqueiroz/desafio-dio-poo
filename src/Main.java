import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public  class Main {
    public static void main(String[] args){
        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Descrição do curso...");
        curso.setCargaHoraria(20);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição para mentoria de java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Java");
        mentoria2.setDescricao("descrição para mentoria de Java");
        mentoria2.setData(LocalDate.now());



        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Python");
        curso1.setDescricao("Descrição do curso de Python...");
        curso1.setCargaHoraria(15);



        Bootcamp bootcamp= new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp do curso de Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devWeslley = new Dev();
        devWeslley.setNome("Weslley");
        devWeslley.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Weslley:" + devWeslley.getConteudosConcluidos());
        devWeslley.progresso();
        devWeslley.progresso();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Conteudos inscritos Weslley:" + devWeslley.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Weslley:" + devWeslley.getConteudosConcluidos());
        System.out.println("XP:" +devWeslley.calcularTotalXp());

        System.out.println("-----------------------------------------------------------------");

        Dev devWilliam = new Dev();
        devWilliam.inscreverBootcamp(bootcamp);
        devWilliam.setNome("William");
        System.out.println("Conteudos inscritos William:" + devWilliam.getConteudosInscritos());
        devWilliam.progresso();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Conteudos inscritos William:" + devWilliam.getConteudosInscritos());
        System.out.println("Conteudos Concluidos William:" + devWilliam.getConteudosConcluidos());
        System.out.println("XP:" +devWilliam.calcularTotalXp());


    }
}