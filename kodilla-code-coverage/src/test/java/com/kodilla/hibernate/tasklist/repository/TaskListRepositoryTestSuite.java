package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LISTNAME = "LIST NAME TEST";
    private static final String DESCRIPTION = "DESCRIPTION TEST";

    @Test
    void testFindByListName() {

        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> findTask = taskListRepository.findByListName(listName);

        //Then
        Assertions.assertEquals(1, findTask.size());
        Assertions.assertEquals(LISTNAME, findTask.get(0).getListName());
        Assertions.assertEquals(DESCRIPTION, findTask.get(0).getDescription());

        //CleanUp
        int id = findTask.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
