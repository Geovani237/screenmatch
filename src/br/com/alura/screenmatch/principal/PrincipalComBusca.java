package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite o nome do filme: ");
//        var busca = scanner.nextLine();
//        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=a4e48616";
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(endereco))
//                .build();
//
//        HttpResponse<String> response = client
//                .send(request, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(response.body());


    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o livro que deseja pesquisar");

    String bookName = sc.next();

    String endereco = "https://www.googleapis.com/books/v1/volumes/?q=" + bookName;

    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());


    System.out.println(response.body());
    
    }
}
