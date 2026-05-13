package Collegecom.example.CollegeManagement.Service;

import Collegecom.example.CollegeManagement.Entity.Department;
import Collegecom.example.CollegeManagement.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository Departmentrepo;

    public Department save(Department department) {
        return Departmentrepo.save(department);
    }

    public List<Department> getAll() {
        return Departmentrepo.findAll();
    }

    public Department get(Long id) {
        return Departmentrepo.findById(id).orElse(null);
    }

    public Department update(Long id, Department department) {
        Department old = Departmentrepo.findById(id).orElse(null);
        if(old == null) return null;
        old.setName(department.getName());
        old.setBuilding(department.getBuilding());
        return Departmentrepo.save(old);
    }

    public void delete(Long id) {
        Departmentrepo.deleteById(id);
    }
}
