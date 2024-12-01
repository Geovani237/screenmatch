package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("The Mathix",1999);
        meuFilme.avalia(7);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(5);
        var filmeDoGeovani = new Filme("Toy story",2003);
        filmeDoGeovani.avalia(10);
        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoGeovani);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            Filme filme = (Filme) item; //casting
            System.out.println(filme.getClassificacao());
        }
    }
}
