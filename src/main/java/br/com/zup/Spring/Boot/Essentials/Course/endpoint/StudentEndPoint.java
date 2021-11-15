package br.com.zup.Spring.Boot.Essentials.Course.endpoint;


import br.com.zup.Spring.Boot.Essentials.Course.model.Student;
import br.com.zup.Spring.Boot.Essentials.Course.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDateTime;

import static br.com.zup.Spring.Boot.Essentials.Course.model.Student.studentList;

@RestController
@RequestMapping("students")
public class StudentEndPoint {

    @Autowired
     DateUtil dateUtil;
    @Autowired
    Student student;

    @GetMapping
    public ResponseEntity<?>listAll(){
        System.out.println(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?>getStudentById(@PathVariable("id") int id){
          Student student = new Student();
          student.setId(id);
          int index = studentList.indexOf(id);
          if (index == -1){
              return new ResponseEntity<>(new )
          }




    }
}
