package br.com.alura.mvc.modiAlura.dto;

import br.com.alura.mvc.modiAlura.entitie.Pedido;

public class RequisicaoDTO {
    private String nomeProduto;
    private String urlProduto;
    private String imgProduto;
    private String descProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getImgProduto() {
        return imgProduto;
    }

    public void setImgProduto(String imgProduto) {
        this.imgProduto = imgProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public Pedido toPedido(){
        Pedido pedido = new Pedido();
        pedido.setUrlProduto(urlProduto);
        pedido.setNome(nomeProduto);
        pedido.setUrlImagem(imgProduto);
        pedido.setDescricao(descProduto);
        return pedido;
    }
}
