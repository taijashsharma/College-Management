package Collegecom.example.CollegeManagement.Controller;

import Collegecom.example.CollegeManagement.Entity.Student;
import Collegecom.example.CollegeManagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    private StudentService Stuservice;

    @PostMapping("/addStu")
    public Student add(@RequestBody Student student) {
        return Stuservice.save(student);
    }

    @GetMapping("/get")
    public List<Student> all() {
        return Stuservice.getall();
    }

    @GetMapping("/get/{id}")
    public Student get(@PathVariable Long id) {
        return Stuservice.get(id);
    }

    @PutMapping("/update/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        return Stuservice.update(id, student);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        Stuservice.delete(id);
        return "Student deleted";
    }
}
