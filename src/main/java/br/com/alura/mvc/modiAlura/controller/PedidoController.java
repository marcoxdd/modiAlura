package br.com.alura.mvc.modiAlura.controller;

import br.com.alura.mvc.modiAlura.Services.CrudPedidoService;
import br.com.alura.mvc.modiAlura.dto.RequisicaoDTO;
import br.com.alura.mvc.modiAlura.entitie.Pedido;
import br.com.alura.mvc.modiAlura.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoController {
    @Autowired
    PedidoRepository pedidoRepository;

    @GetMapping("formulario")
    public String formulario(){
        return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(RequisicaoDTO requisicaoDTO){
        Pedido pedido = requisicaoDTO.toPedido();
        pedidoRepository.save(pedido);
        return "pedido/formulario";
    }
}
