package com.example.RestApiTodoApp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("FakeTodoService")
public class FakeTodoService implements TodoService {

    @Override
    public String doSomething() {
        return "Fake To Do service ";
    }
}
