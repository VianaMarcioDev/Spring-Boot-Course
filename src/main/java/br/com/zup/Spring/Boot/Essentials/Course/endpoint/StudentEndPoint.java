package br.com.zup.Spring.Boot.Essentials.Course.endpoint;


import br.com.zup.Spring.Boot.Essentials.Course.model.Student;
import br.com.zup.Spring.Boot.Essentials.Course.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("students")
public class StudentEndPoint {

    @Autowired
     DateUtil dateUtil;

    @GetMapping("/list")
    public List<Student>listAll(){
        System.out.println(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return asList(new Student("Márcio"), new Student("Aldilene"));
    }
}
