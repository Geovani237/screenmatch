import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        //tipo referência
        Filme meuFilme = new Filme(); //parte da esqueda está guardando onde o objeto está a da esquerda, na direira é onde cria o espaço na memória.

        meuFilme.setNome("The Mathix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(135);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

//        System.out.println(meuFilme.nome); forma de instanciar Objeto
//        System.out.println(meuFilme.anoDeLancamento);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(9);
        meuFilme.avalia(8);

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

    }
}