package br.com.alura.mvc.modiAlura.Services;

import br.com.alura.mvc.modiAlura.entitie.Pedido;
import br.com.alura.mvc.modiAlura.utils.enums.StatusPedido;
import br.com.alura.mvc.modiAlura.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudPedidoService {
    @Autowired
    PedidoRepository pedidoRepository;

    public List<Pedido> recuperaPedidos(){
        return (List<Pedido>) pedidoRepository.findAll();
    }

    public List<Pedido> recuperaPedidosStatus(StatusPedido status){
        return (List<Pedido>) pedidoRepository.findByStatusPedido(status);
    }

}
