package dev.simpleboot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.simpleboot.rest.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
