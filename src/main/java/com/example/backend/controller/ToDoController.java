package com.example.backend.controller;

import com.example.backend.model.ToDo;
import com.example.backend.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;


@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    private ToDoService todoService;

    @Autowired
    public ToDoController(ToDoService toDoService){
        this.todoService = toDoService;
    }

    @GetMapping
    public List<ToDo> getAllToDos(){
        return todoService.getAllToDos();
    }

    @PostMapping
    public ToDo addToDo(@RequestBody ToDo toDo){
        return todoService.addToDo(toDo);
    }


    @GetMapping("{id}")
    public ToDo getToDo(@PathVariable String id){
        return todoService.getToDo(id);
    }








}
