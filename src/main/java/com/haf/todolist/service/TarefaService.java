package com.haf.todolist.service;

import com.haf.todolist.model.Tarefa;
import com.haf.todolist.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TarefaService {
    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listarTodas(){
        return repository.findAll();
    }
    public Tarefa salvar(Tarefa tarefa){
        return repository.save(tarefa);
    }
    public void deletar(Long id){
        repository.deleteById(id);
    }
}
