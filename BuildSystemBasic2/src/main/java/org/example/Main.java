package org.example;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TodoService todoService=retrofit.create(TodoService.class);
        Response t=todoService.getTodoById("2").execute().body();
        System.out.println("Todo Object Downloaded is:"+t.toString());
    }
}