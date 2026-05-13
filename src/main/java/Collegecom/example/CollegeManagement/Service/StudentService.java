package Collegecom.example.CollegeManagement.Service;

import Collegecom.example.CollegeManagement.Entity.Student;
import Collegecom.example.CollegeManagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository Studentrepo ;


        Page<Student> objPage = Studentrepo.findAll(PageRequest.of(0,10));

       // String objSorted = Studentrepo.findAll(Sort.by("priority")).asscending();

    public Student save(Student student){
        return Studentrepo.save(student);
    }

    public List<Student> getall(){
        System.out.println(objPage);
        return Studentrepo.findAll();
    }

    public Student get(Long id){
        return Studentrepo.findById(id).orElseThrow(null);
    }

    public Student update(Long id , Student student){
        Student old = Studentrepo.findById(id).orElseThrow(null);
        if(old == null) return null;
        old.setName(student.getName());
        old.setEmail(student.getEmail());
        old.setPhone(student.getPhone());
        return Studentrepo.save(old);
    }

    public void delete(Long id){
         Studentrepo.deleteById(id);
    }
}
