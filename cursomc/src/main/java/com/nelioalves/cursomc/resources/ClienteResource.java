package com.nelioalves.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
    
    @Autowired private ClienteService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> listar(@PathVariable Integer id) {
        var obj = service.buscar(id);
        return ResponseEntity.ok().body(obj);
    }

}
