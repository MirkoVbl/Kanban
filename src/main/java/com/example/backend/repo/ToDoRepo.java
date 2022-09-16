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

    public ToDo addToDo(ToDo toDo) {
        toDos.put(toDo.getId(), toDo);
        return toDo;
    }

    public Map<String, ToDo> getToDos() {
        return toDos;
    }

    public ToDo addNewToDo(ToDo toDo) {
        return toDos.put(toDo.getId(), toDo);
    }

    public ToDo getById(String id) {
        for (ToDo toDo : toDos.values()) {
            if (toDo.getId().equals(id)) {
                return toDo;
            }
        }
        throw new NoSuchElementException("Es gibt keine Treffer mit der id: " +id);
    }
}
