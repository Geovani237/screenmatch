import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        //tipo referência
        Filme meuFilme = new Filme(); //parte da esqueda está guardando onde o objeto está a da esquerda, na direira é onde cria o espaço na memória.

        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

//        System.out.println(meuFilme.nome); forma de instanciar Objeto
//        System.out.println(meuFilme.anoDeLancamento);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(5);
        meuFilme.avalia(4);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        System.out.println(meuFilme.pegaMedia());

    }
}