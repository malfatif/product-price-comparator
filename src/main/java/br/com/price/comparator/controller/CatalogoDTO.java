package java.br.com.price.comparator.controller;

import org.springframework.hateoas.ResourceSupport;

public class CatalogoDTO extends ResourceSupport {

    private String descricao;
    private String valor;
    private String fornecedor;
    private String urlImagem;

    public CatalogoDTO(){
    }

    public CatalogoDTO(String descricao, String valor, String fornecedor, String urlImagem) {
        super();
        this.descricao = descricao;
        this.valor = valor;
        this.fornecedor = fornecedor;
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
}