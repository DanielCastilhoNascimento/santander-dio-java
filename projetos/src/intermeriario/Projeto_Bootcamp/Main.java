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
    mentoria1.setTitulo("Java");
    mentoria1.setDescricao("Codifique uma vez, execute em todo lugar.");
    mentoria1.setData(LocalDate.now());

    Mentoria mentoria2 = new Mentoria();
    mentoria2.setTitulo("C#");
    mentoria2.setDescricao("Codifique uma vez e só execute no windows");
    mentoria2.setData(LocalDate.now());

    
    System.out.println(curso1);
    System.out.println(mentoria1);
    System.out.println("-----------------------------------------------------------");
    System.out.println(curso2);
    System.out.println(mentoria2);

    }

}
