package se.novare.article.news.articles;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
    @Service
    public class DevService {
    @Autowired
    private static Long idCounter=1L;
        private static List<devnews> taskList=new ArrayList();
        static
        {
            taskList.add(new devnews(1L,"10 reasons to learn Spring","GOod book","Astrid Lingren"));
            taskList.add(new devnews(2L,"Adventure books","Interesting","hema"));
        }
        public List<devnews>getAll()
        {
            return taskList;
        }
        public Optional <devnews>getById( Long id)

        {
            return  taskList.stream()
                    .filter(t->t.getId().equals(id))
                    .findFirst();

        }
        public devnews create(devnews newTask)
        {
           add(newTask);
          return newTask;
        }
        static private boolean add(devnews newTask)

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




