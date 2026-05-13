package Collegecom.example.CollegeManagement.Controller;

import Collegecom.example.CollegeManagement.Entity.Department;
import Collegecom.example.CollegeManagement.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Department")
public class DepartmenntController {

    @Autowired
    private DepartmentService Departmentservice;


    @PostMapping("/add")
    public Department add(@RequestBody Department department) {
        return Departmentservice.save(department);
    }

    @GetMapping("/get")
    public List<Department> all() {
        return Departmentservice.getAll();
    }

    @GetMapping("/get/{id}")
    public Department get(@PathVariable Long id) {
        return Departmentservice.get(id);
    }

    @PutMapping("/update/{id}")
    public Department update(@PathVariable Long id, @RequestBody Department department) {
        return Departmentservice.update(id, department);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        Departmentservice.delete(id);
        return "Department deleted";

    }
}



