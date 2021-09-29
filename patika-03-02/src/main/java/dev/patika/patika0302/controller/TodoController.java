package dev.patika.patika0302.controller;

import dev.patika.patika0302.entity.Todo;
import dev.patika.patika0302.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class TodoController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    TodoRepository repository;

    @GetMapping("/get/{id}")
    public ResponseEntity<Todo> getJsonFromRemoteTodoList (@PathVariable int id){
        Todo todo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/" + id,Todo.class);
        todo.setLocalDate(LocalDateTime.now());

        repository.save(todo);

        return new ResponseEntity<>(todo, HttpStatus.OK);
    }

    @GetMapping("/getstr/{id}")
    public ResponseEntity<String> getJsonFromRemoteTodoListWithString (@PathVariable int id){
        ResponseEntity<String>  todoStr = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/todos/" + id, String.class);
        return todoStr;
    }


}
