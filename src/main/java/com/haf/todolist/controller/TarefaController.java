package com.haf.todolist.controller;

import com.haf.todolist.model.Tarefa;
import com.haf.todolist.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    private final TarefaService service;
    public TarefaController(TarefaService service){
        this.service =  service;
    }
    @GetMapping
    public List<Tarefa> listar(){
        return service.listarTodas();
    }
    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa){
        return service.salvar(tarefa);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
