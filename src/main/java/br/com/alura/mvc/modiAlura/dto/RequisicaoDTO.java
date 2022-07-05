package br.com.alura.mvc.modiAlura.dto;

import br.com.alura.mvc.modiAlura.entitie.Pedido;
import br.com.alura.mvc.modiAlura.utils.enums.StatusPedido;

import javax.validation.constraints.NotBlank;


public class RequisicaoDTO {
    @NotBlank(message = "O Campo nome é obrigatório!")
    private String nomeProduto;
    @NotBlank(message = "O Campo Url do Produto é obrigatório!")
    private String urlProduto;
    @NotBlank(message = "O Campo Url da Imagem é obrigatório!")
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
        pedido.setStatusPedido(StatusPedido.AGUARDANDO);
        return pedido;
    }
}
