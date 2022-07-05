package br.com.alura.mvc.modiAlura.controller;

import br.com.alura.mvc.modiAlura.Services.CrudPedidoService;
import br.com.alura.mvc.modiAlura.entitie.Pedido;
import br.com.alura.mvc.modiAlura.utils.enums.StatusPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private CrudPedidoService crudPedidoService;

    @GetMapping
    public String home(Model model){
        List<Pedido> pedidos = crudPedidoService.recuperaPedidos();
        model.addAttribute("pedidos", pedidos);
        return "home";
    }

    @GetMapping("/{status}")
    public String porStatus(@PathVariable("status") String status, Model model){
        List<Pedido> pedidos = crudPedidoService.
                recuperaPedidosStatus(StatusPedido.valueOf(status.toUpperCase(Locale.ROOT)));
        model.addAttribute("pedidos", pedidos);
        model.addAttribute("status", status);
        return "home";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String onError(){
        return "redirect:/home";
    }

}
