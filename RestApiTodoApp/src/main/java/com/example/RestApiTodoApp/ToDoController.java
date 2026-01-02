package com.example.RestApiTodoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ToDoController {
    public static ArrayList<Response>  todos;
    public  ToDoController(){
        todos=new ArrayList<>();
        todos.add(new Response(12,false,"Goat",123));
        todos.add(new Response(23,true,"Messi",987));
    }
    @GetMapping("/todos")
    public ArrayList<Response> getTodos(){
        return  todos;
    }
    @PostMapping("/todos")
    public Response CreateTodo(@RequestBody Response newTodo){
        todos.add(newTodo);
        return newTodo;

    }


}
