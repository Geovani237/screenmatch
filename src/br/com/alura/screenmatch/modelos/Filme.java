package br.com.alura.screenmatch.modelos;

public class Filme {
    //Atributos do Objeto
    public String nome;// atributos de publicos não vai existir. 
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    //Método acessor
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    //Método só vai fazer alguma coisa e não tem algum retorno vamos decladar da seguinte forma:
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome); // forma de instanciar Objeto
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
   public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


}
