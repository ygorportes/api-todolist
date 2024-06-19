package com.ygorportes.api_todolist.repository;

import com.ygorportes.api_todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
