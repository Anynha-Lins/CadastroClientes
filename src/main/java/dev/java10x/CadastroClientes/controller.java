package dev.java10x.CadastroClientes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class controller {

    @GetMapping ("/boasvindas")
    @PostMapping
    @PutMapping
    @PatchMapping
    @DeleteMapping
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }
}
