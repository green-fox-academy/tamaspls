package com.greenfoxacademy.listingtodos;

import com.greenfoxacademy.listingtodos.models.Todo;
import com.greenfoxacademy.listingtodos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingTodosApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(ListingTodosApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Uninstall IntelliJ"));
    todoRepository.save(new Todo("Uninstall SQL"));
    todoRepository.save(new Todo("Remove files"));
  }
}

