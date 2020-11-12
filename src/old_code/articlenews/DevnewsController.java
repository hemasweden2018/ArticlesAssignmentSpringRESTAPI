package se.novare.article.news.articles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class DevnewsController {
    //private static List<Task>taskList=new ArrayList();
@Autowired

private DevService DevService=new DevService();

            @GetMapping("/articles")
            public List<devnews>getAll()
    {
        return DevService.getAll();
    }

    //Get a specific task by Id....
    @GetMapping ("/articles/{id}")
    public devnews getById(@PathVariable Long id)
    {
        return  DevService.getById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    //Create a task..................
    //pass name and date......
    @PostMapping("/articles")
    public devnews create(@RequestBody devnews newTask)
    {
        //We are using Object-typoe....
        //return taskService.create();
        return DevService.create(newTask);

    }
   @DeleteMapping("/articles/{id}")
    public void delete(@PathVariable Long id)
   {
       DevService.delete(id);
   }
}


