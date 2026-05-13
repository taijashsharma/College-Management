package Collegecom.example.CollegeManagement.Controller;

import Collegecom.example.CollegeManagement.Entity.Teacher;
import Collegecom.example.CollegeManagement.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Teacher")
public class TeacherController {

    @Autowired
    private TeacherService Teacherservice;


    @PostMapping("/add")
    public Teacher add(@RequestBody Teacher teacher) {
        return Teacherservice.save(teacher);
    }

    @GetMapping("/get")
    public List<Teacher> all() {
        return Teacherservice.getAll();
    }

    @GetMapping("/get/{id}")
    public Teacher get(@PathVariable Long id) {
        return Teacherservice.get(id);
    }

    @PutMapping("/update/{id}")
    public Teacher update(@PathVariable Long id, @RequestBody Teacher teacher) {
        return Teacherservice.update(id, teacher);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        Teacherservice.delete(id);
        return "Teacher deleted";
    }
}

