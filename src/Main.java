import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição do curso de Python");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição de mentoria JAVA");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devNeres = new Dev();
        devNeres.setNome("Neres");
        devNeres.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Neres"+ devNeres.getConteudosInscritos());
        devNeres.progredir();
        devNeres.progredir();
        devNeres.progredir();

        System.out.println("-");

        System.out.println("Conteudos Inscritos Neres"+ devNeres.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Neres"+ devNeres.getConteudosConcluidos());
        System.out.println("XP: "+ devNeres.calcularTotalXp());


        System.out.println("-------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Maria"+ devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();


        System.out.println("-");

        System.out.println("Conteudos Inscritos Maria"+ devMaria.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Maria"+ devMaria.getConteudosConcluidos());
        System.out.println("XP: "+ devMaria.calcularTotalXp());



    }
}
