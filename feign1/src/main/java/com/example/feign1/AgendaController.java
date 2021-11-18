package com.example.feign1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class AgendaController {

    @GetMapping
    public Contato retornaContato() {
        return Contato.builder()
                .id(42L)
                .nome("Carlos Botelh")
                .telefone("92999-9999")
                .build();
    }
}
