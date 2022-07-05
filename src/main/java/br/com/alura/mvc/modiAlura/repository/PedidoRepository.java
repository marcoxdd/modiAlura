package br.com.alura.mvc.modiAlura.repository;

import br.com.alura.mvc.modiAlura.entitie.Pedido;
import br.com.alura.mvc.modiAlura.utils.enums.StatusPedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {

    List<Pedido> findByStatusPedido(StatusPedido statusPedido);
}
