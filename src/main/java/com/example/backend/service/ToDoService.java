package com.example.backend.service;


import com.example.backend.model.ToDo;
import com.example.backend.repo.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class ToDoService {

    private ToDoRepo toDoRepo;



    @Autowired
    public ToDoService(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    public List<ToDo> getAllToDos(){
        return toDoRepo.getAllToDos();
    }

    public ToDo addToDo (ToDo toDo){
        return toDoRepo.addToDo(toDo);
    }

    public ToDo postNewToDo(ToDo toDo){
        Map<String ,ToDo> presentToDos = toDoRepo.getToDos();
            int newId1 = presentToDos.size()+1;
            String newId = String.valueOf(newId1);
            toDo.setId(newId);
            return toDoRepo.addNewToDo(toDo);

    }
    public ToDo getToDo(String id){
        return toDoRepo.getById(id);
    }

}
