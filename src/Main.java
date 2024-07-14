import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public  class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso...");
        curso1.setCargaHoraria(20);
        System.out.println(curso1);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição para mentoria de java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Pyhton");
        mentoria2.setDescricao("descrição para mentoria de Pyhton");
        mentoria2.setData(LocalDate.now());

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Python");
        curso2.setDescricao("Descrição do curso de Python...");
        curso2.setCargaHoraria(15);
        System.out.println(curso2);
    }
}