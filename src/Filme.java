public class Filme {
    String nome;//atributo do objeto
    int anoDeLancamento;//atributo do objeto
    boolean incluidoNoPlano;//atributo do objeto
    double somaDasAvaliacoes;//atributo do objeto
    int totalDeAvaliacoes;//atributo do objeto

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
