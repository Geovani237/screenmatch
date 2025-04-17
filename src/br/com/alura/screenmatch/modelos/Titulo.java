package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo {
    @SerializedName("Title")
    private String nome;// atributos de publicos não vai existir.
    @SerializedName("Year")
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    //Metodo acessor
    public int getTotalDeAvaliacoes() {

        return totalDeAvaliacoes;
    }
    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }
    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }
    public int getDuracaoEmMinutos(){
        return this.duracaoEmMinutos;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
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

    @Override
    public String toString() {
        return  "nome=" + nome +
                ", anoDeLancamento='" + anoDeLancamento + '\'' +
                '}';
    }
}
