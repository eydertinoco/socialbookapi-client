package com.algaworks.socialbooks.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class Livro {

    private Long id;
    private String nome;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataPublicacao;
    private String editora;
    private String resumo;
    private List<Comentario> comentarios;
    private Autor autor;

    public Livro() {
    }

    public Livro(String nome) {
        this.nome = nome;
    }

    public Livro(Long id, String nome, Date dataPublicacao, String editora, String resumo,
                 List<Comentario> comentarios, Autor autor) {
        this.id = id;
        this.nome = nome;
        this.dataPublicacao = dataPublicacao;
        this.editora = editora;
        this.resumo = resumo;
        this.comentarios = comentarios;
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
