package br.com.findurpoint;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {

        AtracaoDescricao atracaodescricao1 = new AtracaoDescricao();
        atracaodescricao1.setId(1L);
        atracaodescricao1.setDescricao("Uma de as 7 maravilhas do mundo");

        AtracaoDescricao atracaoDescricao2 = new AtracaoDescricao();
        atracaoDescricao2.setId(2L);
        atracaoDescricao2.setDescricao("O marco das tres fronteiras e um obelisco feito de pedra. Essa cena emociona o turista, que pode ver Brasil, Argentina e Paraguai tao proximos um do outro.");

        AtracaoDescricao atracaoDescricao3 = new AtracaoDescricao();
        atracaoDescricao3.setId(3L);
        atracaoDescricao3.setDescricao("Inspirado numa aldeia mediterranica, o Patio Pomare reune 4 espacos gastronomicos diferentes: um restaurante de comida saudavel e sem gluten, uma pizzaria, um requintado bar e um cafe.  Inspirado em uma vila mediterranea, o Patio Pomare reune 4 espacos gastronomicos diferentes: um restaurante de comida saudavel e sem gluten, uma pizzaria, um bar requintado e uma cafeteria");

        Footer footer1 = new Footer();
        footer1.setId(1L);
        footer1.setEmail("jorge234@gmail.com");
        footer1.setComentario("Quero colocar um novo evento");

        Footer footer2 = new Footer();
        footer2.setId(2L);
        footer2.setEmail("pedro_querty@gmail.com");
        footer2.setComentario("precizo de ajuda de onde esta o marco das tres fronteira");

        Footer footer3 = new Footer();
        footer3.setId(3L);
        footer3.setEmail("juan1234@hotmail.com");
        footer3.setComentario("Muito boa a pagina");

        Footer footer4 = new Footer();
        footer4.setId(4L);
        footer4.setEmail("nicolastyes@hotmail.com");
        footer4.setComentario("Bom trabalho");

        Footer footer5 = new Footer();
        footer5.setId(5L);
        footer5.setEmail("mayra14556@gmail.com");
        footer5.setComentario("Falta arrumar algumas coisas mais muito bom");

        List<Footer> footers = new ArrayList<>();

        footers.add(footer1);
        footers.add(footer2);
        footers.add(footer3);
        footers.add(footer4);
        footers.add(footer5);

        footers.forEach(footer -> System.out.println(
                " ID: " + footer.getId() +
                        " Email: " + footer.getEmail() +
                        " Comentario: " + footer.getComentario()
        ));

        System.out.println("    ");
        System.out.println("Classe atracao descricao");
        System.out.println("               ");

        List<AtracaoDescricao> atracaoDescricaos = new ArrayList<>();

        atracaoDescricaos.add(atracaodescricao1);
        atracaoDescricaos.add(atracaoDescricao2);
        atracaoDescricaos.add(atracaoDescricao3);

        atracaoDescricaos.forEach(atracaoDescricao -> System.out.println(
                " ID: " + atracaoDescricao.getId() +
                        " Descricao: " + atracaoDescricao.getDescricao()
        ));


    }
}
