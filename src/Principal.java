public class Principal {
    public static void main(String[] args) {
        //tipo referência
        Filme meuFilme = new Filme(); //parte da esqueda está guardando onde o objeto está a da esquerda, na direira é onde cria o espaço na memória.

        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;

//        System.out.println(meuFilme.nome); forma de instanciar Objeto
//        System.out.println(meuFilme.anoDeLancamento);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(5);
        meuFilme.avalia(4);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);

        System.out.println(meuFilme.pegaMedia());

    }
}