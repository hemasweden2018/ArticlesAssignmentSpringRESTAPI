package se.novare.article.todo.tasks;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
    @Service
    public class TaskService {
    @Autowired
    private static Long idCounter=1L;
        private static List<Task> taskList=new ArrayList();
        static
        {
            taskList.add(new Task(1L,"hema","2020.01.09"));
            taskList.add(new Task(2L,"hema11","2021.02.08"));
        }
        public List<Task>getAll(String sort)
        {
            return taskList;
        }

        public Optional <Task> getById( Long id)

        {
            return  taskList.stream()
                    .filter(t->t.getId().equals(id))
                    .findFirst();

        }

        public Task create(Task newTask)
        {
         add(newTask);
          return newTask;
        }
        static private boolean add(Task newTask)

        {
            newTask.setId(idCounter);
            idCounter++;
            return taskList.add(newTask);
        }


        public void delete(Long id) {

            taskList= taskList.stream()
                    .filter(t->!t.getId().equals(id))
                    .collect(Collectors.toList());
        }
    }




