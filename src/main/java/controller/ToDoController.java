package controller;

import com.example.backend.model.ToDo;
import com.example.backend.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public List<ToDo> getAllToDos(){
        return todoService.getAllToDos();
    }


}
