package com.nelioalves.cursomc.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
    
    @GetMapping
    public List<Categoria> listar() {
        var cat1 = new Categoria(1, "Informática");
        var cat2 = new Categoria(2, "Escritório");
        
        return Arrays.asList(cat1, cat2);
    }

}