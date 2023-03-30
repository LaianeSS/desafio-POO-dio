import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descrição do curso da linguagem C#");
        curso2.setCargaHoraria(4);

        Mentoria mentoria =new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição para mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp =new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLaiane = new Dev();
        devLaiane.inscreverBootcamp(bootcamp);
        devLaiane.setNome("Laiane");
        System.out.println("Conteúdos inscritos de Laiane:" + devLaiane.getConteudosIncritos());
        devLaiane.progredir();
        devLaiane.progredir();
        System.out.println("----");
        System.out.println("Conteúdos incritos de Laiane:" + devLaiane.getConteudosIncritos());
        System.out.println("Conteúdos concluídos de Laiane:" + devLaiane.getConteudosCncluidos());
        System.out.println("XP:" + devLaiane.calcularTotalXP());

        System.out.println("-----------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de João:" + devJoao.getConteudosIncritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("----");
        System.out.println("Conteúdos inscritos de João:" + devJoao.getConteudosIncritos());
        System.out.println("Conteúdos concluídos de João:" + devJoao.getConteudosCncluidos());
        System.out.println("XP:" + devJoao.calcularTotalXP());


    }
}



