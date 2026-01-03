package com.example.RestApiTodoApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/todos")
public class ToDoController {
    public static ArrayList<Response>  todos;
    public  ToDoController(){
        todos=new ArrayList<>();
        todos.add(new Response(12L,false,"Goat",123));
        todos.add(new Response(23L,true,"Messi",987));
    }
    @GetMapping()
    public ResponseEntity<ArrayList<Response>> getTodos(){
        return  ResponseEntity.ok(todos);
    }


    @PostMapping()
//    @ResponseStatus(HttpStatus.CREATED) we use this annotation to set status
    public ResponseEntity<Response> CreateTodo(@RequestBody Response newTodo){
        todos.add(newTodo);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);
    }

    @GetMapping("/todos/{todoId}")
    public ResponseEntity<?> getTodoById(@PathVariable Long todoId){
        for(Response todo: todos){
            if(todo.getId()==todoId){
                return ResponseEntity.ok(todo);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("todo with id"+todoId+"not Found");
    }
    @DeleteMapping("/{todoId}")
    public ResponseEntity<?> deleteById(@PathVariable Long todoId) {

        boolean removed = todos.removeIf(t -> t.getId().equals(todoId));

      if(removed){
          return ResponseEntity.ok("Todo deletes successfully");
      }
      else{
          return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data related to that Id not found");
      }
    }

    @PutMapping("/{todoId}")
    public ResponseEntity<?> UpdateById(@PathVariable Long todoId,@RequestBody Response UpdateTodo){
        for(Response todo:todos){
            if(todo.getId().equals(todoId)){
                todo.setTitle(UpdateTodo.getTitle());
                todo.setUserId(UpdateTodo.getUserId());
                todo.setCompleted(UpdateTodo.isCompleted());
                return ResponseEntity.ok(todo);
            }

        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data related to that id not Exsist in the List");
    }



    // In this Code i dont use request mapping which api versoning when we do this we don't need to write any it it like postfix
//    @GetMapping("/todos")
//    public ResponseEntity<ArrayList<Response>> getTodos(){
//        return  ResponseEntity.ok(todos);
//    }
//
//
//    @PostMapping("/todos")
////    @ResponseStatus(HttpStatus.CREATED) we use this annotation to set status
//    public ResponseEntity<Response> CreateTodo(@RequestBody Response newTodo){
//        todos.add(newTodo);
//        return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);
//    }
//
//    @GetMapping("/todos/{todoId}")
//    public ResponseEntity<Response> getTodoById(@PathVariable Long todoId){
//        for(Response todo: todos){
//            if(todo.getId()==todoId){
//                return ResponseEntity.ok(todo);
//            }
//        }
//        return ResponseEntity.notFound().build();
//    }
}

