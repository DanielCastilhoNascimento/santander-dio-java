package intermeriario.Projeto_Bootcamp;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
    Curso curso1 = new Curso();
    curso1.setTitulo("Java");
    curso1.setDescricao ("Java Basico");
    curso1.setCargaHoraria(90);

    Curso curso2 = new Curso();
    curso2.setTitulo("CSharp");
    curso2.setDescricao ("CSharp Basico");
    curso2.setCargaHoraria(80);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Java I");
    mentoria1.setDescricao("Fundamentos");
    mentoria1.setData(LocalDate.now());

    Mentoria mentoria2 = new Mentoria();
    mentoria2.setTitulo("Java II");
    mentoria2.setDescricao("Orientação a Objetos");
    mentoria2.setData(LocalDate.now());
    
    /*
    System.out.println(curso1);
    System.out.println(mentoria1);
    System.out.println("-----------------------------------------------------------");
    System.out.println(curso2);
    System.out.println(mentoria2); 
    */

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescrição("Trilha Backend do Santander");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria1);
    bootcamp.getConteudos().add(mentoria2);

    Dev silvana = new Dev();
    silvana.setNome("Silvana");
    silvana.inscreverBootcamp(bootcamp);    
    System.out.println("Conteudos inscritos Silvana : " + silvana.getConteudosInscritos());
    silvana.progredir();
    silvana.progredir();
    silvana.progredir();
    System.out.println("Conteudos inscritos Silvana : " + silvana.getConteudosInscritos());
    System.out.println("Conteudos concluidos Silvana : " + silvana.getConteudoConcluidos());
    System.out.println("XP : " + silvana.calcularTotalXp());

    System.out.println("-----------------------------------------------------------");

    Dev manuela = new Dev();
    silvana.setNome("Manuela");
    manuela.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos Manuela : " + manuela.getConteudosInscritos());
    manuela.progredir();
    System.out.println("Conteudos inscritos Manuela : " + manuela.getConteudosInscritos());
    System.out.println("Conteudos concluidos Manuela : " + manuela.getConteudoConcluidos());
    System.out.println("XP : " + manuela.calcularTotalXp());

    }

}
