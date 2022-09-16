package com.example.backend.repo;


import com.example.backend.model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ToDoRepo {

    private Map<String, ToDo> toDos = new HashMap<>(
            Map.of(
                    "1", new ToDo("Wash the car", "OPEN", "1")));

    public List<ToDo> getAllToDos(){
        return new ArrayList<ToDo>(toDos.values());
    }

    public ToDo getById(String id) {
                return toDos.get(id);
            }

    public ToDo addNewToDo(ToDo toDo) {
        return toDos.put(toDo.getId(), toDo);
    }

    public ToDo changeToDo(ToDo changeToDo) {
        toDos.get(changeToDo.getId()).setStatus(changeToDo.getStatus());
        toDos.get(changeToDo.getId()).setDescription(changeToDo.getDescription());
        return toDos.get(changeToDo.getId());
    }


    public Map<String, ToDo> getToDos() {
        return toDos;
    }
}
