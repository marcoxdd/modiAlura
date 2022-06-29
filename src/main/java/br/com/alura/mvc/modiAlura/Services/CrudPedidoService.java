package br.com.alura.mvc.modiAlura.Services;

import br.com.alura.mvc.modiAlura.dto.RequisicaoDTO;
import br.com.alura.mvc.modiAlura.entitie.Pedido;
import br.com.alura.mvc.modiAlura.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class CrudPedidoService {
    @Autowired
    PedidoRepository pedidoRepository;

    public List<Pedido> recuperaPedidos(){
        return (List<Pedido>) pedidoRepository.findAll();
    }

}
