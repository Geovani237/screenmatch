public class Filme {
    //Atributos do Objeto
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    //Método acessor
    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    //Método só vai fazer alguma coisa e não tem algum retorno vamos decladar da seguinte forma:
    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome); // forma de instanciar Objeto
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


}
