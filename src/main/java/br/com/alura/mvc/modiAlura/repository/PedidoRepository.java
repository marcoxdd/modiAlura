package br.com.alura.mvc.modiAlura.repository;

import br.com.alura.mvc.modiAlura.entitie.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {
}
