package com.example.backend.repo;


import com.example.backend.model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ToDoRepo {

    private Map<String, ToDo> todos = new HashMap<>(
            Map.of(
                    "1", new ToDo("Wash the car", "1")));






}
