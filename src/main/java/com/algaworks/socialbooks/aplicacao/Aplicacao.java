package com.algaworks.socialbooks.aplicacao;

import com.algaworks.socialbooks.client.LivrosClient;
import com.algaworks.socialbooks.domain.Livro;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) throws ParseException {

        LivrosClient cliente = new LivrosClient("http://localhost:8080", "e","1" );

        List<Livro> listaLivro = cliente.listar();

        for(Livro livro : listaLivro) {
            System.out.println("Livro: " + livro.getNome());
        }

        Livro livro = new Livro();
        livro.setNome("Get passo a passo");
        livro.setEditora("AlgaWork");
        SimpleDateFormat publicacao = new SimpleDateFormat("dd/MM/yyyy");
        livro.setDataPublicacao(publicacao.parse("01/01/206"));
        livro.setResumo("Este livro aborda sobre API.");

        String localizacao = cliente.salvar(livro);
        System.out.println("URI do livro salvo: " + localizacao);

        Livro livroBuscado = cliente.buscar(localizacao);
        System.out.println("Livro buscado: "+ livroBuscado.getNome());


    }

}
