package br.com.alura.mvc.modiAlura.controller;

import br.com.alura.mvc.modiAlura.Services.CrudPedidoService;
import br.com.alura.mvc.modiAlura.entitie.Pedido;
import br.com.alura.mvc.modiAlura.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private CrudPedidoService crudPedidoService;

    @GetMapping("/home")
    public String home(Model model){
        List<Pedido> pedidos = crudPedidoService.recuperaPedidos();
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
