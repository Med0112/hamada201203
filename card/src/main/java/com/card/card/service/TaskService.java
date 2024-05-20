package com.card.card.service;


import com.card.card.DTO.CountType;
import com.card.card.entity.Task;
import com.card.card.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {
    private TaskRepository taskRepository;
    public List<Task> getTasks(){

        return taskRepository.findAll() ;
}


    public Optional<Task> getTaskById(Long id){

        return taskRepository.findById(id);
    }
    public Task save(Task task){

        //https://www.baeldung.com/spring-data-jpa-save-saveandflush
        return taskRepository.saveAndFlush(task);
    }
    public boolean existeById(Long id){

        return taskRepository.existsById(id);
    }
    public void deleteTask(Long id){

        taskRepository.deleteById(id);
    }

}
