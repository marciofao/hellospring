package io.github.marciofao.hellospring.controller;

import io.github.marciofao.hellospring.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

public class ProductController {
    private ArrayList<Produto> database;

    public ProductController(){
        database = new ArrayList<>(){{
            add(new Produto(1, "Computador", 1500.00));
            add(new Produto(2, "Mouse", 50.00));
            add(new Produto(3, "Teclado", 100.00));
            add(new Produto(4, "Caixa de som", 200.00));
            add(new Produto(5, "Monitor", 500.00));
        }};
    }
    @GetMapping("/produtos")
    public ArrayList<Produto> recuperarTodos(){
        return database;
    }

    @GetMapping("/produtos/{id}")
    public Produto recuperarPeloId(@PathVariable("id") int id){
        return database.stream().filter(p->p.getId() == id).findFirst().orElse(null);
    }
    @PostMapping("/produtos")
    public Produto adicionarProduto(@RequestBody Produto p){
        database.add(p);
        return p;
    }
}
