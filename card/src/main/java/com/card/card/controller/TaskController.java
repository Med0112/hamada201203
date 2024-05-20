//package com.card.card.controller;
//
//import com.card.card.DTO.CountType;
//import com.card.card.entity.Task;
//import com.card.card.service.TaskService;
//import com.card.card.write.Write;
//import com.card.card.yalo.Check;
//import jakarta.persistence.EntityNotFoundException;
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.List;
//
//@RestController
//@AllArgsConstructor
//@CrossOrigin("*")
//@RequestMapping("/api/v1")
//class TaskController {
//    private TaskService taskService;
//
//    @GetMapping("/task")
//    public List<Task> getTasks() {
//        return taskService.getTasks();
//    }
//
//
//    @GetMapping("/task/{id}")
//    public Task getTask(@PathVariable Long id) {
//
//        return taskService.getTaskById(id).
//        orElseThrow
//        (
//            () -> new EntityNotFoundException("Requested task not found")
//        );
//    }
//    @PostMapping("/task")
//    public Task addTask(@RequestBody Task task){
//
//        Write ocr = new Write();
//        Check yalo = new Check();
//
//        task.setDescription(ocr.runOCR(task.getPathImage()));
//        return  taskService.save(task);
//    }
//    @PutMapping("/task/{id}")
//    public ResponseEntity<?> addTask(@RequestBody Task task,@PathVariable Long id){
//        if(taskService.existeById(id)){
//
//            Task task1 = taskService.getTaskById(id).
//            orElseThrow(
//                    ()->new EntityNotFoundException("Requested task not found")
//            );
//            task1.setPathImage(task.getPathImage());
//            task1.setDescription(task.getDescription());
//
//            taskService.save(task);
//            //returned type Task
//            return ResponseEntity.ok().body(task1);
//        }else{
//            HashMap<String, String> message = new HashMap<>();
//            message.put("message", id + " task not found or matched");
//            //returned type hashmap
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
//        }
//    }
//    @DeleteMapping("task/{id}")
//    public ResponseEntity<?> deleteTask(@PathVariable Long id){
//        if(taskService.existeById(id)){
//            taskService.deleteTask(id);
//            HashMap<String, String> message = new HashMap<>();
//            message.put("message", "Task whith id: "+id + " delete successfully.");
//            //returned type hashmap
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
//
//        }else{
//            HashMap<String, String> message = new HashMap<>();
//            message.put("message", id + " task not found or matched");
//            //returned type hashmap
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
//        }
//    }
//}




//-------------------------------------------------------------------------------------------

package com.card.card.controller;

import com.card.card.DTO.CountType;
import com.card.card.entity.Task;
import com.card.card.service.TaskService;
import com.card.card.write.Write;
import com.card.card.yalo.Check;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class TaskController {
    private TaskService taskService;

    @GetMapping("/task")
    public List<Task> getTasks() {
        return taskService.getTasks();
    }


    @GetMapping("/task/{id}")
    public Task getTask(@PathVariable Long id) {

        return taskService.getTaskById(id).
                orElseThrow
                        (
                                () -> new EntityNotFoundException("Requested task not found")
                        );
    }
    @PostMapping("/task")
    public Task addTask(@RequestBody Task task){

        Write ocr = new Write();
        Check yalo = new Check();
        // yalo.checkYalo(task.getPathImage());
        boolean valid = yalo.checkYalo(task.getPathImage());
        System.out.println(">>>>>>>>>>>>>>  "+valid);
        if(valid == true){
            task.setDescription(ocr.runOCR(task.getPathImage()));
            return  taskService.save(task);
        }else{
            String message =null;
            message="The Image is not ID_Card";
            task.setDescription(message);
            return task;
        }
    }
    @PutMapping("/task/{id}")
    public ResponseEntity<?> addTask(@RequestBody Task task,@PathVariable Long id){
        if(taskService.existeById(id)){

            Task task1 = taskService.getTaskById(id).
                    orElseThrow(
                            ()->new EntityNotFoundException("Requested task not found")
                    );
            task1.setPathImage(task.getPathImage());
            task1.setDescription(task.getDescription());

            taskService.save(task);
            //returned type Task
            return ResponseEntity.ok().body(task1);
        }else{
            HashMap<String, String> message = new HashMap<>();
            message.put("message", id + " task not found or matched");
            //returned type hashmap
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }
    @DeleteMapping("task/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Long id){
        if(taskService.existeById(id)){
            taskService.deleteTask(id);
            HashMap<String, String> message = new HashMap<>();
            message.put("message", "Task whith id: "+id + " delete successfully.");
            //returned type hashmap
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);

        }else{
            HashMap<String, String> message = new HashMap<>();
            message.put("message", id + " task not found or matched");
            //returned type hashmap
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }
}