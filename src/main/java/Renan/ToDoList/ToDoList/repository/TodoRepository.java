package Renan.ToDoList.ToDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Renan.ToDoList.ToDoList.entity.Todo;

public interface  TodoRepository extends JpaRepository<Todo, Long>{
    
    
}
