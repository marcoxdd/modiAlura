package br.com.alura.mvc.modiAlura.controller;

import br.com.alura.mvc.modiAlura.dto.RequisicaoDTO;
import br.com.alura.mvc.modiAlura.entitie.Pedido;
import br.com.alura.mvc.modiAlura.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("pedido")
public class PedidoController {
    @Autowired
    PedidoRepository pedidoRepository;

    @GetMapping("formulario")
    public String formulario(RequisicaoDTO requisicaoDTO){
        return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(@Valid RequisicaoDTO requisicaoDTO, BindingResult result){
        if (result.hasErrors()) return "pedido/formulario";

        Pedido pedido = requisicaoDTO.toPedido();
        pedidoRepository.save(pedido);
        return "pedido/formulario";
    }
}
