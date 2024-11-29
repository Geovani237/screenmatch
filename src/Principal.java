import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {
        //tipo referência
        Filme meuFilme = new Filme("The Mathix"); //parte da esqueda está guardando onde o objeto está a da esquerda, na direira é onde cria o espaço na memória.

        //meuFilme.setNome("The Mathix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(135);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

//        System.out.println(meuFilme.nome); forma de instanciar Objeto
//        System.out.println(meuFilme.anoDeLancamento);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodios(50);
        System.out.println("Duração da serie: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar");
        //outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoGeovani = new Filme("Toy story");
        //filmeDoGeovani.setNome("Toy story");
        filmeDoGeovani.setAnoDeLancamento(2003);
        filmeDoGeovani.setDuracaoEmMinutos(200);
        filmeDoGeovani.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoGeovani);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(2).getNome());
        System.out.println(listaDeFilmes);
    }
}