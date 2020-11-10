package se.novare.article.todo.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {
    //private static List<Task>taskList=new ArrayList();
@Autowired

private TaskService taskService=new TaskService();

            @GetMapping("/tasks")
            public List<Task>getAll(@RequestParam String sort)
    {
        return taskService.getAll((sort));
    }

    //Get a specific task by Id....
    @GetMapping ("tasks/{id}")
    public Task getById(@PathVariable Long id)
    {
        return  taskService.getById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    //Create a task..................
    //pass name and date......
    @PostMapping("/tasks")
    public Task create(@RequestBody Task newTask)
    {
        //We are using Object-typoe....
        //return taskService.create();
        return taskService.create(newTask);

    }
   @DeleteMapping("/tasks/{id}")
    public void delete(@PathVariable Long id)
   {
       taskService.delete(id);
   }

}


