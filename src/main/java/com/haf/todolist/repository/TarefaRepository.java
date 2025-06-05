package com.haf.todolist.repository;

import com.haf.todolist.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends  JpaRepository<Tarefa, Long>{}
